package exercises;

import java.util.ArrayList;
import java.util.List;

public class Serie {
    String title;
    List<Episode> episodes;

    public Serie(String title) {
        this.title = title;
        this.episodes = new ArrayList<>();
    }

    public void addEpisode(Episode episode) {
        this.episodes.add(episode);
    }

    public void printSerie() {
        System.out.println("Série: " + this.title);

        for (Episode episode : this.episodes) {
            episode.printEpisode();
        }
    }

    public static void main(String [] args) {
        Serie serie = new Serie("Dexter");

        serie.addEpisode(new Episode("Piloto", 55));
        serie.addEpisode(new Episode("Quem sou eu?", 55));
        serie.addEpisode(new Episode("Lua cheia", 55));
        serie.addEpisode(new Episode("Vamos para praia?", 55));
        serie.addEpisode(new Episode("Refúgio", 55));

        serie.printSerie();
    }
}