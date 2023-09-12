package pract.comparable;

import org.jetbrains.annotations.NotNull;

public class Agent implements Comparable<Agent>{

    private int id;
    private String name;
    private String email;
    int age;

    public Agent(int id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public int compareTo(@NotNull Agent o) {
        if(this.age>o.age){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Agent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
