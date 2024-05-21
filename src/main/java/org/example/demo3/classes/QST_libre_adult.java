
package org.example.demo3.classes;

public class QST_libre_adult extends QST_libre {
private Categorie_adult categorie_adult;

public Categorie_adult getCategorie_adult (){
return categorie_adult;
}
public void setCategorie_adult (Categorie_adult categorie) {
this.categorie_adult = categorie;
}
@Override
public String toString() {
return "QST_libre_adult{" +
"reponse='" + getReponse() + '\'' +
", categorie_adult=" + categorie_adult +
'}';
}

}

