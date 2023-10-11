/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.client;

import java.net.Socket;

/**
 *
 * @author Estudiantes
 */
public class ClientController {
    private int PORT = 5000;
    private String HOST = "localhost";
    private Socket soc;
    
    public ClientController () {
        try {
            soc = new Socket(HOST, PORT);
        } catch (Exception e) {
        }
    }
    
    public void myFunc(int number) {
        System.out.println(number);
    }
    
    public static void main(String[] args) {
        new ClientController();
        int number = in.readLine();
        Thread t = new Thread (() -> myFunc(number));
        t.s
    }
    
    
}
