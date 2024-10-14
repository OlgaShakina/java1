package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    public Map<String, List<String>> directory;

    public PhoneDirectory() {
        directory = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        directory.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return directory.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Иванов", "123-456");
        phoneDirectory.add("Петров", "789-987");
        phoneDirectory.add("Иванов", "321-123");
        phoneDirectory.add("Сидоров", "101-202");
        phoneDirectory.add("Петров", "303-303");

        System.out.println("Телефоны для Иванов: " + phoneDirectory.get("Иванов"));
        System.out.println("Телефоны для Петров: " + phoneDirectory.get("Петров"));
        System.out.println("Телефоны для Сидоров: " + phoneDirectory.get("Сидоров"));
        System.out.println("Телефоны для Смирнов: " + phoneDirectory.get("Смирнов"));
    }
}
