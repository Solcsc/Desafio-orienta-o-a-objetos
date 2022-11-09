
public class contapoupança extends Conta{
	public contapoupança(Cliente cliente) {
		super(cliente);
	}
	
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta poupança ===");
		super.imprimirInfosComuns();
	}
}
	

