package view;

import controllers.docController;

public class docView {

    public static void main( String[] args ) {
        createDoc();

}

    private static void createDoc() {
        docController uc = new docController();
        uc.createDoc("Documento 1", "Es el documento 1", "28/9/2022", "yo"); 
    }

}
    
