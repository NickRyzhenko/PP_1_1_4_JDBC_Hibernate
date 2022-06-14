package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDAO = new UserDaoJDBCImpl();
    public void createUsersTable() throws SQLException {
        userDAO.createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        userDAO.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        userDAO.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) throws SQLException {
        userDAO.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        return userDAO.getAllUsers();
    }

    public void cleanUsersTable() throws SQLException {
        userDAO.cleanUsersTable();
    }
}
