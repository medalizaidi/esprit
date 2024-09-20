import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Produit produitVide = new Produit();
        System.out.println("Produit vide: " + produitVide);

        Produit lait = new Produit(1021, "Lait", "Delice", 0.700, null);
        Produit yaourt = new Produit(2510, "Yaourt", "Vitalait", 0.500, null);
        Produit tomate = new Produit(3250, "Tomate", "Sicam", 1.200, null);

        Produit beurre = new Produit(1234, "Beurre", "Président", 2.500, null);

        Date dateExpirationLait = new Date(2024 - 1900, 11 - 1, 20);  // 20 novembre 2024
        Date dateExpirationYaourt = new Date(2024 - 1900, 10 - 1, 10);  // 10 octobre 2024
        Date dateExpirationTomate = new Date(2025 - 1900, 3 - 1, 15);   // 15 mars 2025
        Date dateExpirationBeurre = new Date(2024 - 1900, 12 - 1, 1);   // 1er décembre 2024

        lait.setDateExpiration(dateExpirationLait);
        yaourt.setDateExpiration(dateExpirationYaourt);
        tomate.setDateExpiration(dateExpirationTomate);
        beurre.setDateExpiration(dateExpirationBeurre);

        System.out.println("Produits avec les dates d'expiration modifiées:");
        lait.afficher();
        yaourt.afficher();
        tomate.afficher();
        beurre.afficher();

        System.out.println("\nAffichage des produits avec toString():");
        System.out.println(lait);
        System.out.println(yaourt);
        System.out.println(tomate);
        System.out.println(beurre);
    }
}