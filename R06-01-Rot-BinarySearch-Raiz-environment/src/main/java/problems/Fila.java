package problems;

public class Fila<T> {
    private static class No<T>{
        T dado;
        No<T> proximo;
        No(T dado){
            this.dado = dado;
        }
    }
    private No<T> frente;

    public void enqueue(T elemento){
        frente = enqueueRec(frente,elemento);
    }
    private No<T> enqueueRec(No<T> no, T elemento){
        if (no == null) {
            return new No<>(elemento);
        }else{
            no.proximo = enqueueRec(no.proximo, elemento);
            return no;
        }
    }
    
    /*T enqueue
    boolean isEmpyt()
    void imprimir()
    void imprimirRec(No<T> no)
    */
    
}
