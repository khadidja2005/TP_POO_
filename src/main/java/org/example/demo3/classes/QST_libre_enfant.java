package org.example.demo3.classes;

public class QST_libre_enfant extends QST_libre{
private Categorie_enfant categorie_enfant;

public Categorie_enfant getCategorie_enfant () {
    return categorie_enfant ;
}
public void setCategorie_enfant (Categorie_enfant categorie ) {
    this.categorie_enfant = categorie ;
}
    @Override
    public String toString() {
        return "QST_libre_enfant{" +
                "reponse='" + getReponse() + '\'' +
                ", categorie_enfant=" + categorie_enfant +
                '}';
    }
}
