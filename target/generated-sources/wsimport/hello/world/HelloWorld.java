
package hello.world;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorld", targetNamespace = "http://freelance.test.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWorld {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://freelance.test.com/HelloWorld/greetWorldRequest", output = "http://freelance.test.com/HelloWorld/greetWorldResponse")
    public String greetWorld(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}
