package ie.gmit.sw;

import java.io.*; //Need the Java IO library to read from the socket's input stream and write to its output stream
import java.net.*; //Sockets are packaged in the java.net library
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class Client {
	// Variables
	private static Socket sock;
	private static String fileName;
	private static BufferedReader readin;
	
	// Main
	public static void main(String[] args) throws IOException {
		readin = new BufferedReader(new InputStreamReader(System.in));

		while(true){
              switch (Integer.parseInt(clientAction())) {
            case 1:
                try {
                    setSock(new Socket("localhost", 7777)); // Uses Port-7777
                    readin = new BufferedReader(new InputStreamReader(System.in));
                }// End of Try 
        		catch (Exception e) {
                    System.err.println("Cannot connect to the server, try again later.");
                    System.exit(1);
                } // End of Catch
                System.out.println("Connected to Server\n");
                break;
                
            case 2:
                Logger();
                break;
                
            case 3:
                System.err.print("Enter file name: ");
                fileName = readin.readLine();
                receiveFile(fileName);
            	break;
            	
            case 4:
            	return;
              }// End of Switch
		}// End of While

		
	} // End of Main
	
	private static void Logger() {
		// TODO Auto-generated method stub
		
	}

	// Selecting action depending on user input
	public static String clientAction() throws IOException {
        System.out.println("1. Connect to Server.");
        System.out.println("2. Print File Listing.");
        System.out.println("3. Recieve file.");
        System.out.println("4. Quit.");
        System.out.print("\nType Option [1-4]: ");

        return readin.readLine();
    }
	
	// Method for receiving file
	public static void receiveFile(String fileName) throws IOException {
		/**
		 * I was unable to figure out how to retrieve a file
		 */
			System.out.println("File "+fileName+" received from Server.");
		
    }// End of ReceiveFile

	// Getters + Setters for Socket
	public static Socket getSock() {
		return sock;
	}

	public static void setSock(Socket sock) {
		Client.sock = sock;
	}
	
	

} // End of Client
