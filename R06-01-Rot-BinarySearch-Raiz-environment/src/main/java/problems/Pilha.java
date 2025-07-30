package problems;

public class Pilha<T> {
    
    private static class No<T> {
        T dado;
        No<T> proximo;
        No(T dado){
            this.dado = dado;
        }

    }
    private No<T> topo;

    public void push(T elemento){
        topo = pushRec(topo,elemento);
    }

    private No<T> pushRec(No<T> no, T elemento){
        if(no == null){
            return new No<>(elemento);
        }else{
            No<T> novo = new  No<>(elemento);
            novo.proximo = no;
            return novo;
        }
    }
    public T pop(){
        if (topo == null) {
            throw new RuntimeException("Pilha vazia");
        }
        T valor = topo.dado;
        topo = topo.proximo;
        return valor;
    }
    public boolean isBlanck(){
        return topo == null;
    }
    public void imprimir(){
        imprimirRec(topo);
        System.out.println();
    }
    private void imprimirRec(No<T> no){
        if(no != null){
            System.out.print(no.dado+" ");
        }
        imprimirRec(no.proximo);
    }

}
