package view;

import controllers.userController;

public class userView {

    public static void main( String[] args ) {
        createUser();

}

    private static void createUser() {
        userController uc = new userController();
        uc.createUser("Matias", "Bue", "matias@outlook.com", "Estudiante"); 
    }

}