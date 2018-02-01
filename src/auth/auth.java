/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth;

/**
 *
 * @author afrikannerd <afrikannerd@gmail.com>
 */
import core.DB;
public class auth 
{
    private static DB link;
    public auth()
    {
        link = DB.getInstance();
    }
    
    
    
    public static void main(String ... args)
    {
        link.getCon();
    }
}
