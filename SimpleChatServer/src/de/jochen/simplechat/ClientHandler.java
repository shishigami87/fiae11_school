package de.jochen.simplechat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler extends Thread {

	private SimpleChatServer chatServer;
	private Socket clientSocket;
	private BufferedReader reader;
	private PrintWriter writer;

	public ClientHandler(Socket clientSocket, SimpleChatServer chatServer) {
		try {
			setChatServer(chatServer);
			setClientSocket(clientSocket);
			setReader(new BufferedReader(new InputStreamReader(getClientSocket().getInputStream())));
			setWriter(new PrintWriter(getClientSocket().getOutputStream()));
			getChatServer().addClientHandler(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			String message;
			while ((message = reader.readLine()) != null) {
				getChatServer().broadcast(message);
			}
			super.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void send(String message) {
		writer.println(message);
		writer.flush();
	}

	public SimpleChatServer getChatServer() {
		return chatServer;
	}

	public void setChatServer(SimpleChatServer chatServer) {
		this.chatServer = chatServer;
	}

	public Socket getClientSocket() {
		return clientSocket;
	}

	public void setClientSocket(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}

	public BufferedReader getReader() {
		return reader;
	}

	public void setReader(BufferedReader reader) {
		this.reader = reader;
	}

	public PrintWriter getWriter() {
		return writer;
	}

	public void setWriter(PrintWriter writer) {
		this.writer = writer;
	}

}
