package com.org.gen.day14;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
	private Socket socket = null;
	private ServerSocket server = null;
	private DataInputStream in = null;

	public static void main(String args[])
	{
		ServerSide server = new ServerSide(8080);
	}
	
	
	public ServerSide(int port) {
		try{
			server = new ServerSocket(port);
			System.out.println("Server started");
			System.out.println("Waiting for a client ...");
			socket = server.accept();
			
			System.out.println("Client accepted");
			in = new DataInputStream(
					new BufferedInputStream(
							socket.getInputStream()));
			String line = "";
			while(!line.equals("Over"))
			{
				try{
					line = in.readUTF();
					System.out.println(line);
					}catch(IOException i){
						System.out.println(i);
						}
				}
			System.out.println("Closing connection");
			socket.close();
			in.close();
			}
		catch(IOException i)
		{
			System.out.println(i);
		}
	}
	
}
