package br.com.adsdevelopment.serasa.gestorcredito.soap;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class TesteClienteSerasa {

	public static void main(String[] args) throws MalformedURLException {

//		WsgestordecisaoSoap cliente = new Wsgestordecisao().getWsgestordecisaoSoap();
//		String resultado = cliente.analisarCredito(null, "", "", "xxxx", "xxxx", "75390989023", 10, null, false, false, null);
//		System.out.println("Retorno: " + resultado);
		
		String nsURI = "https://sitenet05.serasa.com.br/wsgestordecisao/wsgestordecisao";
		String localPart = "wsgestordecisao";
		
		URL url = new URL("https://sitenet05.serasa.com.br/wsgestordecisao/wsgestordecisao.asmx?wsdl");
		//URL url = new URL("https://gw-homologa.serasa.com.br/wsgestordecisao/wsgestordecisao.asmx?wsdl");
        QName qname = new QName(nsURI, localPart);

        Service service = Service.create(url, qname);
        
        WsgestordecisaoSoap cliente = service.getPort(WsgestordecisaoSoap.class);
        String resultado = cliente.analisarCredito(null, "", "", "xxxx", "xxxx", "75390989023", 10, null, false, false, null);
        System.out.println("Retorno: " + resultado);
	}

}