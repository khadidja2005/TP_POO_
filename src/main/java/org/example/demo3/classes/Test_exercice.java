package org.example.demo3.classes;

public class Test_exercice extends Test {

    private Exercice[] exercices ;

    public Test_exercice() {
        this.exercices = new Exercice[10];
    }

    public Exercice[] getExercices() {
        return exercices;
    }

    public void  setExercices(Exercice[] exercices) {
        this.exercices = exercices;
    }
    public void ajouterExercice(Exercice exo) {
        for (int i = 0; i < this.exercices.length; i++) {
            if (i == this.exercices.length - 1) {
                i = i+1;
                this.exercices[i] = exo;
            }
        }
    }
    public void supprimerExercice(Exercice exo) {
        for (int i = 0; i < this.exercices.length; i++) {
            if (this.exercices[i] == exo) {
                this.exercices[i] = null;
                break;
            }
        }
    }
    public void modifierExercice(Exercice exo, int index) {
        this.exercices[index] = exo;
    }

    @Override
    public String toString() {
        return "Test_exercice{" +
                "exercices=" + exercices +
                '}';
    }


}
