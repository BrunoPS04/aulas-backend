
package com.mycompany.aula2;

//Crie uma classe Pessoa com nome e idade como atributos privados (encapsulamento).
//Pessoa deve ter um construtor para nome e idade e getter e setter pra ambos.
//Crie uma classe Estudante que herda de Pessoa com atributos String matricula e curso, no construtor inicialize todos os atributos,
//até o de pessoa usando super.
//Estudante deve ter um construtor com todos os atributos e getter e setter respectivos.

public class Aula2 {

    public static void main(String[] args) {

       Estudante e = new Estudante("Bruno",19,"123456","Programação");

       e.mostrarEstudante();

    }

}
