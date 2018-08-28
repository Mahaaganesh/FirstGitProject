package com.pointel.demo;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.mkyong.ws.HelloWorld;
public class ClientService {
	public static void main(String[] args) throws Exception {
		   
		URL url = new URL("http://192.168.1.103:9999/ws/hello?wsdl");
		
	        //1st argument service URI, refer to wsdl document above
		//2nd argument is service name, refer to wsdl document above
	        QName qname = new QName("http://ws.mkyong.com/", "HelloWorldImplService");

	        Service service = Service.create(url, qname);

	        HelloWorld hello = service.getPort(HelloWorld.class);

	        System.out.println(hello.getHelloWorldAsString("mkyong"));

	    }
}
