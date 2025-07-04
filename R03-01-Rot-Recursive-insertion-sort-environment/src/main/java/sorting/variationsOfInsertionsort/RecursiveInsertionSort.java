package sorting.variationsOfInsertionsort;

import sorting.AbstractSorting;

import util.Util;


public class RecursiveInsertionSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	/**
	 * Implementacaoo RECURSIVA do insertion sort. Para isso, tente definir o 
	 * caso base do algoritmo e depois o caso recursivo, que reduz o problema 
	 * para uma entrada menor em uma chamada recursiva. Seu algoritmo deve 
	 * ter complexidade quadratica O(n^2).
	 * 
	 * Restrições:
	 *  - voce NAO pode utilizar array auxiliar
	 *  - voce pode utilizar variaveis temporarias
	 *  - voce NAO pode declarar novos atributos na classe
	 *  - para as trocas no array, utilize o metodo Util.swap
	 */
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		
		if(leftIndex > rightIndex || rightIndex >= array.length){return;}

		int j = leftIndex;
		
		sort(array, leftIndex, rightIndex - 1);

		while (j > leftIndex && array[j].compareTo(array[j-1])<0) {
			Util.swap(array, j, j-1);
			j--;
		}

		
	}

	public static void main(String[] args) {
		
		RecursiveInsertionSort r = new RecursiveInsertionSort<>();

		Integer[]array  = {1,2,6,9,7};

		r.sort(array, 0, 5);

		System.out.println(array);
	}

}
