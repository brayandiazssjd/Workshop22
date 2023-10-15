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
    
    private static final int INPUT_PORT = 5000;
    private static int OUTPUT_PORT = 5001;
    private ServerSocket servin;
    private ServerSocket servout;
    
    public Server () {
        try {
            servin = new ServerSocket(INPUT_PORT);
            servout = new ServerSocket(OUTPUT_PORT);
        
            while (true) {                
                Socket sin = servin.accept();
                Socket out = servout.accept();
                (new ServerThread(sin, out)).start();
            }            
        } catch (Exception e) {
            
        }
    }
    
    public static void main(String[] args) {
        new Server();
    }
}
