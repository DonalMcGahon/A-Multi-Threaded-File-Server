package ie.gmit.sw;

import java.io.*; //Need the Java IO library to read from the socket's input stream and write to its output stream
import java.net.*; //Sockets are packaged in the java.net library
import java.util.Scanner; // Scanner for user input

public class Server {
	// Variables
	private static ServerSocket serverSocket;
	static Scanner stdin;
	static String serverConnection = "";
    private static Socket clientSocket = null;
	
    	// Main
		public static void main(String[] args) throws IOException {
			
			
			 try {
		            serverSocket = new ServerSocket(7777);// Port number is 7777
		            System.out.println("Server started.");// Printed out when server has started
		        } catch (Exception e) {
		            System.err.println("Port already in use.");
		            System.exit(1); // If port is already been used it will be caught and exited
		        }
			 
			 while (true) {
		            try {
		                clientSocket = serverSocket.accept(); // Accepting the client port
		                System.out.println("Accepted connection : " + clientSocket);

		            }// End of Try
		            catch (Exception e) {
		                System.err.println("Error in connection attempt.");// If an error happens with connection
		                
		            }// End of Catch
		        }// End of While
			
		}// End of Main

}// End of Server
