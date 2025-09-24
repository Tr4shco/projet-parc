package gestionloisirs;

public class Surveillant {
    private String nom;
    private String prenom;
    private int anciennete;
    private double tauxHoraire;

    private static final double TAUX_DE_BASE = 17.0;
    private static final double BONUS_PAR_ANNEE = 1.25;
    private static final int PLAFOND_ANNEES = 12;

    public Surveillant(String nom, String prenom, int anciennete) {
        this.nom = nom;
        this.prenom = prenom;
        this.anciennete = anciennete < 0 ? 0 : anciennete;
        setTauxHoraire();
    }

    public void setTauxHoraire() {
        this.tauxHoraire = TAUX_DE_BASE;
        if (this.anciennete > PLAFOND_ANNEES) {
            this.tauxHoraire += PLAFOND_ANNEES * BONUS_PAR_ANNEE;
        }
        else {
            this.tauxHoraire += this.anciennete * BONUS_PAR_ANNEE;
        }
    }
}
