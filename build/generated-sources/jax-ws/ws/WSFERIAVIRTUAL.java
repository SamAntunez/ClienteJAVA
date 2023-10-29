
package ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSFERIAVIRTUAL", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/WEBSERVICEFERIAVIRTUAL/WSFERIAVIRTUAL?WSDL")
public class WSFERIAVIRTUAL
    extends Service
{

    private final static URL WSFERIAVIRTUAL_WSDL_LOCATION;
    private final static WebServiceException WSFERIAVIRTUAL_EXCEPTION;
    private final static QName WSFERIAVIRTUAL_QNAME = new QName("http://ws/", "WSFERIAVIRTUAL");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WEBSERVICEFERIAVIRTUAL/WSFERIAVIRTUAL?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSFERIAVIRTUAL_WSDL_LOCATION = url;
        WSFERIAVIRTUAL_EXCEPTION = e;
    }

    public WSFERIAVIRTUAL() {
        super(__getWsdlLocation(), WSFERIAVIRTUAL_QNAME);
    }

    public WSFERIAVIRTUAL(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSFERIAVIRTUAL_QNAME, features);
    }

    public WSFERIAVIRTUAL(URL wsdlLocation) {
        super(wsdlLocation, WSFERIAVIRTUAL_QNAME);
    }

    public WSFERIAVIRTUAL(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSFERIAVIRTUAL_QNAME, features);
    }

    public WSFERIAVIRTUAL(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSFERIAVIRTUAL(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebServiceFV
     */
    @WebEndpoint(name = "WebServiceFVPort")
    public WebServiceFV getWebServiceFVPort() {
        return super.getPort(new QName("http://ws/", "WebServiceFVPort"), WebServiceFV.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceFV
     */
    @WebEndpoint(name = "WebServiceFVPort")
    public WebServiceFV getWebServiceFVPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "WebServiceFVPort"), WebServiceFV.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSFERIAVIRTUAL_EXCEPTION!= null) {
            throw WSFERIAVIRTUAL_EXCEPTION;
        }
        return WSFERIAVIRTUAL_WSDL_LOCATION;
    }

}
