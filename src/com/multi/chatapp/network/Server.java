package com.multi.chatapp.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import com.multi.chatapp.utils.ConfigReader;
public class Server{
	ServerSocket serverSocket;
	ArrayList<ServerWorker> workers = new ArrayList<>();// store the detail of serverWorker 
	public Server() throws IOException{
		int port = Integer.parseInt(ConfigReader.getValue("portno"));
		serverSocket = new ServerSocket(port);  //running the server to given port number;
		System.out.println("Server started and wating for the Client to join");
		handleClientRequest();
	}
	
	
	 public void handleClientRequest() throws IOException {
            while(true) {  		  
			Socket clientSocket = serverSocket.accept();
			// per worker per thread
			//thread creation
			ServerWorker serverworker = new ServerWorker(clientSocket, this); //create thread and pass the object of server to thread
			workers.add(serverworker);
			serverworker.start();
            }	 
      }
	
    public static void main(String[] args) throws IOException
    {
    	Server server = new Server();
    }
}
