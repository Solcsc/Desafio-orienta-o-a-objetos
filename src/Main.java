
public class Main {

	public static void main(String[] args) {
		Cliente Solange = new Cliente();
		Solange.setNome("Solange");
		
		Conta cc = new contacorrente(Solange);
		 cc.depositar(100);
		 
		Conta poupança = new contapoupança(Solange);
		cc.transferir(100, poupança);
		
		cc.imprimirExtrato();
		poupança.imprimirExtrato();

	}

}
