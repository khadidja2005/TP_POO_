package org.example.demo3.classes;

public class agenda {
    private rendez_vous[] rendez_vous=new rendez_vous[25];
    public agenda(rendez_vous[] rendez_vous){
        this.rendez_vous = rendez_vous;
    }

    // Setter and getter for _rendez_vous
    public rendez_vous[] get_rendez_vous() {
        return rendez_vous;
    }

    public void set_rendez_vous(rendez_vous[] _rendez_vous) {
        this.rendez_vous = rendez_vous;
    }


}
