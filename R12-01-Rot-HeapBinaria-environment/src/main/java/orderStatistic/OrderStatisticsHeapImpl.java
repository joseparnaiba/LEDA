package orderStatistic;

import java.util.PriorityQueue;

public class OrderStatisticsHeapImpl<T extends Comparable<T>> implements OrderStatistics<T> {

	/**
	 * Existem diversas formas de se calcular uma estatistica de ordem.
	 * Voce deve fazer isso usando uma heap restricoes:
	 * - nenhuma copia ou estrutura array auxiliar serah permitida, exceto o uso de
	 * uma PriorityQueue
	 * - caso a estatistica de ordem procurada nao exista no array o metodo deve
	 * retornar null
	 * 
	 * @param array
	 * @param k
	 * @return
	 */

	@Override
	public T getOrderStatistics(T[] array, int k) {
    	if (array == null || array.length == 0 || k < 1 || k > array.length) return null;
    
    	PriorityQueue<T> heap = new PriorityQueue<>(java.util.Collections.reverseOrder());
    
    	for (T element : array) {
        	if (heap.size() < k) {
            	heap.offer(element);
        	} else if (element.compareTo(heap.peek()) < 0) {
            	heap.poll();
            	heap.offer(element);
        	}
    	}
    
    	return heap.peek();
	}

}