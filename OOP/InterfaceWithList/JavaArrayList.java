package InterfaceWithList;


public class JavaArrayList implements JavaList {
    private int counter;
    private int lengthOfArray;
    private String[] elementsCollector;

    public JavaArrayList(){
        this.counter = counter;
        this.lengthOfArray = lengthOfArray;
    }

    @Override
    public void add(String element) {
        if (counter == 0) {
            lengthOfArray = 5;
            elementsCollector = new String[lengthOfArray];
        }
        if (counter == lengthOfArray) {
            increaseArrayLength();
        }
        elementsCollector[counter] = element;
        counter++;
    }

    @Override
    public void add(int index, String element) {
        if (index < counter) {
            if (counter == lengthOfArray) {
                increaseArrayLength();
            }
            implementAdd(index, element);
            counter++;
        }


    }

    @Override
    public String get(int index) {
        return elementsCollector[index];
    }

    @Override
    public void remove(String element) {
        for (int i = 0; i < lengthOfArray - 1; i++) {
            if (element.equals(elementsCollector[i])) {
                implementRemoval(i);
            }
        }
    }

    @Override
    public void remove(int index) {
        for (int i = 0; i < lengthOfArray - 1; i++) {
            if (i == index) {
                implementRemoval(i);
            }
        }

    }

    @Override
    public int size() {
        return counter;
    }

    private void increaseArrayLength() {
        lengthOfArray = lengthOfArray * 2;
        String[] array2 = new String[lengthOfArray];
        for (int i = 0; i < counter; i++) {
            array2[i] = elementsCollector[i];
        }
        elementsCollector = array2;
    }

    public void implementAdd(int index, String item) {
        String[] array1 = new String[lengthOfArray + 1];
        int loop = 0;
        int new_length = 0;
        while (loop <array1.length) {
            if (loop == index) {
                array1[loop] = item;
            } else {
                array1[loop] = elementsCollector[new_length];
                new_length++;
            }
            loop++;
        }
        elementsCollector = array1;
    }

    public void implementRemoval(int i) {
        elementsCollector[i] = null;
        counter--;
        for (int j = i; j < lengthOfArray - 1; j++) {
            elementsCollector[j] = elementsCollector[j + 1];
        }
    }
}