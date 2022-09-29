package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import maven.model.Doc;


public class docController {

    public void createDoc(String nombre, String descripcion, String fecha, String emisor){
        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Doc.class).buildSessionFactory();
        Session sesion = sf.openSession();

        try {
            Doc d = new Doc(nombre, descripcion, fecha, emisor);

            sesion.beginTransaction();

            sesion.persist(d);
            sesion.getTransaction().commit();

            sf.close();
            System.out.println("Documento Creado");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error. El documento no se ha creado");
            
        }
        

    }

}