/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Estudiantes
 */
public class Server {
    private static final int PORT = 5000;
    private ServerSocket sesoc;
    public Server () {
        try {
            sesoc = new ServerSocket(PORT);
            
            while (true) {                
                Socket soc = sesoc.accept();
                (new ServerThread(soc)).start();
            }           
            
        } catch (Exception e) {
            
        }
    }
    
    public static void main(String[] args) {
        new Server();
    }
}
