/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Estudiantes
 */
public class Server {
    private static final int INPUT_PORT = 5000;
    private ServerSocket sesoc;
    public Server () {
        try {
            sesoc = new ServerSocket(INPUT_PORT);
            
            while (true) {                
                Socket soc = sesoc.accept();
                (new ServerThread(soc)).start();
            }           
            
        } catch (Exception e) {
            
        }
    }
}
