package exercises;

import java.util.ArrayList;

public class User {
    String name;
    String email;
    String password;
    ArrayList<Serie> watchedSeries;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.watchedSeries = new ArrayList<>();
    }

    void printData () {
        System.out.println("Nome: " + this.name);
        System.out.println("Email: " + this.email);

        for (Serie serie : this.watchedSeries) {
            serie.printSerie();
        }
    }

    void verifyPassword(String password) {
        if(password.equals(this.password)) {
            System.out.println("Senhas identicas");
        } else {
            System.out.println("Senhas não identicas");
        }
    }

    void addSeriesToHistory(Serie serie) {
        if(this.watchedSeries.contains(serie)) {
            System.out.println("Série já está incluída");
        } else {
            this.watchedSeries.add(serie);
        }
    }

    public static void main(String [] args) {
        User user;
        Serie serie = new Serie("Supernatural");

        Episode ep1 = new Episode("Pilot", 44);
        Episode ep2 = new Episode("Dean", 44);
        Episode ep3 = new Episode("Sam", 44);

        serie.addEpisode(ep1);
        serie.addEpisode(ep2);
        serie.addEpisode(ep3);

        user = new User("Vinicius", "vinicius@gmail.com", "123456");

        user.addSeriesToHistory(serie);
        user.printData();
    }
}
