
public class Responsable extends Employe {
    private double prime;

    public Responsable(int identifiant, String nom, String adresse, int nbrHeures, double prime) {
        super(identifiant, nom, adresse, nbrHeures);
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        int heuresSupplementaires = Math.max(0, getNbrHeures() - 160);
        double salaireNormal = Math.min(160, getNbrHeures()) * 10;
        double salaireSupplementaire = heuresSupplementaires * 10 * 1.20;
        return salaireNormal + salaireSupplementaire + prime;
    }

    public double getPrime() {
        return prime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Responsable { Prime = " + prime + " }";
    }
}