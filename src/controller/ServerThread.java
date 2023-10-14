/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author braya
 */
public class ServerThread extends Thread {

    private Socket sout;
    private Socket sin;
    private static final int OUTPUT_PORT = 5001;
    private PrintWriter out;
    private BufferedReader in;

    public ServerThread(Socket soc) {
        this.sin = soc;

        try {
            initInput();
            initOutput();

            while (true) {
                String input = in.readLine();
                out.println(input);
            }
        } catch (IOException e) {
        }
    }

    private void initInput() throws IOException {
        in = new BufferedReader(new InputStreamReader(sin.getInputStream()));

    }

    private void initOutput() throws IOException {
        sout = new Socket(sin.getInetAddress(), OUTPUT_PORT);
        out = new PrintWriter(sout.getOutputStream(), true);
    }
}
