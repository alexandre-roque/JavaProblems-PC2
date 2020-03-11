public class Enquete {
    private int quantidadeEntrevistados;
    private int[] notasRegistradas;
    
    public Enquete(){}

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
 
    public int frequenciaNotas(int notaDesejada) {
        int contador = 0 ;
        int j = 0;
        for(int i=0;i<notasRegistradas.length;i++){
            if(notasRegistradas[i] == notaDesejada )
                contador++;
        }
        return contador;
    }
    
    public double notaMedia() {
        double media=0;
        for(int i=0;i<notasRegistradas.length;i++){
            media+=notasRegistradas[i];
        }
        return media;
    }
    
    public void numeroClientes() {
        System.out.println(notasRegistradas.length);
    }
}
