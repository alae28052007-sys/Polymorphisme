/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alae2
 */
public class Personne {
 
    private String nom;
    private String prenom;
    private int age;
    private String email;
 
    public Personne(String nom, String prenom, int age, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.email = email;
    }
 
    public String getBaseDesc() {
        return nom + " " + prenom + ", " + age + " ans, " + email;
    }
 
    public String printDesc() {
        return getBaseDesc();
    }
}
