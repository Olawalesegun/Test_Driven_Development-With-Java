package pract.comparable;

import org.jetbrains.annotations.NotNull;

public class Agent implements Comparable{

    private int id;
    private String name;
    private String email;

    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }
}
