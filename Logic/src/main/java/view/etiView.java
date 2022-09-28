package view;

import controllers.etiController;

public class etiView {

    public static void main( String[] args ) {
        createEti();

}

    private static void createEti() {
        etiController uc = new etiController();
        uc.createEti("Etiqueta 1", "Es la etiqueta 1"); 
    }

}