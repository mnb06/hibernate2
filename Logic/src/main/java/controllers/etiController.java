package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import maven.model.Eti;


public class etiController {

    public void createEti(String nombre, String descripcion){
        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Eti.class).buildSessionFactory();
        Session sesion = sf.openSession();

        try {
            Eti e = new Eti(nombre, descripcion);

            sesion.beginTransaction();

            sesion.save(e);
            sesion.getTransaction().commit();

            sf.close();
            System.out.println("Etiqueta Creada");
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        System.out.println("Error. La etiqueta no se ha creado");

    }

}