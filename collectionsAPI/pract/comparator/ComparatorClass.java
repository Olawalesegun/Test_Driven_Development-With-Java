package pract.comparator;

public class ComparatorClass {
    private int id;
    private String name;
    private int age;

    public ComparatorClass(){
        this.id = 2;
        this.name = "Bella Schmurda";
        this.age = 22;
    }

    public ComparatorClass(int id, String name, int age) {
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
        return "ComparatorClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
