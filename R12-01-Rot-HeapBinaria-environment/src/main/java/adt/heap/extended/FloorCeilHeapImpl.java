package adt.heap.extended;

import java.util.Comparator;

import adt.heap.HeapImpl;

public class FloorCeilHeapImpl extends HeapImpl<Integer> implements FloorCeilHeap {

    public FloorCeilHeapImpl(Comparator<Integer> comparator) {
        super(comparator);
    }

    @Override
    public Integer floor(Integer[] array, double numero) {
        if (array == null || array.length == 0) return null;
        
        Integer floor = null;
        
        for (Integer value : array) {
            if (value <= numero) {
                if (floor == null || value > floor) {
                    floor = value;
                }
            }
        }
        
        return floor;
    }

    @Override
    public Integer ceil(Integer[] array, double numero) {
        if (array == null || array.length == 0) return null;
        
        Integer ceil = null;
        
        for (Integer value : array) {
            if (value >= numero) {
                if (ceil == null || value < ceil) {
                    ceil = value;
                }
            }
        }
        
        return ceil;
    }
}