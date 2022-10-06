package view;

import controllers.userController;

public class userView {

    public static void main( String[] args ) {
        createUser();

}

    private static void createUser() {
        userController uc = new userController();
        uc.createUser("Matias", "Bue", "matias@outlook.com", "Estudiante"); 
        uc.createUser("Matias", "Cea", "matias@gmail.com", "Estudiante"); 
        uc.createUser("Luis", "Diaz", "luis@outlook.com", "Estudiante"); 
    }

}
