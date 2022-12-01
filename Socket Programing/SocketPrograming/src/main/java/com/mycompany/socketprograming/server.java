
package com.mycompany.socketprograming;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;


public class server {
    public static void main(String[]args) throws IOException{
        ServerSocket ss = new ServerSocket(5432);  
        System.out.println("Server is waiting for the client");
        Socket s=ss.accept();
        System.out.println("Client Request Accept");
        
        DataInputStream input= new DataInputStream(s.getInputStream());
        
        String str="";
        while(!str.equals("Bye")){
        
                str=input.readUTF();
                System.out.println("Client says :" +str);
  
    }
        input.close();
        s.close();
        ss.close();
}

}


