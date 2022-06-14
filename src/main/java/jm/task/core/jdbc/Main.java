package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection = Util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("Freddy", "Merquerry", (byte) 43);
        System.out.println("User с именем - Freddy добавлен в базу данных");
        userDao.saveUser("John", "Bon Jovi", (byte) 52);
        System.out.println("User с именем - John добавлен в базу данных");
        userDao.saveUser("Elvis", "Presley", (byte) 60);
        System.out.println("User с именем - Elvis добавлен в базу данных");
        userDao.saveUser("Kurt", "Cobain", (byte) 49);
        System.out.println("User с именем - Kurt добавлен в базу данных");
        for(User user:userDao.getAllUsers()) {
            System.out.println(user);
        }
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
        try {
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Util.closeConnection();
    }
}
