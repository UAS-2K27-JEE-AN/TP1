package cinema;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Film f1 = new Film("Titanic", "James Cameron", 1997, 195);
        Film f2 = new Film("Avatar", "James Cameron", 2009, 162);
        Film f3 = new Film("Inception", "Christopher Nolan", 2010, 148);
        Film f4 = new Film("Interstellar", "Christopher Nolan", 2014, 169);
        Film f5 = new Film("Gladiator", "Ridley Scott", 2000, 155);
        System.out.println("===== LISTE DES FILMS =====");
        f1.afficher();
        f2.afficher();
        f3.afficher();
        f4.afficher();
        f5.afficher();
    }
}
