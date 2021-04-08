package progect.medicalcentre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.medicalcentre.model.User;
import progect.medicalcentre.repository.UserDao;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public List<User> allUsers() {
        return userDao.allUsers();
    }

    @Override
    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    @Transactional
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    @Transactional
    public void edit(User user) {
        userDao.edit(user);
    }

    @Override
    @Transactional
    public User getById(int id) {
        return userDao.getById(id);
    }

    @Override
    @Transactional
    public List<User> allUsers(int page) {
        return userDao.allUsers(page);
    }

    @Override
    @Transactional
    public List<User> roleDoctor() {
        return userDao.roleDoctor();
    }

    @Override
    @Transactional
    public List<User> roleUser() {
        return userDao.roleUser();
    }
}

