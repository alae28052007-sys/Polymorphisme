/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alae2
 */
public class PersonnelAdministratif extends Employe {
 
    public PersonnelAdministratif(String nom, String prenom, int age, String email, double salaire) {
        super(nom, prenom, age, email, salaire);
    }
 
    @Override
    public String printDesc() {
        return getBaseDesc() + " - " + (int) getSalaire() + "€/mois - Personnel administratif.";
    }
}
