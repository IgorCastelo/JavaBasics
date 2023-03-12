package com.igorcastelo.javabasico.classeobject;

import java.util.Arrays;
import java.util.Objects;

public class Aluno  {
	private String curso;
    private double[] notas;
    
   public Aluno(){
	   super();
   }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public double calcularMedia(double num1, double num2, double num3){
    double media = (num1+num2+num3/3);
    return media;
    }

    public String obterEtiquetaEndereco() {
    	String s = "Endereco do Aluno: ";
    	//s+= super.getEndereco();
    	
    	return s;
    }
    
    public void imprimirEtiquetaEndereco() {
    	System.out.println("imprimir etiqueta Aluno");
    	System.out.println(this.obterEtiquetaEndereco());
    }

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(curso, other.curso) && Arrays.equals(notas, other.notas);
	}
	
  /*  public String toString() {
    	 String s = curso + "\n";
    	 for(double nota : notas) {
    		 s+= nota +" ";
    	 }
    	 return s;
    }*/
    

}
