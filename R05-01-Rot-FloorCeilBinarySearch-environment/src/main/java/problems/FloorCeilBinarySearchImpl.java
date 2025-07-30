package problems;

/**
 * Calcula o floor e ceil de um numero em um array usando a estrategia de busca
 * binaria.
 * 
 * Restricoes: 
 * - Algoritmo in-place (nao pode usar memoria extra a nao ser variaveis locais) 
 * - O tempo de seu algoritmo deve ser O(log n).
 * 
 * @author Adalberto
 *
 */
public class FloorCeilBinarySearchImpl implements FloorCeil {

    @Override
    public Integer floor(Integer[] array, Integer x) {
        return floor(array, x, 0, array.length - 1, null);
    }

	private Integer floor(Integer[] array, Integer x, int left, int right, Integer cnd) {
        if (left > right) {
            return cnd;
        }

        int meio = left + (right - left) / 2;

        if (array[meio] == x) {
            return array[meio];
        } else if (array[meio] < x) {
            
            return floor(array, x, meio + 1, right, array[meio]);
        } else {
            return floor(array, x, left, meio - 1, cnd);
        }
    }

	@Override
    public Integer ceil(Integer[] array, Integer x) {
        return ceilRecursive(array, x, 0, array.length - 1, null);
    }

    private Integer ceilRecursive(Integer[] array, Integer x, int left, int right, Integer cnd2) {
        if (left > right) {
            return cnd2;
        }

        int meio = left + (right - left) / 2;

        if (array[meio] == x) {
            return array[meio];
        } else if (array[meio] > x) {
            
            return ceilRecursive(array, x, left, meio - 1, array[meio]);
        } else {
            return ceilRecursive(array, x, meio + 1, right, cnd2);
        }
    }
}
