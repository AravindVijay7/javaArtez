/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artez;
import java.net.*;  
import java.io.*;  
import javax.swing.JOptionPane;
/**
 *
 * @author Aravind
 */
public class Artez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
     public void startServer( )throws Exception {
         do{
           try{  
               String str1;
                ServerSocket ss=new ServerSocket(6666);  
                Socket s=ss.accept();//establishes connection   
               BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                str1 = br.readLine();
                JOptionPane.showMessageDialog(null, str1);
                
                }
           catch(Exception e){JOptionPane.showMessageDialog(null, e);}  
           
     } while (true);             
             
}  
    
 
        
    }

