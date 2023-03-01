package tarefa_classe;

public class Cliente {

	String nome;
	double altura;
	double peso;
	
	// m�todo para calcular e retornar o IMC
	public double calcularImc() {
		double imc ;
		imc = peso/ (altura * altura);
		return imc;
		
	}
	// m�todo para calcular e retornar a situa��o do cliente
	public String verificarSituacao() {
		if(calcularImc ()> 25) {
			return "acima do peso";
			
		} 
			return " peso normal";
		}
		
	// m�todo para retornar os dados do cliente
	public String getDados() {
		String aux = "";
		aux += "Nome:" + nome + "\n";
		aux += "atura:" + altura + "\n";
		aux += "peso:" + peso + "\n";
		return aux;
	
	}
	
}
