package sorting.linearSorting;

import sorting.AbstractSorting;

/**
 * Classe que implementa a estratégia de Counting Sort vista em sala.
 *
 * Procure evitar desperdício de memória: AO INVÉS de alocar o array de contadores
 * com um tamanho arbitrariamente grande (por exemplo, com o maior valor de entrada possível),
 * aloque este array com o tamanho sendo o máximo inteiro presente no array a ser ordenado.
 *
 * Seu algoritmo deve assumir que o array de entrada nao possui numeros negativos,
 * ou seja, possui apenas numeros inteiros positivos e o zero.
 *
 */
public class CountingSort extends AbstractSorting<Integer> {

	@Override
	public void sort(Integer[] array, int leftIndex, int rightIndex) {
		if (array != null && leftIndex >= 0 && leftIndex < rightIndex && rightIndex < array.length) {
			
			int[] maior;

			int[] contador = new int[maior(array,leftIndex,rightIndex) + 1];
			
			for(int i = 0; i < array.length; i ++ ){
				contador[array[i]] += 1;
			}

			for(int i = 1; i < contador.length; i ++){
				contador[i] += contador[i-1];
			}

			int[] valores = new int[rightIndex - leftIndex + 1];

			for(int j = array.length-1; j >= 0; j--){
				[valores[contador[array[j]-1]-1]] = array[j];
				contador[array[j]-1] -= 1;
			}
		}
		return valores;
	}

	private int maior(Integer[] array, int leftIndex, int rightIndex){
		int maior = array[leftIndex];
		for(int u = leftIndex;u <= rightIndex; u ++){
			if (array[u] > maior) {
				
			}
		}
		return maior;
	}
}
