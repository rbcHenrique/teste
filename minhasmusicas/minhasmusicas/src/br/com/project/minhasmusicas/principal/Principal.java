package br.com.project.minhasmusicas.principal;

import br.com.project.minhasmusicas.modelos.MinhasPreferidas;
import br.com.project.minhasmusicas.modelos.Musica;
import br.com.project.minhasmusicas.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {


        Musica minhaMuscia = new Musica();
        minhaMuscia.setTítulo("Forever");
        minhaMuscia.setCantor("Kiss");


        for (int i = 0; i < 1000; i++) {

            minhaMuscia.reproduz();
        }

        for (int i = 0; i < 50; i++) {

            minhaMuscia.curte();
        }


        Podcast meuPodcast = new Podcast();
        meuPodcast.setTítulo("BolhaDev");
        meuPodcast.setApresentador("Marcos");


        for (int i = 0; i < 5000; i++) {

            meuPodcast.reproduz();
        }

        for(int i=0; i < 1000; i++){

            meuPodcast.curte();
        }


        MinhasPreferidas preferida = new MinhasPreferidas();
        preferida.inclui(meuPodcast);
        preferida.inclui(minhaMuscia);

    }
}
