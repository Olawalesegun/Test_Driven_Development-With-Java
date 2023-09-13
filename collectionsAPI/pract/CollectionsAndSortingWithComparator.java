package pract;

import java.util.ArrayList;

public class CollectionsAndSortingWithComparator {
    private int id;
    private String name;
    private int age;
    public CollectionsAndSortingWithComparator(int age){
        this.id = 1;
        this.name = "Segun";
        this.age = age;
    }
    public CollectionsAndSortingWithComparator(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CollectionsAndSortingWithComparator{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
