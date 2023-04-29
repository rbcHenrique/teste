package br.com.project.minhasmusicas.modelos;

public class Audio {

    private String título;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;


        //                                      * Get and Set *
    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }


        //                                      ** Get and Set **



//                                              * Only Get *
    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    //                                              ** Only Get **


    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.totalReproducoes++;
    }





}
