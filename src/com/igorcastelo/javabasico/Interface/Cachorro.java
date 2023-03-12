package com.igorcastelo.javabasico.Interface;

public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalDomesticado{

	private String raça;
	private int tamanho;
	
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public void amamentar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void chamarVeterinario() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void passear() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
