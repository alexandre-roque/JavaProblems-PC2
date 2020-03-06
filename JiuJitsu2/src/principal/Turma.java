package principal;

public class Turma {
    private String sexo;
    private int faixaInicial;
    private int faixaFinal;
    private int quantidadeMaxima;
    private String turno;
    private Aluno[] alunos;
    
    public Turma(int quantidadeMaxima){
        sexo = "";
        turno = "";
        faixaInicial = 0;
        faixaFinal = 0;
        alunos = new Aluno[quantidadeMaxima];
    }
    public Turma(String sexo, int faixaInicial, int faixaFinal, int quantidadeMaxima, String turno) {
        this.sexo = sexo;
        this.faixaInicial = faixaInicial;
        this.faixaFinal = faixaFinal;
        this.quantidadeMaxima = quantidadeMaxima;
        this.turno = turno;
        alunos = new Aluno[quantidadeMaxima];
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getFaixaInicial() {
        return faixaInicial;
    }

    public void setFaixaInicial(int faixaInicial) {
        this.faixaInicial = faixaInicial;
    }

    public int getFaixaFinal() {
        return faixaFinal;
    }

    public void setFaixaFinal(int faixaFinal) {
        this.faixaFinal = faixaFinal;
    }

    public int getQuantidadeMaxima() {
        return quantidadeMaxima;
    }

    public void setQuantidadeMaxima(int quantidadeMaxima) {
        this.quantidadeMaxima = quantidadeMaxima;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    
    public boolean receberAluno(Aluno aluno){
        for(int i=0;i<alunos.length;i++){
            if(!sexo.equals(aluno.getSexo())){
                return false;
            }
            if((aluno.verificaIdade(aluno)< faixaInicial) || aluno.verificaIdade(aluno)> faixaFinal){
                return false;
            }
            if(alunos[i] == null){
                alunos[i] = aluno;
                break;
            }
            else if(quantidadeMaxima - 1 == i){
                return false;
            }
            
        }
        return false;
    }
    public void listarAlunos(){
        System.out.println("TURMA: "+sexo+" "+turno+"  ");
        for(int i = 0 ;i<alunos.length ;i++){
            if(alunos[i]!= null){
                System.out.println("Aluno(a): "+(i+1)+" ");
                System.out.println("Nome:"+alunos[i].getNome()+"");
                System.out.println("Altura:"+alunos[i].getAltura()+"");
                System.out.println("DataNasc:"+alunos[i].getDtNasc()+"");
                System.out.println("Peso:"+alunos[i].getPeso()+"");
                //System.out.println(alunos[i].getSexo());
                System.out.println("Telefone:"+alunos[i].getTelefone()+"\n");
                
            }
        }
    }
    
    public boolean cancelarMatricula(Aluno aluno){
        for(int i=0;i<alunos.length;i++){
            if(alunos[i] == aluno){
                alunos[i] = null;
                return true;
            }
        }
        return false;
    }
    
}
