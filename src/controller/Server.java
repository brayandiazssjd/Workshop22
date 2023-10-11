/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.net.ServerSocket;

/**
 *
 * @author Estudiantes
 */
public class Server {
    private ServerSocket ss;
    private int PORT = 5000;
    
    public Server () {
        try {
            ss = new ServerSocket(PORT);
            
        } catch (Exception e) {
            
        }
    }
}
