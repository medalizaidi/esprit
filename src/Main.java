import java.util.Date;
/*
public class Main {
    public static void main(String[] args) {
/*Produit produitVide =new Produit();
            System.out.println("Produit vide créé: " + produitVide);

Produit p1 =new Produit(1021,"lait","delice",13);
        Produit p2 =new Produit(2510,"yaourt","vitalait",0);
        Produit p3=new Produit(3250,"tomate","sicam",1200);
        System.out.println("\nProduits créés:");
        p1.afficher();
        p2.afficher();
        p3.afficher();

        p1.prix = 700;
        System.out.println("Produit lait après modification:");
        p1.afficher();

        p2.prix = 500;
        p3.prix=900;

        System.out.println("\nProduits modifiés:");
        p1.afficher();
        p2.afficher();
        p3.afficher();

        System.out.println("\nProduits avec toString():");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // 8. Ajouter la date d'expiration
        Date dateExpLait = new Date(2024, 9, 20);
        Date dateExpYaourt = new Date(2024, 10, 15);
        Date dateExpTomate = new Date(2025, 3, 10);

        p1.dateExpiration = dateExpLait;
        p2.dateExpiration = dateExpYaourt;
        p3.dateExpiration = dateExpTomate;

        // Afficher à nouveau les produits avec les dates d'expiration
        System.out.println("\nProduits avec date d'expiration:");
        p1.afficher();
        p2.afficher();
        p3.afficher();
        Magasin magasin1 = new Magasin("M1", "123 Rue A", 50);
        magasin1.ajouterProduit(new Produit(1,"car","car",20));
        magasin1.ajouterProduit(new Produit(2,"kinder","chocloate",50));

        Magasin magasin2 = new Magasin("M2", "456 Rue B", 50);
        magasin2.ajouterProduit(new Produit(6,"chargeur","chargeur",90));

        magasin1.afficherDetails();
        magasin2.afficherDetails();

        System.out.println("Total de produits  " + Magasin.getTotalProduits());
    }

}*/ import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Créer deux magasins
        Magasin carrefour = new Magasin("1", "Centre-Ville", 50);
        Magasin monoprix = new Magasin("2", "Menzah 6", 50);

        // Créer des employés pour le premier magasin (Carrefour)
        Caissier caissier1 = new Caissier(101, "Ali", "Tunis", 180, 1);
        Caissier caissier2 = new Caissier(102, "Sara", "Tunis", 170, 2);
        Vendeur vendeur1 = new Vendeur(103, "Omar", "Tunis", 160, 80); // taux de vente 80%
        Responsable responsable1 = new Responsable(104, "Fatma", "Tunis", 170, 500); // prime 500 DT

        // Ajouter des employés au premier magasin
        carrefour.ajouterEmploye(caissier1);
        carrefour.ajouterEmploye(caissier2);
        carrefour.ajouterEmploye(vendeur1);
        carrefour.ajouterEmploye(responsable1);

        // Créer des employés pour le deuxième magasin (Monoprix)
        Caissier caissier3 = new Caissier(201, "Aymen", "Ariana", 190, 3);
        Vendeur vendeur2 = new Vendeur(202, "Salma", "Ariana", 160, 60); // taux de vente 60%
        Vendeur vendeur3 = new Vendeur(203, "Mounir", "Ariana", 150, 70); // taux de vente 70%
        Vendeur vendeur4 = new Vendeur(204, "Leila", "Ariana", 140, 50); // taux de vente 50%
        Responsable responsable2 = new Responsable(205, "Hedi", "Ariana", 180, 600); // prime 600 DT

        // Ajouter des employés au deuxième magasin
        monoprix.ajouterEmploye(caissier3);
        monoprix.ajouterEmploye(vendeur2);
        monoprix.ajouterEmploye(vendeur3);
        monoprix.ajouterEmploye(vendeur4);
        monoprix.ajouterEmploye(responsable2);

        // Ajouter des produits pour les magasins
        carrefour.ajouterProduit(new Produit(5, "Ordinateur", "Électronique", 800));
        carrefour.ajouterProduit(new Produit(7, "Stylo", "Papeterie", 2));

        monoprix.ajouterProduit(new Produit(3, "Bouteille", "Eau", 10));
        monoprix.ajouterProduit(new Produit(4, "Pomme", "Fruits", 5));

        // Afficher les détails des magasins avec les employés et produits
        System.out.println("=== Détails du magasin Carrefour ===");
        carrefour.afficherMagasin();

        System.out.println("\n=== Détails du magasin Monoprix ===");
        monoprix.afficherMagasin();

        // Calculer et afficher les salaires des employés
        System.out.println("\n=== Salaires des employés Carrefour ===");
        carrefour.calculerEtAfficherSalaires();

        System.out.println("\n=== Salaires des employés Monoprix ===");
        monoprix.calculerEtAfficherSalaires();

        // Afficher les primes des responsables dans chaque magasin
        System.out.println("\n=== Primes des responsables Carrefour ===");
        carrefour.afficherPrimesResponsables();

        System.out.println("\n=== Primes des responsables Monoprix ===");
        monoprix.afficherPrimesResponsables();
    }
}