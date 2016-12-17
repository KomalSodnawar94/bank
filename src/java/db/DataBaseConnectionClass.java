/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




/**
 *
 * @author aasksoft
 */
public class DataBaseConnectionClass {
    public  Connection connection=null;
    public  ResultSet resultSet=null;
    public  Statement statement=null;
    db.NewClass ns=new db.NewClass();
    //Create method for make connection to mysql database
    public boolean setConnection()
    {
        try
        {
            if(ns.main()!=1)
            {
                return false;
            }
            else
            {
                Class.forName("com.mysql.jdbc.Driver");
                connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
                return true;
                
            }
        }catch (ClassNotFoundException | SQLException Ex)
        {
            System.out.println(Ex.getMessage());
            return false;
        }
    }//End setConnection Method
    //Insert Values inot DataBase
    public boolean insertData(String sql)
    {
       if(this.setConnection()==true)
       {
           try
           {
               statement=(Statement) connection.createStatement();
               statement.executeUpdate(sql);
               return true;
           }catch(Exception ex)
           {
               return false;
           }
       }
        return false;
    }//End InsertData(Sql);
    
    //Update Values inot DataBase
    public boolean updateData(String sql)//sql is Query
    {
        if(this.setConnection()==true)
       {
           try
           {
               statement=(Statement) connection.createStatement();
               statement.executeUpdate(sql);
               return true;
           }catch(Exception ex)
           {
               return false;
           }
       }
        return false;
    }//End updateData(Sql);
    
    //Delete Values inot DataBase
    public boolean deleteData(String sql)
    {
        if(this.setConnection()==true)
       {
           try
           {
               statement=(Statement) connection.createStatement();
               statement.executeUpdate(sql);
               return true;
           }catch(Exception ex)
           {
               return false;
           }
       }
        return false;
    }//End deleteData(Sql);
    //select all data form table
    public ResultSet selectData(String sql)
    {
        try
           {
               if(setConnection())
               {
                   statement=(Statement) connection.createStatement();
                   resultSet=statement.executeQuery(sql);
                   return resultSet;
               }
               
              
           }catch(Exception ex)
           {
               System.out.print(ex.getMessage());
           }
        return null;
    }
  
  
}
