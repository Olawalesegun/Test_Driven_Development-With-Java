package InterfaceWithList;

import java.util.Collection;

public interface JavaList{

    void add(String item);
    void add(int index, String element);
    String get(int index);
    void remove(String element);
    void remove(int index);
    int size();
}
