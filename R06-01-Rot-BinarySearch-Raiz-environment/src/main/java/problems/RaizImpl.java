package problems;

/**
 * Classe com metodos para calcular raiz n-esima de um numero com aproximacao
 * e para encontrar os limites que dividem um array em 3 partes de mesmo tamanho
 * 
 * @author adalbertocajueiro
 *
 */
public class RaizImpl implements Raiz {

	public double raiz(int numero, int raiz, double erro){
		//TODO Implement your code here
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	private int buscaRaiz(int v,int inicio,int raiz, double erro){
		
		int resp = 0;
		int compara = raiz(v,raiz);
		
		if (inicio <= v) {
			int meio = (inicio + v)/2;

			double conta = (meio*compara)- v;
			
			if (conta == erro) {
				resp = meio;
			}
		}
		return resp;
	}
	private int raiz(int n, int raiz){
		return n*(1/raiz);
	}

}
/*
 * A raiz n-ésima (x) de um número N é um número que varia de 0 até N 
   tal que x^n = N (ou x^n se aproxima de N com determinado erro aceitável).
   comparando se a diferença está dentro da faixa de erro.
 */