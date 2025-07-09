package sorting.variationsOfSelectionsort;

import sorting.AbstractSorting;
import util.Util;

public class RecursiveSelectionSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	/**
	 * Implementação recursiva do selection sort. Você deve implementar apenas
	 * esse método sem usar nenhum outro método auxiliar (exceto
	 * Util.swap(array,int,int)). Para isso, tente definir o caso base do
	 * algoritmo e depois o caso indutivo, que reduz o problema para uma entrada
	 * menor em uma chamada recursiva. Seu algoritmo deve ter complexidade
	 * quadrática O(n^2).
	 */
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (array != null && array.length > 0 &&
			leftIndex >= 0 && rightIndex < array.length &&
			leftIndex < rightIndex) {

			int indiceMenor = selectMenor(array, leftIndex, leftIndex + 1, rightIndex);
			Util.swap(array, leftIndex, indiceMenor);
			sort(array, leftIndex + 1, rightIndex);
		}
	}

	private int selectMenor(T[] array, int menor, int atual, int fim) {
		if (atual > fim) return menor;

		if (array[atual].compareTo(array[menor]) < 0) {
			menor = atual;
		}

		return selectMenor(array, menor, atual + 1, fim);
	}
}
