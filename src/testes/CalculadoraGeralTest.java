package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import codigos.CalculadoraGeral;

class CalculadoraGeralTeste {

	@Test
	void testSomar1() {
		CalculadoraGeral soma = new CalculadoraGeral();
		double resultado = soma.somar(2, 2);
		double esperado = 4;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testSomar2() {
		CalculadoraGeral soma = new CalculadoraGeral();
		double resultado = soma.somar(6, 2);
		double esperado = 8;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testSomar3() {
		CalculadoraGeral soma = new CalculadoraGeral();
		double resultado = soma.somar(12, 22);
		double esperado = 34;
		assertTrue(resultado == esperado);
	}

	@Test
	void testSomar4() {
		CalculadoraGeral soma = new CalculadoraGeral();
		double resultado = soma.somar(50, 50);
		double esperado = 100;
		assertTrue(resultado == esperado);
	}

	@Test
	void testSomar5() {
		CalculadoraGeral soma = new CalculadoraGeral();
		double resultado = soma.somar(200, 200);
		double esperado = 400;
		assertTrue(resultado == esperado);
	}

	@Test
	void testSubtrair1() {
		CalculadoraGeral subtrair = new CalculadoraGeral();
		double resultado = subtrair.subtrair(2, 2);
		double esperado = 0;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testSubtrair2() {
		CalculadoraGeral subtrair = new CalculadoraGeral();
		double resultado = subtrair.subtrair(20, 2);
		double esperado = 18;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testSubtrair3() {
		CalculadoraGeral subtrair = new CalculadoraGeral();
		double resultado = subtrair.subtrair(200, 40);
		double esperado = 160;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testSubtrair4() {
		CalculadoraGeral subtrair = new CalculadoraGeral();
		double resultado = subtrair.subtrair(350, 300);
		double esperado = 50;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testSubtrair5() {
		CalculadoraGeral subtrair = new CalculadoraGeral();
		double resultado = subtrair.subtrair(150, 2);
		double esperado = 148;
		assertTrue(resultado == esperado);
	}

	@Test
	void testMultiplicar1() {
		CalculadoraGeral multiplicar = new CalculadoraGeral();
		double resultado = multiplicar.multiplicar(150, 2);
		double esperado = 300;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testMultiplicar2() {
		CalculadoraGeral multiplicar = new CalculadoraGeral();
		double resultado = multiplicar.multiplicar(150, 3);
		double esperado = 450;
		assertTrue(resultado == esperado);
	}

	@Test
	void testMultiplicar3() {
		CalculadoraGeral multiplicar = new CalculadoraGeral();
		double resultado = multiplicar.multiplicar(180, 5);
		double esperado = 900;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testMultiplicar4() {
		CalculadoraGeral multiplicar = new CalculadoraGeral();
		double resultado = multiplicar.multiplicar(160, 2);
		double esperado = 320;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testMultiplicar5() {
		CalculadoraGeral multiplicar = new CalculadoraGeral();
		double resultado = multiplicar.multiplicar(250, 2);
		double esperado = 500;
		assertTrue(resultado == esperado);
	}

	@Test
	void testDividir1() {
		CalculadoraGeral dividir = new CalculadoraGeral();
		double resultado = dividir.dividir(4, 2);
		double esperado = 2;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testDividir2() {
		CalculadoraGeral dividir = new CalculadoraGeral();
		double resultado = dividir.dividir(8, 2);
		double esperado = 4;
		assertTrue(resultado == esperado);
	}

	@Test
	void testDividir3() {
		CalculadoraGeral dividir = new CalculadoraGeral();
		double resultado = dividir.dividir(24, 2);
		double esperado = 12;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testDividir4() {
		CalculadoraGeral dividir = new CalculadoraGeral();
		double resultado = dividir.dividir(33, 3);
		double esperado = 11;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testDividir5() {
		CalculadoraGeral dividir = new CalculadoraGeral();
		double resultado = dividir.dividir(300, 3);
		double esperado = 100;
		assertTrue(resultado == esperado);
	}

}