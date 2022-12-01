
package com.mycompany.socketprograming;
import java.io.IOException;
import java.net.Socket;
import java.io.DataOutputStream;
import java.util.Scanner;

public class Client {
    public static void main(String[]args) throws IOException{
    Socket s = new Socket("localhost",5432);  
    
        System.out.println("Connected");
        
        DataOutputStream output =new DataOutputStream(s.getOutputStream());
        Scanner scn =new Scanner(System.in);
        
        String str ="";
        while(!str.equals( "Bye")){
            str=scn.nextLine();
            output.writeUTF(str);
        
        }
        
        output.close();
        s.close();
    }
}
