package pe.edu.cibertec.relaciones;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Categoria;

public class JPAOneToMany {

    public static void main(String[] args) {

        //referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        //crear categoria
        Categoria categoria = new Categoria("C6", "De Terror", null);

        //registrar categoria
        em.getTransaction().begin();
        em.persist(categoria);
        em.getTransaction().commit();
    }
}
