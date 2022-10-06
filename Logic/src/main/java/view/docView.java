package view;

import controllers.docController;

public class docView {

    public static void main( String[] args ) {
        createDoc();

}

    private static void createDoc() {
        docController uc = new docController();
        uc.createDoc("Documento 1", "Es el documento 1", "26/9/2022", "yo"); 
        uc.createDoc("Documento 2", "Es el documento 2", "27/9/2022", "yo"); 
        uc.createDoc("Documento 3", "Es el documento 3", "28/9/2022", "yo"); 
        uc.createDoc("Documento 4", "Es el documento 4", "29/9/2022", "yo"); 
    }

}
    
