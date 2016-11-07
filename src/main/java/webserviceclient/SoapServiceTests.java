package webserviceclient;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import hello.world.HelloWorld;


public class SoapServiceTests {

	
		URL uri = null;
		private HelloWorld hello;

       

	 @BeforeClass
	 @Parameters(value={"url"})
	 public void init(String url) throws MalformedURLException{
	
		 uri = new URL(url);
		 QName qname = new QName("http://freelance.test.com/", "HelloWorldImplService");
	     Service service = Service.create(uri, qname);
         hello = service.getPort(HelloWorld.class);
	 }
	 
	 
	 @Test
	 public void testHello(){
		 
		 String greeting = hello.greetWorld(" vivek");
		 
		 Assert.assertEquals("Hello World vivek",greeting);
		 
	 }
	 
	
}