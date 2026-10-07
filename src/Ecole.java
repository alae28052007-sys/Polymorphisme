/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alae2
 */
import java.util.ArrayList;
 
public class Ecole {
 
    private ArrayList<Personne> listPersonnes;
 
    public Ecole() {
        this.listPersonnes = new ArrayList<>();
    }
 
    public void ajouterPersonne(Personne p) {
        this.listPersonnes.add(p);
    }
 
    public void afficherDescriptions() {
        for (Personne p : listPersonnes) {
            System.out.println(p.printDesc());
        }
    }
}