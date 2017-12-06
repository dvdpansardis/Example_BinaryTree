package br.com.arvorebinaria;

public class ArvoreUtil {

	private Arvore arvore;

	public ArvoreUtil setArvore(Arvore arvore){
		this.arvore = arvore;
		return this;
	}
	
	public Integer menorValor(){
		return menor(arvore.getRaiz());
	}
	
	public Integer maiorValor(){
		return maior(arvore.getRaiz());
	}
	
	private Integer menor(No no){
		if(no.getNoDaEsquerda() != null)
			return menor(no.getNoDaEsquerda()); 
		return no.getValorASerArmazenado();
	}
	
	private Integer maior(No no){
		if(no.getNoDaDireita() != null)
			return maior(no.getNoDaDireita()); 
		return no.getValorASerArmazenado();
	}
	
}
