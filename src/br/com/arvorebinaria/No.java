package br.com.arvorebinaria;

public class No {

	private Integer valorASerArmazenado;

	private No noDaDireita;

	private No noDaEsquerda;

	public No(Integer valorASerArmazenado) {
		//Construindo um novo No
		this.valorASerArmazenado = valorASerArmazenado;
	}

	public Integer getValorASerArmazenado() {
		return valorASerArmazenado;
	}

	public No getNoDaDireita() {
		return noDaDireita;
	}

	public void setNoDaDireita(No noDaDireita) {
		this.noDaDireita = noDaDireita;
	}

	public No getNoDaEsquerda() {
		return noDaEsquerda;
	}

	public void setNoDaEsquerda(No noDaEsquerda) {
		this.noDaEsquerda = noDaEsquerda;
	}

}
