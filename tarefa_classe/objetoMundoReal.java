package tarefa_classe;

public class objetoMundoReal {

	public static void main(String[] args) {
		
		
		Cliente c = new Cliente();
		c.nome ="Henrique Bendzius";
		c.altura = 1.80;
		c.peso =  80.5;
		
		System.out.println(c.getDados());
		System.out.println(c.calcularImc());
		System.out.println(c.verificarSituacao());
		
		

	}

}
