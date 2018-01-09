package neito.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person 
{
	private final StringProperty prenom;
	private final StringProperty nom;
	
	public Person(String prenom, String nom)
	{
		this.prenom =  new SimpleStringProperty(prenom);
		this.nom = new SimpleStringProperty(nom);
	}

	public String getPrenom() {
		return prenom.get();
	}
	public void setPrenom(String prenom)
	{
		this.prenom.set(prenom);
	}
	public StringProperty PrenomProperty() {
        return prenom;
    }	
	public String getNom() {
		return nom.get();
	}
	public void setNom(String nom)
	{
		this.nom.set(nom);
	}
	public StringProperty NomProperty() {
        return nom;
    }
}