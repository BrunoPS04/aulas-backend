package com.mycompany.aula2;

public class Estudante extends Pessoa {

    private String matricula;
    private String curso;

    public Estudante(String nome, int idade, String matricula, String curso) {

        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void mostrarEstudante (){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Curso: " + getCurso());
    }

}
