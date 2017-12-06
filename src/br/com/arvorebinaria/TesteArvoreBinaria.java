package br.com.arvorebinaria;

public class TesteArvoreBinaria {
	public static void main(String[] args) {
		Arvore arvore = new Arvore();
		arvore.inserir(10);
		arvore.inserir(20);
		arvore.inserir(5);
		arvore.inserir(5);
		arvore.inserir(50);
		arvore.inserir(1);
		arvore.inserir(3);
		
		Integer menorValor = new ArvoreUtil().setArvore(arvore).menorValor();
		System.out.println(menorValor);

		Integer maiorValor = new ArvoreUtil().setArvore(arvore).maiorValor();
		System.out.println(maiorValor);
	}
}
