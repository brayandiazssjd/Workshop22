/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
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
    private static final int OUTPUT_PORT = 5000;
    private static final int INPUT_PORT = 5001;
    private static final String HOST = "localhost";
    private Socket sout;
    private Socket sin;
    private ServerSocket sesoc;
    private PrintWriter out;
    private BufferedReader in;
    
    /**
     * Constructor.
     */
    public ClientController () {
        try {
            initOutput();
            initInput();
            
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
    private void initInput () throws IOException {
        sesoc = new ServerSocket(INPUT_PORT);
        sin = sesoc.accept();
        in = new BufferedReader(new InputStreamReader(sin.getInputStream()));        
    }
    
    /**
     * Initialize the output stream channel.
     * @throws IOException 
     */
    private void initOutput () throws IOException {
        sout = new Socket(HOST, OUTPUT_PORT);
        out = new PrintWriter(sout.getOutputStream(), true);
    }
    
    public static void main(String[] args) {
        new ClientController();
    }
}
