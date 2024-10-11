
public class Caissier extends Employe {
    private int numeroDeCaisse;

    public Caissier(int identifiant, String nom, String adresse, int nbrHeures, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbrHeures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public double calculerSalaire() {
        int heuresSupplementaires = Math.max(0, getNbrHeures() - 180);
        double salaireNormal = Math.min(180, getNbrHeures()) * 5;
        double salaireSupplementaire = heuresSupplementaires * 5 * 1.15;
        return salaireNormal + salaireSupplementaire;
    }

    @Override
    public String toString() {
        return super.toString() + ", Caissier { Numéro de caisse = " + numeroDeCaisse + " }";
    }
}