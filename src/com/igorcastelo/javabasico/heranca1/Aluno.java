package com.igorcastelo.javabasico.heranca1;

public class Aluno extends Pessoa {
	private String[] cursos;
    private String[][] notas;
    
    Aluno(){}

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    public String[][] getNotas() {
        return notas;
    }

    public void setNotas(String[][] notas) {
        this.notas = notas;
    }
    public double calcularMedia(double num1, double num2, double num3){
    double media = (num1+num2+num3/3);
    return media;
    }
}
