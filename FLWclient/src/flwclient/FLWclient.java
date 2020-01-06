/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flwclient;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JFrame;

/**
 *
 * @author n3t
 */
public class FLWclient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        JFrame frame = new JFrame("FLW wallet");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setVisible(true);
        frame.setLayout(null);
        
        // connect to server
        try {
         InetAddress addr;
         Socket sock = new Socket("localhost", 3333);
         addr = sock.getInetAddress();
         System.out.println("Connected to " + addr);
         sock.close();
      } catch (java.io.IOException e) {
         System.out.println("Can't connect to " + args[0]);
         System.out.println(e);
      }
        
    }
    
}
