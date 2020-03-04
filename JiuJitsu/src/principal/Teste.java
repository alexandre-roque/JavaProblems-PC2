package principal;
public class Teste {
    public static void main(String[] args){
        Aluno al1 = new Aluno("Alexandre","Masculino","16/01/2001", 60.0, 1.77, "31 987569962");
        Aluno al2 = new Aluno("Michelle","Feminino","01/03/2000", 45.0, 1.57, "31 987384920");
        Aluno al3 = new Aluno("Ronaldo","Masculino","12/02/2010", 80.0, 1.82, "31 385023589");
        Aluno al4 = new Aluno("Maria","Feminino","04/07/2010", 50.0, 1.67, "31 987384920");
        Aluno al5 = new Aluno("Gabriel","Masculino","05/02/2006", 50.0, 1.67, "31 418294809");
        Aluno al6 = new Aluno("Bruna","Feminino","01/03/2006", 50.0, 1.67, "31 419284193");
        
        Turma mascM = new Turma("Masculino",9,12,10,"Manha");
        Turma femininoM = new Turma("Feminino",9,12,10,"Manha");
        Turma mascT = new Turma("Masculino",13,18,10,"Tarde");
        Turma femininoT = new Turma("Feminino",13,18,10,"Tarde");
        Turma mascN = new Turma("Masculino",19,30,10,"Noite");
        Turma femininoN = new Turma("Feminino",19,30,10,"Noite");
        
        Aluno[6] alunos = new Aluno();
    }
}

/*
public class Teste {
    
    public static void main(String[] args) {
        Folha f1 = new Folha("A4","Azul");
        Folha f2 = new Folha("A4","Amarela");
        Grampeador g = new Grampeador(3,"peq");
        Folha[] folhas = new Folha[2];
        folhas[0] = f1;
        folhas[1] = f2;
        g.grampear(folhas);
    }
    
} */