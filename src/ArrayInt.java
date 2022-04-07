import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayInt implements IMath, Sort {
    /**
     * Создайте класс ArrayInt.
     * У класса Array должно быть 1 поле: private ArrayList<Integer> array;
     * Добавьте конструктор (с параметром opacity для коллекции), сеттер, геттер.
     * Добавьте функцию в класс ArrayInt для добавления и измения элементов в коллекции.
     * <p>
     * Этот класс ArrayInt используйте в задании 6 и 7 вместо класса Array.
     */
    private ArrayList<Integer> array;

    public ArrayInt(int copacity) {
        array = new ArrayList<>(copacity);
    }

    public ArrayList<Integer> getArray() {
        return array;
    }

    public void setArray(ArrayList<Integer> array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ArrayInt{" +
                "array=" + array +
                '}';
    }

    //метод для добавления элементов в коллекцию
    public void collectionAdd(int num) {
        array.add(num);
    }

    //метод для замены элементов в коллекции
    public void setElement(int index, int newNum) {
        array.set(index, newNum);
        System.out.println("После замены Элемента (к примеру первого) :" + array.toString());
    }


    @Override
    public int Max() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.size(); i++) {
            if (max < array.get(i)) {
                max = array.get(i);
            }
        }
        return max;
    }

    @Override
    public int Min() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
            }
        }
        return min;
    }

    @Override
    public float Avg() {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        float avg = sum / array.size();
        return avg;
    }

    @Override
    public void sortAsk() {
        Collections.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int result = o1 - o2;
                if (result == 0) {
                    return o1;
                }
                return result;
            }
        });
        System.out.println("Сортировка по возростанию " + array.toString());
    }

    @Override
    public void sortDesk() {
        Collections.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int result = -(o1 - o2);
                if (result == 0) {
                    return o1;
                }
                return result;
            }
        });
        System.out.println("Сортировка по убыванию " + array.toString());
    }

}
