import java.util.Date;

public class Produit {
    public int id;
    public String libelle;
    public String marque;
    public double prix;
    private Date dateExpiration;

    public Produit() {
        this.id = 0;
        this.libelle = "";
        this.marque = "";
        this.prix = 0;
        this.dateExpiration = null;

    }

    public Produit(int id, String libelle, String marque, double prix, Date dateExpiration) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.dateExpiration = dateExpiration;

    }

    ;

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void afficher() {
        System.out.println("Produit ID: " + id);
        System.out.println("Libellé: " + libelle);
        System.out.println("Marque: " + marque);
        System.out.println("Prix: " + prix + " DT");
        if (dateExpiration != null) {
            System.out.println("Date d'expiration: " + dateExpiration);
        } else {
            System.out.println("Date d'expiration: non définie");
        }
        System.out.println("--------------------------");
    }

    @Override
    public String toString() {
        return "ProduitAlimentaire{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateExpiration=" + dateExpiration +
                '}';
    }
}