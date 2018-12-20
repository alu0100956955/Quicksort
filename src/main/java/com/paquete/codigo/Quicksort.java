package com.paquete.codigo;

//import src.main.java.Quicksort;

/**
 * 
 * @author José Del Castillo González
 *
 */
public class Quicksort  {

	private int[] numbers;
	private int number;


	/**
	 * @brief 
	 * @param values ha ordenar
	 */
	public void sort(int[] values) {
		if (values ==null || values.length==0){	// Check for empty or null array
			return;
		}
		this.numbers = values;
		number = values.length;
		quicksort(0, number - 1);
	}

	/**
	 * @brief algoritmo para ordenar el vector
	 * @param low	el primer valor del vector
	 * @param high	el ultimo valor del valor
	 */
	private void quicksort(int low, int high) {

		int i = low, j = high;
		int pivot = numbers[low + (high-low) / 2];	// Get the pivot element from the middle of the list

		// Divide into two lists
		while (i <= j) {
			// If the current value from the left list is smaller then the pivot
			// element then get the next element from the left list
			while (numbers[i] < pivot) {
				i++;
			}
			// If the current value from the right list is larger then the pivot
			// element then get the next element from the right list
			while (numbers[j] > pivot) {
				j--;
			}
			// If we have found a values in the left list which is larger then
			// the pivot element and if we have found a value in the right list
			// which is smaller then the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		// Recursion
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}


	/**
	 * @brief cambia el valor de
	 * @param i posicion i del vector
	 * @param j posicion j del vector
	 */
	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
	
	
	// un Main para probar el algoritmo
	public static void main(String a[]){
        
        Quicksort aux = new Quicksort();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        aux.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }

}