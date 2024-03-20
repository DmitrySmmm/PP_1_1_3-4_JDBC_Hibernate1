package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        User user1 = new User("Mike", "Davis", (byte) 33);
        User user2 = new User("John", "Lowson", (byte) 19);
        User user3 = new User("Scott", "Wilson", (byte) 29);
        User user4 = new User("Richard", "Jones", (byte) 47);



        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        List<User> list = new ArrayList<>(userService.getAllUsers());
        list.forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
        userService.dbClose();


    }
}
