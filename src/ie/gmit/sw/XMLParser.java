// Reference to below code <-- https://www.mkyong.com/java/how-to-create-xml-file-in-java-dom/ -->
package ie.gmit.sw;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLParser {
	
	public static void main(String argv[]) {
		
		try{
			
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			
			// root element
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("client-config");
			doc.appendChild(rootElement);
			
			// server-host
			Element serverhost = doc.createElement("server-host");
			serverhost.appendChild(doc.createTextNode("127.0.0.1"));
			
			// server-port
			Element serverport = doc.createElement("server-port");
			serverport.appendChild(doc.createTextNode("7777"));
			
			// download-dir
			Element downloaddir = doc.createElement("download-dir");
			downloaddir.appendChild(doc.createElement("./downlaods"));
			
			// writing content to xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("C:\\gmit-sw2016.xml"));
			
			transformer.transform(source, result);
			
		}//Try
		catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		  } 
		catch (TransformerException tfe) {
			tfe.printStackTrace();
		  }// End of Catch
		
		
		
	} // Main

} // Write to XML