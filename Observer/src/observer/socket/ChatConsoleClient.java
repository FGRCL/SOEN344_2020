package observer.socket;

import java.io.*;
import java.net.Socket;
import java.util.Observable;
import java.util.Observer;

public class ChatConsoleClient{
	private Socket socket;
	private OutputStream outputStream;
	
	public static void main(String[] args) {
		String server = "127.0.0.1";
		int port = 2222;
		ChatAccess chatAccess = new ChatAccess();
		ChatConsole chatConsole = new ChatConsole(chatAccess);
		
		try {
			chatAccess.initSocket(server,port);
		} catch (IOException ex) {
			System.out.println("Cannot connect to " + server + ":" + port);
			ex.printStackTrace();
			System.exit(0);
		}
		
		chatConsole.run();
	}

}
