/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alae2
 */
public abstract class Employe extends Personne {
 
    private double salaire;
 
    public Employe(String nom, String prenom, int age, String email, double salaire) {
        super(nom, prenom, age, email);
        this.salaire = salaire;
    }
 
    public double getSalaire() {
        return salaire;
    }
 
    @Override
    public abstract String printDesc();
}
 
