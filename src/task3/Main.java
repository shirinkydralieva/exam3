package task3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        ArrayList<String> userName = new ArrayList<>();
        ArrayList<Integer> userAge = new ArrayList<>();
        users.add(new User("Anton", 39));
        users.add(new User("Sergei", 14));
        users.add(new User("Natasha", 21));
        users.add(new User("Alina", 7));

        System.out.println("Sort by name: ");
        for (int i = 0; i < users.size(); i++) {
            userName.add(users.get(i).getName());
        }
        Collections.sort(userName);
        System.out.println(userName);
        System.out.println("Sort by age: ");
        for (int i = 0; i < users.size(); i++) {
            userAge.add(users.get(i).getAge());
        }
        Collections.sort(userAge);
        System.out.println(userAge);


    }
}
