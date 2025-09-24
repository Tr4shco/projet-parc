package gestionloisirs;

public class Parc {
    private Abri abri;
    private Surveillant surveillant;
    private int eclairageDeb;
    private int eclairageFin;
    private double superficie;

    public Parc(Abri abri, Surveillant surveillant, int eclairageDeb, int eclairageFin, double superficie) {
        this.abri = abri;
        this.surveillant = surveillant;
        this.eclairageDeb = eclairageDeb % 24;
        this.eclairageFin = eclairageFin % 24;
        this.superficie = superficie;
    }
}
