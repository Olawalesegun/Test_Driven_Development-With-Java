package comparism;

import org.jetbrains.annotations.NotNull;

public class Cat implements Comparable<Cat> {
    private String name;
    private int age;
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(@NotNull Cat cat) {
        if(this.age>cat.age){
            return 1;
        } else if (this.age==cat.age) {
            return 0;

        }else{
            return -1;
        }
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
}
