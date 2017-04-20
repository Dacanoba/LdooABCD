/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitis;

import java.sql.Connection;
import java.sql.DriverManager;
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
     
     public void Register(String uName, String pWord) throws SQLException{
         
         if(uName.length()>50 || uName.length()==0 || pWord.length() ==0 || pWord.length()>50){
             return;
         }
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Calendar cal = Calendar.getInstance();
                String fecha = dateFormat.format(cal.getTime());
         this.pWord=pWord;
         this.uName=uName;
         abrirConexion();
         String insertQuery ="insert into NOTICIAS.ABCDLOGINS "+
                 "(ACCOUNTID,PASS_WORD,ISADMIN,CREATEDDATE,MODIFYDATE,ISENABLE) "+
                 "values ('"+uName+"', '"+pWord+"',false,'"+fecha+"','"+fecha+"',true)";
         Statement stmt=conexion.createStatement();
                   stmt.execute(insertQuery);
                   stmt.close();
         
     }
     
            

    
    
}
