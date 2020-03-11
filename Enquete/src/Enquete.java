public class Enquete {
    private int quantidadeEntrevistados;
    private int[] notasRegistradas;
    
    public Enquete(){}

    public Enquete(int quantidadeEntrevistados, int[] notasRegistradas) {
        this.quantidadeEntrevistados = quantidadeEntrevistados;
        this.notasRegistradas = notasRegistradas;
    }

    public int[] getNotasRegistradas() {
        return notasRegistradas;
    }

    public void setNotasRegistradas(int[] notasRegistradas) {
        this.notasRegistradas = notasRegistradas;
    }
    
    public int getQuantidadeEntrevistados() {
        return quantidadeEntrevistados;
    }

    public void setQuantidadeEntrevistados(int quantidadeEntrevistados) {
        this.quantidadeEntrevistados = quantidadeEntrevistados;
    }
 
    public void frequenciaNotas(int notaDesejada) {
        int contador = 0 ;
        int j = 0;
        for(int i=0;i<notasRegistradas.length;i++){
            if(notasRegistradas[i] == notaDesejada )
                contador++;
        }
        System.out.println("A frequencia da nota "+notaDesejada+" é "+contador);
    }
    
    public void notaMedia() {
        double media=0;
        for(int i=0;i<notasRegistradas.length;i++){
            media+=notasRegistradas[i];
        }
        System.out.println("A média é "+media/notasRegistradas.length);
    }
    
    public void numeroClientes() {
        System.out.println("O número de clientes é "+notasRegistradas.length);
    }
}
