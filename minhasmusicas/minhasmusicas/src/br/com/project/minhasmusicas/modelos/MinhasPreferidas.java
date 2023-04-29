package br.com.project.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){

        if(audio.getClassificacao() >= 9){

            System.out.println(audio.getTítulo() + " Sucesso absoluto");
        } else {
                System.out.println(audio.getTítulo() + " Colocar na lista");
        }
    }
}
