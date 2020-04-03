public class Calculadora2{

	int valorA = 10;
	int valorB = 5;

	int resultado = 0;


	/*
		Criar duas fun��es uma para somar e outra para subtrair

		No metodo MAIN chamar primeiro a subtracao e depois a soma
	*/


	public void soma(){
		resultado = valorA + valorB;
	}

	public void subtracao(){
		resultado = valorA - valorB;
	}

	public static void main(String args[]){

		Calculadora2 calc = new Calculadora2();
		calc.subtracao();

		System.out.println("ValorA: "+calc.valorA);
		System.out.println("ValorB: "+calc.valorB);
		System.out.println("Resultado: "+calc.resultado);

		calc.soma();

		System.out.println("ValorA: "+calc.valorA);
		System.out.println("ValorB: "+calc.valorB);
		System.out.println("Resultado: "+calc.resultado);
	}

}
