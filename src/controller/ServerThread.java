/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author braya
 */
public class ServerThread extends Thread {

    private Socket soc;
    private PrintWriter out;
    private BufferedReader in;

    public ServerThread(Socket soc) {
        this.soc = soc;

        try {
            initCommunication();

        } catch (IOException e) {
        }
    }

    private void initCommunication () throws IOException {
        in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        out = new PrintWriter(soc.getOutputStream(), true);

    }
    
    @Override
    public void run() {
        while (true) {
            try {
                String input = in.readLine();
                out.println(input);
            } catch (IOException ex) {
                Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
