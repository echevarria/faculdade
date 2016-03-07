/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade;

import academico.Curso;
import academico.Disciplina;
import academico.Turma;
import portal.Aluno;
import portal.Professor;

/**
 *
 * @author quinho
 */
public class Faculdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Curso curso = new Curso("ADS");
        Disciplina disciplina = new Disciplina(curso, "Engenharia de Software II");
        Professor professor = new Professor("Marcos Echevarria", "2707");
        Aluno cristian = new Aluno("Cristian", "111111");
        Turma noite = new Turma(professor, disciplina, cristian);
        
        Aluno ricardo = new Aluno("Ricardo", "222222");
        Aluno regis = new Aluno("Régis", "333333");
        Aluno sara = new Aluno("Sara", "444444");
        
        noite.adicionarAluno(ricardo);
        noite.adicionarAluno(regis);
        noite.adicionarAluno(sara);
        
        System.out.println(noite);
        
        
    }
    
}
