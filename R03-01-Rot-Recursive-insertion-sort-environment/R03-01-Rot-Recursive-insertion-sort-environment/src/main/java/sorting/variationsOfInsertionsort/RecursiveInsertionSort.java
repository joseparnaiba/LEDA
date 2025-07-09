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
		
		/*if(array == null || leftIndex < 0 || leftIndex >= rightIndex || rightIndex >= array.length){
			return;
		}*/

        if ((leftIndex < rightIndex) && (0 <= leftIndex) && (rightIndex < array.length)) {
            sort(array, leftIndex, rightIndex - 1);
            troca(array, leftIndex, rightIndex);
        }
		//int i = rightIndex;
    	//erro não pode usar loço
		//while (i > leftIndex && array[i].compareTo(array[i - 1]) < 0) {
        //	Util.swap(array, i, i - 1);
        //	i--;
    	//}
	}
	private void troca(T[] array, int inicio, int fim){
		if ((inicio < fim) && (array[fim-1].compareTo(array[inicio])>0)) {
			Util.swap(array,fim-1,inicio);
			troca(array, inicio, fim-1);
		}
	}
	
}
