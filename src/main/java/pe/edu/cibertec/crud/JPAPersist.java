package pe.edu.cibertec.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Libro;

import java.util.Date;

public class JPAPersist {

    public static void main(String[] args) {

        //referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        //crear ista
        Libro libro = new Libro("A11","Titulo 3","Autor 3", new Date(),70.23, null);

        //registrar libro
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
    }
}
