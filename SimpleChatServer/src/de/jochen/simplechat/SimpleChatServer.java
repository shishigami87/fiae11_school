package de.jochen.simplechat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SimpleChatServer {

	private static final int SERVERPORT = 12000;
	private List<ClientHandler> clients;
	private ServerSocket serverSocket;

	public static void main(String[] args) {
		new SimpleChatServer().initServer();
	}

	private void initServer() {
		try {
			initFields();
			serverSocket = new ServerSocket(getPort());
			while (true) {
				Socket clientSocket = serverSocket.accept();
				new ClientHandler(clientSocket, this).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public synchronized void broadcast(String message) {
		for (ClientHandler client : clients) {
			client.send(message);
		}
	}

	private void initFields() {
		setClients(new ArrayList<ClientHandler>());
	}

	public List<ClientHandler> getClients() {
		return clients;
	}

	public void setClients(List<ClientHandler> clients) {
		this.clients = clients;
	}

	public ServerSocket getServerSocket() {
		return serverSocket;
	}

	public void setServerSocket(ServerSocket serverSocket) {
		this.serverSocket = serverSocket;
	}

	public static int getPort() {
		return SERVERPORT;
	}

	public boolean addClientHandler(ClientHandler arg0) {
		return clients.add(arg0);
	}
}
