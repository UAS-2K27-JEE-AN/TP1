
package cinema;

public class Film {
    private String titre;
    private String realisateur;
    private int annee;
    private int duree;

    public Film(String titre, String realisateur, int annee, int duree) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.annee = annee;
        this.duree = duree;
    }

    public void afficher() {
        System.out.println("Titre : " + this.titre);
        System.out.println("Réalisateur : " + this.realisateur);
        System.out.println("Année : " + this.annee);
        System.out.println("Durée : " + this.duree + " minutes");
        System.out.println("--------------------------");
    }
}
