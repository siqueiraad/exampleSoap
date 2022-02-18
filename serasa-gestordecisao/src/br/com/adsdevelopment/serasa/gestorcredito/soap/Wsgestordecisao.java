
package br.com.adsdevelopment.serasa.gestorcredito.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * �ltima atualiza��o em 06/11/2018 22:00hs - Vers�o 5.8.0.0
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "wsgestordecisao", targetNamespace = "https://sitenet05.serasa.com.br/wsgestordecisao/wsgestordecisao", wsdlLocation = "https://sitenet05.serasa.com.br/wsgestordecisao/wsgestordecisao.asmx?wsdl")
public class Wsgestordecisao
    extends Service
{

    private final static URL WSGESTORDECISAO_WSDL_LOCATION;
    private final static WebServiceException WSGESTORDECISAO_EXCEPTION;
    private final static QName WSGESTORDECISAO_QNAME = new QName("https://sitenet05.serasa.com.br/wsgestordecisao/wsgestordecisao", "wsgestordecisao");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://sitenet05.serasa.com.br/wsgestordecisao/wsgestordecisao.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSGESTORDECISAO_WSDL_LOCATION = url;
        WSGESTORDECISAO_EXCEPTION = e;
    }

    public Wsgestordecisao() {
        super(__getWsdlLocation(), WSGESTORDECISAO_QNAME);
    }

    public Wsgestordecisao(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSGESTORDECISAO_QNAME, features);
    }

    public Wsgestordecisao(URL wsdlLocation) {
        super(wsdlLocation, WSGESTORDECISAO_QNAME);
    }

    public Wsgestordecisao(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSGESTORDECISAO_QNAME, features);
    }

    public Wsgestordecisao(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Wsgestordecisao(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsgestordecisaoSoap
     */
    @WebEndpoint(name = "wsgestordecisaoSoap")
    public WsgestordecisaoSoap getWsgestordecisaoSoap() {
        return super.getPort(new QName("https://sitenet05.serasa.com.br/wsgestordecisao/wsgestordecisao", "wsgestordecisaoSoap"), WsgestordecisaoSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsgestordecisaoSoap
     */
    @WebEndpoint(name = "wsgestordecisaoSoap")
    public WsgestordecisaoSoap getWsgestordecisaoSoap(WebServiceFeature... features) {
        return super.getPort(new QName("https://sitenet05.serasa.com.br/wsgestordecisao/wsgestordecisao", "wsgestordecisaoSoap"), WsgestordecisaoSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSGESTORDECISAO_EXCEPTION!= null) {
            throw WSGESTORDECISAO_EXCEPTION;
        }
        return WSGESTORDECISAO_WSDL_LOCATION;
    }

}
