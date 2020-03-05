package principal;
public class Teste {
    public static void main(String[] args){
        Aluno al1 = new Aluno("Alexandre","Masculino","16/01/2001", 60.0, 1.77, "31 987569962");
        Aluno al2 = new Aluno("Michelle","Feminino","01/03/2000", 45.0, 1.57, "31 987384920");
        Aluno al3 = new Aluno("Ronaldo","Masculino","12/02/2010", 80.0, 1.82, "31 385023589");
        Aluno al4 = new Aluno("Maria","Feminino","04/07/2010", 50.0, 1.67, "31 987384920");
        Aluno al5 = new Aluno("Gabriel","Masculino","05/02/2006", 50.0, 1.67, "31 418294809");
        Aluno al6 = new Aluno("Bruna","Feminino","01/03/2006", 50.0, 1.67, "31 345367435");
        Aluno al7 = new Aluno("Felipe","Masculino","01/03/2016", 50.0, 1.10, "31 421342154");
        
        Turma mascM = new Turma("Masculino",9,12,3,"Manha");
        Turma femM = new Turma("Feminino",9,12,3,"Manha");
        Turma mascT = new Turma("Masculino",13,18,3,"Tarde");
        Turma femT = new Turma("Feminino",13,18,3,"Tarde");
        Turma mascN = new Turma("Masculino",19,30,3,"Noite");
        Turma femN = new Turma("Feminino",19,30,3,"Noite");
        
        Aluno listaDeEspera = new Aluno(10);
        
       // Aluno[] alunos = {al1,al2,al3,al4,al5,al6,al7} ;
        
        Aluno[] alunos = new Aluno[7];
        alunos[0]=al1;
        alunos[1]=al2;
        alunos[2]=al3;
        alunos[3]=al4;
        alunos[4]=al5;
        alunos[5]=al6;
        alunos[6]=al7;
        
        for(int i=0;i<alunos.length;i++){
            mascM.receberAluno(alunos[i]);
            femM.receberAluno(alunos[i]);
            mascT.receberAluno(alunos[i]);
            femT.receberAluno(alunos[i]);
            mascN.receberAluno(alunos[i]);
            femN.receberAluno(alunos[i]);  
        }
        mascM.listarAlunos();
        femM.listarAlunos();
        mascT.listarAlunos();
        femT.listarAlunos();
        mascN.listarAlunos();
        femN.listarAlunos();
        //cancelarMatricula(al2);
    }
}
