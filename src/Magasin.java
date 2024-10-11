import java.util.Arrays;

public class Magasin {
    private String identifiant;
    private String adresse;
    private int capacite;
    private Produit[] produits;
    private int nombreProduits;
    private Employe[] employes; // Ajout d'un tableau pour les employés
    private int nombreEmployes; // Compteur d'employés
    private static int totalProduits = 0;
    private static final int MAX_EMPLOYES = 20; // Limite de 20 employés par magasin

    public Magasin(String identifiant, String adresse, int capacite) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = new Produit[capacite];
        this.nombreProduits = 0;
        this.employes = new Employe[MAX_EMPLOYES]; // Initialisation du tableau des employés
        this.nombreEmployes = 0;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    // Méthode pour ajouter un produit
    public void ajouterProduit(Produit produit) {
        if (isProduitPresent(produit)) {
            System.out.println("Le produit " + produit.getLibelle() + " existe déjà dans le magasin.");
            return;
        }
        if (nombreProduits < capacite) {
            produits[nombreProduits] = produit;
            nombreProduits++;
            totalProduits++;
            System.out.println("Produit " + produit.getLibelle() + " ajouté avec succès.");
        } else {
            System.out.println("Capacité maximale atteinte. Impossible d'ajouter plus de produits.");
        }
    }

    // Vérifier si un produit est déjà présent
    private boolean isProduitPresent(Produit produit) {
        for (int i = 0; i < nombreProduits; i++) {
            if (produits[i].getIdentifiant() == produit.getIdentifiant()) {
                return true;
            }
        }
        return false;
    }

    // Méthode pour afficher les détails du magasin
    public void afficherDetails() {
        System.out.println("Magasin ID: " + identifiant);
        System.out.println("Adresse: " + adresse);
        System.out.println("Capacité: " + capacite);
        System.out.println("Produits:");
        for (int i = 0; i < nombreProduits; i++) {
            System.out.println("Nom: " + produits[i].getLibelle() + ", Prix: " + produits[i].getPrix());
        }
    }

    // Méthode pour afficher tous les libellés des produits
    public void afficherLibelles() {
        System.out.println("Libellés des produits dans le magasin:");
        for (int i = 0; i < nombreProduits; i++) {
            System.out.println("- " + produits[i].getLibelle());
        }
    }

    // Méthode pour afficher tous les produits
    public void afficherTousLesProduits() {
        System.out.println("Tous les produits dans le magasin:");
        for (int i = 0; i < nombreProduits; i++) {
            System.out.println(produits[i].toString());
        }
    }

    // Méthode pour chercher un produit
    public boolean chercherProduit(String libelle) {
        for (int i = 0; i < nombreProduits; i++) {
            if (produits[i].getLibelle().equalsIgnoreCase(libelle)) {
                return true;
            }
        }
        return false;
    }

    // Méthode pour comparer deux magasins en fonction du nombre de produits
    public static Magasin magasinAvecPlusDeProduits(Magasin magasin1, Magasin magasin2) {
        if (magasin1.nombreProduits > magasin2.nombreProduits) {
            return magasin1;
        } else if (magasin1.nombreProduits < magasin2.nombreProduits) {
            return magasin2;
        } else {
            return null; // ou return magasin1 ou magasin2, selon la préférence
        }
    }

    // Méthode pour supprimer un produit
    public boolean supprimer(Produit p) {
        for (int i = 0; i < nombreProduits; i++) {
            if (produits[i].getIdentifiant() == p.getIdentifiant()) {
                // Décaler les produits vers la gauche pour combler le vide
                for (int j = i; j < nombreProduits - 1; j++) {
                    produits[j] = produits[j + 1];
                }
                produits[nombreProduits - 1] = null; // Effacer la dernière référence
                nombreProduits--;
                totalProduits--;
                System.out.println("Produit " + p.getLibelle() + " supprimé avec succès.");
                return true;
            }
        }
        System.out.println("Produit " + p.getLibelle() + " non trouvé.");
        return false;
    }

    // Méthode pour ajouter un employé
    public void ajouterEmploye(Employe employe) {
        if (nombreEmployes < MAX_EMPLOYES) {
            employes[nombreEmployes] = employe;
            nombreEmployes++;
            System.out.println("Employé " + employe.getNom() + " ajouté avec succès.");
        } else {
            System.out.println("Capacité maximale d'employés atteinte.");
        }
    }

    // Méthode pour afficher tous les employés
    public void afficherEmployes() {
        System.out.println("Employés dans le magasin " + identifiant + ":");
        for (int i = 0; i < nombreEmployes; i++) {
            System.out.println(employes[i].toString());
        }
    }

    // Méthode pour afficher les salaires des employés
    public void calculerEtAfficherSalaires() {
        for (int i = 0; i < nombreEmployes; i++) {
            System.out.println("Salaire de " + employes[i].getNom() + " : " + employes[i].calculerSalaire() + " DT");
        }
    }

    // Méthode pour afficher les primes des responsables
    public void afficherPrimesResponsables() {
        for (int i = 0; i < nombreEmployes; i++) {
            if (employes[i] instanceof Responsable) {
                System.out.println("Prime de " + employes[i].getNom() + " : " + ((Responsable) employes[i]).getPrime() + " DT");
            }
        }
    }

    // Méthode pour afficher les détails complets du magasin
    public void afficherMagasin() {
        System.out.println("Magasin ID: " + identifiant + ", Adresse: " + adresse);
        System.out.println("Produits dans le magasin:");
        for (int i = 0; i < nombreProduits; i++) {
            System.out.println("- " + produits[i].getLibelle() + " : " + produits[i].getPrix() + " TND");
        }
        afficherEmployes();
    }
}