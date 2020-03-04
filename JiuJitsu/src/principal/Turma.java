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
    public Turma(String sexo, int faixaInicial, int faixaFinal, int quantidadeMaxima, String turno, Aluno[] alunos) {
        this.sexo = sexo;
        this.faixaInicial = faixaInicial;
        this.faixaFinal = faixaFinal;
        this.quantidadeMaxima = quantidadeMaxima;
        this.turno = turno;
        this.alunos = alunos;
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
            if(alunos[i] == null){
                alunos[i] = aluno;
                return true;
            }
        }
        return false;
    }
}
