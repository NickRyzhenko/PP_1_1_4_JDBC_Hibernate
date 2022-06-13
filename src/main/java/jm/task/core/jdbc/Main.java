package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();
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
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
