/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alae2
 */
import java.util.ArrayList;
 
public class Professeur extends Employe {
 
    private ArrayList<String> listeMatieres;
 
    public Professeur(String nom, String prenom, int age, String email, double salaire) {
        super(nom, prenom, age, email, salaire);
        this.listeMatieres = new ArrayList<>();
    }
 
    public void ajouterMatiere(String matiere) {
        this.listeMatieres.add(matiere);
    }
 
    @Override
    public String printDesc() {
        return getBaseDesc() + " - " + (int) getSalaire() + "€/mois - Enseigne en "
                + String.join(", ", listeMatieres) + ".";
    }
}
