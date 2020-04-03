public class Calculadora{

	public int valorA = 1;
	public int valorB = 3;
	public int resultado = 0;

	public void soma(){
		resultado = valorA + valorB;
	}

	public static void main(String args[]){

		Calculadora calc; //variavel do tipo calculadora que chama calc - ela chama a minha classe calculadora
		calc = new Calculadora();

		Calculadora calc2; //variavel do tipo calculadora que chama calc - ela chama a minha classe calculadora
		calc2 = new Calculadora();

		calc.valorA = 10; //subscrevi o valor de A antes de chamar a funcao de soma


		System.out.println("ValorA: "+calc.valorA);
		System.out.println("ValorB: "+calc.valorB);
		System.out.println("Resultado: "+calc.resultado);

		calc.soma(); // para ele executar a fun�ao que eu quero tenho que chamar ela no meu programa
		calc2.soma(); // para ele executar a fun�ao que eu quero tenho que chamar ela no meu programa

		System.out.println("ValorA: "+calc.valorA);
		System.out.println("ValorB: "+calc.valorB);
		System.out.println("Resultado: "+calc.resultado);
		System.out.println("-----------------------------------");
		System.out.println("ValorA: "+calc2.valorA);
		System.out.println("ValorB: "+calc2.valorB);
		System.out.println("Resultado: "+calc2.resultado);

	}

}
