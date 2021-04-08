package progect.medicalcentre.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import progect.medicalcentre.model.Procedure;

import java.util.List;

@Repository
public class ProcedureDaoImpl implements ProcedureDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Procedure> allProcedures() {
        Session session = sessionFactory.getCurrentSession();
        List<Procedure> list = session.createQuery("FROM Procedure").list();
        return list;
    }

    @Override
    public void add(Procedure procedure) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(procedure);

    }

    @Override
    public void delete(Procedure procedure) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(procedure);
    }

    @Override
    public void edit(Procedure procedure) {
        Session session = sessionFactory.getCurrentSession();
        session.update(procedure);
    }

    @Override
    public Procedure getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Procedure.class,id);
    }
}
