/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alae2
 */
import java.util.ArrayList;
 
public class Etudiant extends Personne {
 
    private ArrayList<String> listeCours;
 
    public Etudiant(String nom, String prenom, int age, String email) {
        super(nom, prenom, age, email);
        this.listeCours = new ArrayList<>();
    }
 
    public void ajouterCours(String cours) {
        this.listeCours.add(cours);
    }
 
    @Override
    public String printDesc() {
        return getBaseDesc() + " - Étudiant inscrit aux cours de " + String.join(", ", listeCours) + ".";
    }
}