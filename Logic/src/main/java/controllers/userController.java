package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import maven.model.User;


public class userController {

    public void createUser(String nombre, String apellido, String correo, String puesto){
        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
        Session sesion = sf.openSession();

        try {
            User u = new User(nombre, apellido, correo, puesto);

            sesion.beginTransaction();

            sesion.save(u);
            sesion.getTransaction().commit();

            sf.close();
            System.out.println("Usuario Creado");
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        System.out.println("Error. El usuario no se ha creado");

    }

}
