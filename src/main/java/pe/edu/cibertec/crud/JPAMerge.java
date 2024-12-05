package pe.edu.cibertec.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Libro;

public class JPAMerge {
    public static void main(String[] args) {
        //referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        //consultar libro
        Libro libro = em.find(Libro.class, "A11");
        libro.setAutor("Puccius Supremus");

        //actualizar libro
        em.getTransaction().begin();
        em.merge(libro);
        em.getTransaction().commit();
    }
}
