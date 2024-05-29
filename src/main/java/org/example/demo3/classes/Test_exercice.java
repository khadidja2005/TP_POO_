package org.example.demo3.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Test_exercice extends Test {

    private ArrayList<Exercice> exercices ;

    public Test_exercice() {
        this.exercices = new ArrayList<Exercice>(10);
    }

    public ArrayList<Exercice> getExercices() {
        return exercices;
    }

    public void  setExercices(ArrayList<Exercice> exercices) {
        this.exercices = exercices;
    }
    public void ajouterExercice(Exercice exo) {
      exercices.add(exo);
    }
    public void supprimerExercice(Exercice exo) {
      exercices.remove(exo);
    }
    public void modifierExercice(Exercice exo, int index) {
        exercices.set(index , exo);
    }

    @Override
    public String toString() {
        return "Test_exercice{" +
                "exercices=" + exercices +
                '}';
    }


}
