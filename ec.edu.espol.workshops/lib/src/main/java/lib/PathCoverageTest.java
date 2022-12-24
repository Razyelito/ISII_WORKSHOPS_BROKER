package lib;

import static org.junit.Assert.*;



import org.junit.Test;

import lib.Carlnsurance;

public class PathCoverageTest {

	@Test
	public void test() {
		
		
		
		Carlnsurance prueba1 = new Carlnsurance (25,"M","N");// licencia si
		System.out.println(prueba1.calcularInsurance("Valido"));
		
		
		
		Carlnsurance prueba2 = new Carlnsurance (17,"F","Y");// licencia no
		System.out.println(prueba2.calcularInsurance("No Valido"));
		
		
		Carlnsurance prueba3 = new Carlnsurance (26,"F","Y");// licencia si
		System.out.println(prueba3.calcularInsurance("Valido"));
		
		
		Carlnsurance prueba4 = new Carlnsurance (46,"F","Y");// licencia si
		System.out.println(prueba4.calcularInsurance("Valido"));
		
		
		  
		
		Carlnsurance prueba5 = new Carlnsurance (46,"M","Y");// licencia si
		System.out.println(prueba5.calcularInsurance("Valido"));
		
		
		
		
		
		
		// extra cases for 100 Coverage

		Carlnsurance prueba6 = new Carlnsurance (46,"M","N");// licencia si
		System.out.println(prueba6.calcularInsurance("Valido"));
		
		
		Carlnsurance prueba7 = new Carlnsurance (50,"M","Y");// licencia si
		System.out.println(prueba7.calcularInsurance("Valido"));
		
						
		
		Carlnsurance prueba8 = new Carlnsurance (81,"M","N");// licencia si
		System.out.println(prueba8.calcularInsurance("Valido"));
		
		Carlnsurance prueba10 = new Carlnsurance (16,"M","N");// licencia si
		System.out.println(prueba10.calcularInsurance("Valido"));	
		
		Carlnsurance prueba11 = new Carlnsurance (24,"M","N");// licencia si
		System.out.println(prueba11.calcularInsurance("Valido"));
		
		Carlnsurance prueba12 = new Carlnsurance (46,"F","N");// licencia si
		System.out.println(prueba12.calcularInsurance("Valido"));
		
	
		
		
	}
}
