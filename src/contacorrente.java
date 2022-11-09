
public class contacorrente extends Conta {
	public contacorrente(Cliente cliente) {
		super(cliente);
	}
	
	
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta corrente ===");
		super.imprimirInfosComuns();
	}

	
}	

