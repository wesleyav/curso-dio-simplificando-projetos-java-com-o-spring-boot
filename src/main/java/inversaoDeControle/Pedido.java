package inversaoDeControle;

public class Pedido {

	public static void main(String[] args) {

		Pedido pedido = new Pedido();

		pedido.gravar();
	}

	private EnviarEmails enviar = EnviarEmails.obterDadosEmail();

	private void gravar() {
//		this.enviar = new EnviarEmails("stmp", "teste@teste.com", "senha");
		this.enviar.retornar("Pedido criado!");

	}

}
