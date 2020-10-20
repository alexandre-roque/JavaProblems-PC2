package principal;
public class Filme {
    private String titulo;
    private String genero;
    private String dimensao;
    private int ano;
    private Sala sala;
    private String codigo;
    
    public Filme(String titulo, String genero, String dimensao, int ano, Sala sala, String codigo) {
        this.titulo = titulo;
        this.genero = genero;
        this.dimensao = dimensao;
        this.ano = ano;
        this.sala = sala;
        this.codigo = codigo;
    }
    
    public Filme() {
        this.titulo = "";
        this.genero = "";
        this.dimensao = "";
        this.ano = 0;
        this.sala = null;
        this.codigo = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void exibirDetalhes(){
        System.out.println(this.getTitulo()+", do gênero: "+this.getGenero()+", dimens"
                + "ao: "+this.getDimensao()+" // CODIGO:"+this.getCodigo());
    }
}
