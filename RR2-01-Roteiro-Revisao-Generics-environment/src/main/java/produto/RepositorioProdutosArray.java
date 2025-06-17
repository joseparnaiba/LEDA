package produto;

import produto.*;

public class RepositorioProdutosArray<T extends Produto> implements RepositorioProdutos<T> {

    private T[] produtos;
    private int index = -1;

    public RepositorioProdutosArray(int capacidade){
        super();
        this.produtos = (T[]) new Object[capacidade];
    }

    private int procurarIndice(int codigo){
        int i = 0;
        int resp = -1;
        boolean achou = false;

        while ((i<index) && !achou) {
            if(produtos[i].getCodigo() == codigo){
                resp = i;
                achou = true;
            }
            i++;
        }
        return resp;
        
    }
    @Override
    public boolean existe(int codigo){
        boolean resp = false;
        int i = procurarIndice(codigo);
        resp = (i == -1);
        return resp;
    }

    @Override
    public void inserir(T produto){
        if (index < produtos.length) {
            produtos[index] = produto;
            index++;
        }else{
            throw new RuntimeException("Repositorio cheio!");
        }
    }

    @Override
    public void atualizar(T produto){
        int i = procurarIndice(produto.getCodigo());
        if (i != -1) {
            produtos[i] = produto;
        }else {
			throw new RuntimeException("Produto nao encontrado");
		}

    }
    @Override
    public void remover(int codigo){
        int i = procurarIndice(codigo);
        if (i != -1) {
            produtos[i] = produtos[index];
            produtos[index] = null;
            index--;
        }else {
			throw new RuntimeException("Produto nao encontrado");
		}
    }

    @Override
    public T procurar(int codigo){
        T resp = null;
        int i = procurarIndice(codigo);
        if (i != -1) {
            resp = produtos[i];
        }
        return resp;
    }

}
