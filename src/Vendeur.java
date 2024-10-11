
public class Vendeur extends Employe {
    private double tauxDeVente;

    public Vendeur(int identifiant, String nom, String adresse, int nbrHeures, double tauxDeVente) {
        super(identifiant, nom, adresse, nbrHeures);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public double calculerSalaire() {
        return 450 * (tauxDeVente / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Vendeur { Taux de vente = " + tauxDeVente + "% }";
    }
}