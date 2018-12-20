package com.paquete.codigo;

import static org.junit.Assert.*;

import org.junit.Test;

//import src.test.java.Quicksort;

public class MainTest {

	@Test
	public void test1() {	// prueba con posiciones sueltas
		Quicksort aux = new Quicksort();
		int[] vector1 = {24,2,45,20,56,75,2,56,99,53,12};
		aux.sort(vector1);
		int[] solucion = {2,2,12,20,24,45,53,56,56,75,99};
		assertTrue(vector1[0] == 2);
		assertTrue(vector1[5] == 45);
		assertTrue( vector1 [10] == 99);
	}
	
	@Test
	public void test2() {	// Probando el vector entero 
		Quicksort aux = new Quicksort();
		int[] vector2 = {124,1,285,70,560,757,3,506,999,353,68};
		aux.sort(vector2);
		int[] solucion = {1,3,68,70,124,285,353,506,560,757,999};
		for (int i=0;i<vector2.length ; i++) {
			assertEquals(vector2[i],solucion[i]);
		}
	}	

}
