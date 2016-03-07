/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico;

import java.util.ArrayList;
import portal.Aluno;
import portal.Professor;

/**
 *
 * @author quinho
 */
public class Turma {
    
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList();
    private Disciplina disciplina;

    public Turma(Professor professor, Disciplina disciplina, Aluno aluno) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos.add(aluno);
    }
    
    public void adicionarAluno (Aluno aluno) {
        this.alunos.add(aluno);
    }
    
    public int totalAlunos() {
        return this.alunos.size();
    }
    
    @Override
    public String toString() {
        String retorno = "Resumo da turma:\n";
        retorno = retorno + "Professor: " + professor.getNome() + "\n";
        retorno = retorno + "Disciplina: " + disciplina.getNome() + "\n";
        retorno = retorno + "Alunos: \n";
        for (int i=0; i < alunos.size(); i++) {
            retorno = retorno + " - " + alunos.get(i).getNome() + "\n";
        }
        retorno = retorno + "\nTotal de alunos na turma: " + alunos.size();
        return retorno;
    }
    
    
    
}
