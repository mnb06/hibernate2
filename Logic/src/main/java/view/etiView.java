package view;

import controllers.etiController;

public class etiView {

    public static void main( String[] args ) {
        createEti();

}

    private static void createEti() {
        etiController uc = new etiController();
        uc.createEti("Etiqueta 1", "Es la etiqueta 1"); 
        uc.createEti("Etiqueta 2", "Es la etiqueta 2");
        uc.createEti("Etiqueta 3", "Es la etiqueta 3");
        uc.createEti("Etiqueta 4", "Es la etiqueta 4");
    }

}
