package problems;

public class Prova {
    public int countGreaterThanEqual(Integer[] array,Integer x){
        int answer = 0;

        if(array != null && x != null){
            int frist = bs(array,x,0,array.length-1);
            if (frist !=-1) {
                answer = (array.length) - frist;
            }
        }
        return answer;
    }
    private int bs(Integer[] array,Integer x,int left, int right){
        int mid = (left + right)/2;
        int frist = -1;

        if (left <= right) {
            if (array[mid] >= x) {
                frist = mid;
                int aux = bs(array, x, left, mid -1);
                if (aux != -1) {
                    frist = aux;
                }
            }else{
                frist = bs(array, x, mid + 1, right);
            }
        }
        return frist;
    }
}
