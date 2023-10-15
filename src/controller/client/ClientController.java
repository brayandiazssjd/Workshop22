/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiantes
 */
public class ClientController {
    
    /**
     * Fields.
     */
    private static int INPUT_PORT = 5001;
    private static int OUTPUT_PORT = 5000;
    private static final String HOST = "localhost";
    private Socket sin;
    private Socket sout;
    private PrintWriter out;
    private BufferedReader in;
    
    /**
     * Constructor.
     */
    public ClientController () {
        try {
            initCommunication();
            
            BufferedReader kin = new BufferedReader(new InputStreamReader(System.in)); //keyboard input
            
            while (true) {   
                String input = kin.readLine();
                out.println(input);
                System.out.println(in.readLine());
                
            }
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    /**
     * Initialize the inputStream stream channel.
     * @throws IOException 
     */
    private void initCommunication () throws IOException {
        sin = new Socket(HOST, INPUT_PORT);
        sout = new Socket(HOST, OUTPUT_PORT);
        in = new BufferedReader(new InputStreamReader(sin.getInputStream()));        
        out = new PrintWriter(sout.getOutputStream(), true);
    }
    
    public static void main(String[] args) {
        new ClientController();
    }
}
