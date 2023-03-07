package com.igorcastelo.javabasico.palavrachavefinal;
	
	public class Professor {
		private String departamento;
	   private String nomeCurso;
	   private double salario;
	   
	   Professor(){}
	   
	   public String getDepartamento(){
	   return this.departamento;
	   }
	   
	   public void setDepartamento(String departamento){
	   this.departamento = departamento;
	   
	   }

	    public String getNomeCurso() {
	        return nomeCurso;
	    }

	    public void setNomeCurso(String nomeCurso) {
	        this.nomeCurso = nomeCurso;
	    }

	    public double getSalario() {
	        return salario;
	    }

	    public void setSalario(double salario) {
	        this.salario = salario;
	    }
	    public double calcularSalarioLiquido(){
	    	return 0;
	    }
	    
	    public String obterEtiquetaEndereco() {
	    	String s = "Endereco do Professor: ";
	    	//s+= super.getEndereco();
	    	
	    	return s;
	    }
	    
	    public void imprimirEtiquetaEndereco() {
	    	System.out.println("imprimir etiqueta professor");
	    	System.out.println(this.obterEtiquetaEndereco());
	    }

		
}
