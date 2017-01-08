package ie.gmit.sw;

import java.util.Date;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Request implements Serializable{
	// Variables
	private String command;
	private String ipaddress;
	private Date d;
	
	// Getters and Setters
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getTest() {
		return ipaddress;
	}
	public void setTest(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}

}
