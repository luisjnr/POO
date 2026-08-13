public class Paciente {
	String nome, sexo;
	Double peso = 0.0, altura = 0.0;
	
	public Paciente(String nome, String sexo, Double peso, Double altura){
		this.nome = nome;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Double calcularIMC(){
		Double imc = this.peso / (this.altura * this.altura);
		return Math.round(imc * 10.0) / 10.0;
	}
}
