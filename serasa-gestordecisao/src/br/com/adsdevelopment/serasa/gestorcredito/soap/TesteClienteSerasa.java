package br.com.adsdevelopment.serasa.gestorcredito.soap;

public class TesteClienteSerasa {

	public static void main(String[] args) {

		WsgestordecisaoSoap cliente = new Wsgestordecisao().getWsgestordecisaoSoap();
		String resultado = cliente.analisarCredito(null, null, null, null, null, null, 0, null, false, false, null);
		System.out.println(resultado);
	}

}
