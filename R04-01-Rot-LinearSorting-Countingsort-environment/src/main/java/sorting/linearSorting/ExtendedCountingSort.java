package sorting.linearSorting;

import sorting.AbstractSorting;

/**
 * Classe que implementa do Counting Sort vista em sala. Desta vez este
 * algoritmo deve satisfazer os seguitnes requisitos:
 * - Alocar o tamanho minimo possivel para o array de contadores (C)
 * - Ser capaz de ordenar arrays contendo numeros negativos
 */
public class ExtendedCountingSort extends AbstractSorting<Integer> {

	@Override
	public void sort(Integer[] array, int leftIndex, int rightIndex) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet!");
	}
	
	private int maior(Integer[] array, int leftIndex, int rightIndex){
		int maior = array[leftIndex];
		for(int u = leftIndex;u <= rightIndex; u ++){
			if (array[u] > maior) {
				maior =  array[u];
			}
		}
		return maior;
	}
	private int menor(Integer[] array, int leftIndex, int rightIndex){
		int menor = array[leftIndex];
		for(int u = leftIndex;u <= rightIndex; u ++){
			if (array[u] < menor) {
				menor = array[u];
				}
		}
		return menor;
	}	
}