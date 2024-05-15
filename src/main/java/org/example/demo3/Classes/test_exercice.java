package org.example.demo3.Classes;

public class test_exercice extends  test {

    private exercice [] exercices ;

    public test_exercice() {
        this.exercices = new exercice[10];
    }

    public exercice[] getExercices() {
        return exercices;
    }

    public void  setExercices(exercice[] exercices) {
        this.exercices = exercices;
    }
    public void ajouterExercice(exercice exo) {
        for (int i = 0; i < this.exercices.length; i++) {
            if (i == this.exercices.length - 1) {
                i = i+1;
                this.exercices[i] = exo;
            }
        }
    }
    public void supprimerExercice(exercice exo) {
        for (int i = 0; i < this.exercices.length; i++) {
            if (this.exercices[i] == exo) {
                this.exercices[i] = null;
                break;
            }
        }
    }
    public void modifierExercice(exercice exo, int index) {
        this.exercices[index] = exo;
    }


}
