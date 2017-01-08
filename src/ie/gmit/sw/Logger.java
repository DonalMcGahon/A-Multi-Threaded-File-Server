package ie.gmit.sw;

import java.io.*; //Need the Java IO library to read from the socket's input stream and write to its output stream
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.omg.CORBA.Request;

public class Logger implements Runnable{
	
	private BlockingQueue q;
	private BlockingQueue queue;
	
	// BlockingQueue
	public Logger (BlockingQueue a) throws IOException{
		this.queue = q;
		BlockingQueue <Request> a1 = new ArrayBlockingQueue <>(7);
		new Thread(new Logger (q).start());
		
		FileWriter rw = new FileWriter (new File("stuff.txt"));
	}

	private Runnable start() {
		return null;
	}

	@Override
	public void run() {
		while (true) { 
			try {
				consume(q.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			}
		}

	void consume(Object take) {}
}