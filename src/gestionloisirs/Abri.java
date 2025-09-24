package gestionloisirs;

public class Abri {
    private int ouverture;
    private int fermeture;
    private int nbToilettes;
    private String identifiant;
    private static int nbAbris = 0;

    public Abri(int ouverture, int fermeture, int nbToilettes) {
        nbAbris++;

        this.ouverture = ouverture % 24;
        this.fermeture = fermeture % 24;
        this.nbToilettes = (nbToilettes >= 0) ? nbToilettes : 0;
        setIdentifiant();

    }

    private void setIdentifiant() {
        this.identifiant = "ABRI" + String.valueOf(nbAbris);
    }
}
