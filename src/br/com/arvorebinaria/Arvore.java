package br.com.arvorebinaria;

public class Arvore {

	private No raiz;
	
	public No inserir(Integer valor){
		//Recebe um novo valor
		return this.inserir(new No(valor), raiz);
	}

	private No inserir(No novo, No anterior) {
		//Se a raiz for nula, este novo No sera o primeiro
		if(raiz == null){
			raiz = novo;
			return raiz;
		}
		
		//O No inserido da primeira vez, se torna o anterior
		if(anterior != null){
			if (novo.getValorASerArmazenado() <= anterior.getValorASerArmazenado()){
				//Valor decrescente
				No noEsquerdoDoAnterior = anterior.getNoDaEsquerda();
				No novoNoDaEsqueda = this.inserir(novo, noEsquerdoDoAnterior);
				anterior.setNoDaEsquerda(novoNoDaEsqueda);
			}  else if (novo.getValorASerArmazenado() > anterior.getValorASerArmazenado()) {
				//Valor crescente
				No noDireitoDoAnterior = anterior.getNoDaDireita();
				No novoNoDaDireita = this.inserir(novo, noDireitoDoAnterior);
				anterior.setNoDaDireita(novoNoDaDireita);
			} else {
				anterior = novo;
			}
		} else {
			//Caso vindo da ação recursiva
			//Usado para inserir o novo valor em algum dos lados do valor anterior
			anterior = novo;
		}
		
		return anterior;
	}
	
	public No getRaiz(){
		return this.raiz;
	}
}
