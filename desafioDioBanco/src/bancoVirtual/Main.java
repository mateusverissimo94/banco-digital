package bancoVirtual;

public class Main {

	public static void main(String[] args) {
			
		Cliente mateus = new Cliente();
		mateus.setNome("Mateus");
		
		Conta cc = new ContaCorrente(mateus);
		Conta poupanca = new ContaPoupanca(mateus);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
