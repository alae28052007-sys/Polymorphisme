/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alae2
 */

 
public class Main {
    public static void main(String[] args) {
 
        Ecole ecole = new Ecole();
 
        Etudiant etudiant1 = new Etudiant("Dupont", "Pierre", 19, "dupont.pierre@mail.fr");
        etudiant1.ajouterCours("Java");
        etudiant1.ajouterCours("Python");
 
        Etudiant etudiant2 = new Etudiant("Martin", "Lea", 20, "martin.lea@mail.fr");
        etudiant2.ajouterCours("HTML");
 
        Professeur professeur = new Professeur("Bernard", "Alex", 32, "bernard.alex@mail.fr", 2000);
        professeur.ajouterMatiere("JS");
        professeur.ajouterMatiere("HTML");
        professeur.ajouterMatiere("PHP");
 
        PersonnelAdministratif admin = new PersonnelAdministratif("Durand", "Marie", 40, "durand.marie@mail.fr", 1800);
 
        ecole.ajouterPersonne(etudiant1);
        ecole.ajouterPersonne(etudiant2);
        ecole.ajouterPersonne(professeur);
        ecole.ajouterPersonne(admin);
 
        ecole.afficherDescriptions();
    }
}