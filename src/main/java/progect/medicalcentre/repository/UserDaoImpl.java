package progect.medicalcentre.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import progect.medicalcentre.model.Procedure;
import progect.medicalcentre.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> allUsers() {
        Session session = sessionFactory.getCurrentSession();
        List<User> list = session.createQuery("FROM User ").list();
        return list;
    }

    @Override
    public void add(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
    }

    @Override
    public void delete(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(user);
    }

    @Override
    public void edit(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
    }

    @Override
    public User getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class,id);
    }

    @Override
    public List<User> allUsers(int page) {
        Session session = sessionFactory.getCurrentSession();
        return  session.createQuery("FROM User ").setFirstResult(10*(page - 1)).setMaxResults(10).list();

    }


    @Override
    public List<User> roleDoctor() {
        Session session = sessionFactory.getCurrentSession();
        List <User> list = session.createQuery("FROM User WHERE role='doctor'").list();
        return list;
    }

    @Override
    public List<User> roleUser() {
        Session session = sessionFactory.getCurrentSession();
        List <User> list = session.createQuery("FROM User WHERE role='user'").list();
        return list;
    }

    /*@Override
    public List <Procedure> getProcedures(int id){
        Session session = sessionFactory.getCurrentSession();

        List<Procedure> list = session.createQuery("SELECT FROM ")
    }*/
}
