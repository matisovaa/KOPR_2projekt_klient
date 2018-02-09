
package server;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "NepodariloSaVyrobitPrezencnuListinu", targetNamespace = "http://server/")
public class NepodariloSaVyrobitPrezencnuListinuException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SimpleExceptionBean faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public NepodariloSaVyrobitPrezencnuListinuException(String message, SimpleExceptionBean faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public NepodariloSaVyrobitPrezencnuListinuException(String message, SimpleExceptionBean faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: server.SimpleExceptionBean
     */
    public SimpleExceptionBean getFaultInfo() {
        return faultInfo;
    }

}
