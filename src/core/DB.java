/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.sql.Connection;

/**
 *
 * @author afrikannerd <afrikannerd@gmail.com>
 */
public  class DB {
    private volatile static DB link = null;
    
    
    public static  DB getInstance()
    {
        
       if(link == null)
       {
           synchronized(DB.class)
           {
               if(link == null)
               {
                   link = new DB();
               }
           }
       }
       return link;
    }
    
    public static Connection getCon()
    {
        Class driver = null;
        try
        {
            driver = Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        System.out.println("Found driver"+driver);
        return null;
    }
    
    private DB()
    {
        DB.getCon();
    }
    
    
}
