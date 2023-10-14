/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.client;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Estudiantes
 */
public class ClientController {
    private int PORT = 5000;
    private String HOST = "localhost";
    private Socket soc;
    private ServerSocket sesoc;
    private PrintWriter pout;
    private BufferedReader brin;
    
    public ClientController () {
        try {
            soc = new Socket(HOST, PORT);
        } catch (Exception e) {
            
        }
    }
    
    public void setCommunitacion () {
        sesoc = new ServerSocket(5001);
        
    }
    
    public static void main(String[] args) {
        new ClientController();
    }
    
    
}
