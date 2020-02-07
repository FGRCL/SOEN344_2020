package observer.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;
import java.util.Observer;

public class ChatConsole implements Observer, Runnable{
	private ChatAccess chatAccess;
	
	public ChatConsole(ChatAccess chatAccess) {
		chatAccess.addObserver(this);
		this.chatAccess = chatAccess;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		final Object finalArg = arg1;
		System.out.println(arg1);	
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			try {
				chatAccess.send(reader.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
