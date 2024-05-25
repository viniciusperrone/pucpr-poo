package exercises;

public class Episode {
    String title;
    int duration;

    public Episode(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    void printEpisode() {
        System.out.println("Episodio");
        System.out.println("Título: " + this.title);
        System.out.println("Duracao (minutos): " + this.duration);
    }

    public static void main(String [] args) {
        Episode ep1 = new Episode("Piloto", 55);
        Episode ep2 = new Episode("Quem sou eu?", 55);
        Episode ep3 = new Episode("Lua cheia", 55);
        Episode ep4 = new Episode("Vamos para praia?", 55);
        Episode ep5 = new Episode("Refúgio", 55);

        ep1.printEpisode();
        ep2.printEpisode();
        ep3.printEpisode();
        ep4.printEpisode();
        ep5.printEpisode();
    }
}
