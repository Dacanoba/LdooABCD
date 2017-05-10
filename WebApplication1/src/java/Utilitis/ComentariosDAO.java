/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitis;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import Utilitis.ComentariosPOJO;
import java.io.IOException;
import Utilitis.Connectate;
/**
 *
 * @author Carlos Baruch Mendez Gonzalez 1837476
 */
public class ComentariosDAO {
     
     Connectate conexion = Connectate.getInstance();
                

     
     public ResultSet buscar(ComentariosPOJO valor) throws IOException{
         ResultSet rs = null;
         ResultSet results;
         try{
            Connection conexion =this.conexion.getConnection();
          String query="select imagen,titulo from noticiero";
          Statement stmt=conexion.createStatement();
                    rs=stmt.executeQuery(query);
           while(rs.next()){
               String imagen = rs.getString(1);
               String titulo = rs.getString(2);
               ComentariosPOJO resultados = new ComentariosPOJO();
               resultados.setImagen(imagen);
               resultados.setTitulo(titulo);
               //results.
               System.out.println(imagen);
               System.out.println(titulo);
               
           }
           conexion.close();
               return rs;     
         }catch(SQLException ex){
        
             
         }
         return rs;
     }

}
