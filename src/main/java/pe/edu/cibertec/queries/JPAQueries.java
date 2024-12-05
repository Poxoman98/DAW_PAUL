package pe.edu.cibertec.queries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import pe.edu.cibertec.entity.Libro;

public class JPAQueries {
    public static void main(String[] args) {

        //referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        /**
         * SELECT
         **/

        //TypedQuery<Libro> query = em.createQuery("select l from Libro l", Libro.class);
            //query.getResultList().forEach(System.out::println);

        //Seleccionar por nombre del autor
        //TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.autor = :autor", Libro.class);
        //query.setParameter("autor", "Claudia");
        //query.getResultList().forEach(System.out::println);

        //Seleccionar por nombre del autor y precio
        //TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.autor = :autor and l.precio > :precio", Libro.class);
        //query.setParameter("autor", "Claudia");
        //query.setParameter("precio", 50);
        //query.getResultList().forEach(System.out::println);

        //Seleccionar por precio minimo o maximo between - in
        //TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.precio between  :inicio and :final", Libro.class);
        //query.setParameter("inicio", 30);
        //query.setParameter("final", 50);
        //query.getResultList().forEach(System.out::println);

        //Seleccionar por autores en especifico where - in
        //TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.autor in ('Claudia', 'Cesar')", Libro.class);
        //query.getResultList().forEach(System.out::println);

        //Seleccionar por autores en especifico valores escalares
        //TypedQuery<String> query = em.createQuery("select l.autor from Libro l where l.autor in ('Claudia', 'Cesar')", String.class);
        //query.getResultList().forEach(System.out::println);

        //Seleccionar por autores en especifico valores escalares - distinct
        //TypedQuery<String> query = em.createQuery("select distinct l.autor from Libro l where l.autor in ('Claudia', 'Cesar')", String.class);
        //query.getResultList().forEach(System.out::println);

        //Seleccionar por orden de precio descendente order by
        //TypedQuery<Libro> consulta = em.createQuery("select l from Libro l order by l.precio desc", Libro.class);
        //consulta.getResultList().forEach(System.out::println);

        //Seleccionar por orden de precio descendente group by
        //TypedQuery<Object[]> consulta = em.createQuery("select l.autor, count(l) from Libro l group by l.autor", Object[].class);
        //consulta.getResultList().forEach(element -> System.out.println(element[0] + " ->" + element[1]) );

        //Seleccionar cuando es nulo o no nulo /  where is null or not null
        //TypedQuery<Libro> consulta = em.createQuery("select l from Libro l where l.autor is null", Libro.class);
        //consulta.getResultList().forEach(System.out::println);

        //Seleccionar cuando empiezan con "c" /  where - like /  when starts in "c"
        TypedQuery<Libro> consulta = em.createQuery("select l from Libro l where l.titulo like 'c%'", Libro.class);
        consulta.getResultList().forEach(System.out::println);

    }
}
