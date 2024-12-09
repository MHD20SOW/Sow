package entity;

import java.util.Scanner;

public class ChemiseImpl implements IChemise {

    @Override
    public Chemise saisie() {
        Scanner scanner = new Scanner(System.in);
        Chemise chemise = new Chemise();

        System.out.print("Entrez l'ID: ");
        chemise.setId(scanner.nextInt());
        scanner.nextLine();  // Consomme le reste de la ligne

        System.out.print("Entrez le libellé: ");
        chemise.setLib(scanner.nextLine());

        System.out.print("Entrez la couture: ");
        chemise.setCouture(scanner.nextLine());

        return chemise;
    }

    @Override
    public void affichage(Chemise c) {
        System.out.println("ID: " + c.getId());
        System.out.println("Libellé: " + c.getLib());
        System.out.println("Couture: " + c.getCouture());
    }
}
