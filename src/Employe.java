
public abstract class Employe {
    private int identifiant;
    private String nom;
    private String adresse;
    private int nbrHeures;

    public Employe(int identifiant, String nom, String adresse, int nbrHeures) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeures = nbrHeures;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNbrHeures() {
        return nbrHeures;
    }

    public abstract double calculerSalaire();

    @Override
    public String toString() {
        return "Employé { " +
                "Identifiant = " + identifiant +
                ", Nom = '" + nom + '\'' +
                ", Adresse = '" + adresse + '\'' +
                ", Nombre d'heures = " + nbrHeures +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employe employe = (Employe) o;

        return identifiant == employe.identifiant &&
                nbrHeures == employe.nbrHeures &&
                nom.equals(employe.nom) &&
                adresse.equals(employe.adresse);
    }
}