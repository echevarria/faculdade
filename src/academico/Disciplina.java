/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico;

/**
 *
 * @author quinho
 */
public class Disciplina {
    
    private Curso curso;
    private String nome;
    private double valor;

    public Disciplina(Curso curso, String nome) {
        this.curso = curso;
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
