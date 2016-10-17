package webserviceclient;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import hello.world.HelloWorld;



@SpringBootApplication
public class Application {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://ec2-54-162-115-190.compute-1.amazonaws.com:8181/HelloWorldService/hello?wsdl");

        QName qname = new QName("http://freelance.test.com/", "HelloWorldImplService");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

        System.out.println(hello.greetWorld("to vivek"));
	}

	
}