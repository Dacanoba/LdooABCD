/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 *
 * @author mendezgonzalez.9
 */
public class Connector {
    private Connection conexion;
    private String file;
    private  String uName;
    private String pWord;
    private String eMail;
    private static Connector connect;
    private Connector(String conexion){
        this.file= conexion;
        }
    
    public static Connector getConnection(String uName, String pWord) throws SQLException{
        
        if(connect == null){
             
            
           return new Connector("o"); 
       } return connect;
    }
    
     public void abrirConexion() throws SQLException{
         String url = "jdbc:derby://localhost:1527/ABCDNoticias";
         String user = "noticias";
         String password="ABCD";
         conexion = DriverManager.getConnection(url, user, password);
     }
     
     public void Register(String uName, String pWord, String eMail) throws SQLException{
         
         if(uName.length()>50 || uName.length()==0 || pWord.length() ==0 || pWord.length()>50){
             return;
         }
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Calendar cal = Calendar.getInstance();
                String fecha = dateFormat.format(cal.getTime());
         this.pWord=pWord;
         this.uName=uName;
         this.eMail=eMail;
         abrirConexion();
         String insertQuery ="insert into NOTICIAS.ABCDLOGINS "+
                 "(ACCOUNTID,PASS_WORD,EMAIL,ISADMIN,CREATEDDATE,MODIFYDATE,ISENABLE) "+
                 "values ('"+this.uName+"','"+this.pWord+"','"+this.eMail+"',false,'"+fecha+"','"+fecha+"',true)";
         Statement stmt=conexion.createStatement();
                   stmt.execute(insertQuery);
                   stmt.close();
         
     }
     
          public boolean Authenicate(String uName, String pWord) throws SQLException{
         
         if(uName.length()>50 || uName.length()==0 || pWord.length() ==0 || pWord.length()>50){
             return false;
         }
         this.pWord=pWord;
         this.uName=uName;
         abrirConexion();
         String SelectQuery ="SELECT Accountid,Pass_word "
                 +"FROM NOTICIAS.ABCDLOGINS where accountid ='"+this.uName+"'"
                 + " and pass_word= '"+this.pWord+"'";
         Statement stmt=conexion.createStatement();
                   
                  ResultSet rs =stmt.executeQuery(SelectQuery);
              
                  rs.next();
                  String AuthUser =rs.getString(1);
                  String AuthPass =rs.getString(2);
                  
                  if (this.uName.equals(AuthUser) && this.pWord.equals(AuthPass)){
                      stmt.close();
                      return true;
                       
                  }
                   
                    return false;
     }
     

}

