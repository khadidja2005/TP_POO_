package org.example.demo3.classes;

public class Agenda {
    private Rendez_vous[] rendez_vous=new Rendez_vous[25];
    public Agenda(Rendez_vous[] rendez_vous){
        this.rendez_vous = rendez_vous;
    }

    // Setter and getter for _rendez_vous
    public Rendez_vous[] get_rendez_vous() {
        return rendez_vous;
    }

    public void set_rendez_vous(Rendez_vous[] _rendez_vous) {
        this.rendez_vous = rendez_vous;
    }


}
