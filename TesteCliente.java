package exercicioOrientacaoObjeto;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente novoCliente1 = new Cliente();
		Cliente novoCliente2 = new Cliente();
		
		novoCliente1.setNome("Cicloniudo Genivaldio");
		novoCliente1.setIdade(118);
		novoCliente1.setSexo("Masculino");
		novoCliente1.setPagamento("Ouro");
		novoCliente1.setSaldo(459);
		
		novoCliente2.setNome("Fadaleia Naturale");
		novoCliente2.setIdade(228);
		novoCliente2.setSexo("Feminino");
		novoCliente2.setPagamento("Diamantes");
		novoCliente2.setSaldo(894);
		
		novoCliente1.visualizar();
		novoCliente2.visualizar();
	}
}
