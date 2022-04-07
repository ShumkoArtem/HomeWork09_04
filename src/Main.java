
public class Main {
    /**
     * Задание 6
     * Создайте интерфейс IMath. В нём должно быть триметода:
     * ■■ int Max() — возвращает максимум;
     * ■■ int Min() — возвращает минимум;
     * ■■ float Avg() — возвращает среднеарифметическое.
     * Класс Array, созданный ранее, должен имплементировать интерфейс IMath.
     * Метод Max — возвращает максимум среди элементовмассива.
     * Метод Min — возвращает минимум среди элементовмассива.
     * Домашнее задание
     * 3
     * Метод Avg — возвращает среднеарифметическое среди элементов массива.
     * Напишите код для тестирования полученной функциональности.
     * <p>
     * Задание 7
     * Создайте интерфейс ISort. В нём должно быть два метода:
     * ■■ void SortAsc() — сортировка по возрастанию;
     * ■■ void SortDesc() — сортировка по убыванию.
     * Класс Array, созданный ранее, должен имплементировать интерфейс ISort.
     * Метод SortAsc — сортирует массив по возрастанию.
     * Метод SortDesc — сортирует массив по убыванию.
     * Напишите код для тестирования полученной функциональности.
     */
    public static void main(String[] args) {
        // рандомно выбираем  cjpacity
        int copacityList = (int) (Math.random() * 20);
        System.out.println("Copacity" + copacityList);// проверка

        //создаем объект класса
        ArrayInt arr = new ArrayInt(copacityList);

        //заполняем ArrayList
        for (int i = 0; i < copacityList; i++) {
            arr.collectionAdd((int) (Math.random() * 101));
        }
        System.out.println(arr.toString()); // проверка

        //вызываем метод для замены элемента
        arr.setElement(0, 50);

        //Max value
        int max = arr.Max();
        System.out.println("Max number is : " + max);
        //Min value
        int min = arr.Min();
        System.out.println("Min number is : " + min);
        //Avg value
        float avg = arr.Avg();
        System.out.println("Avg number is : " + avg);
        // сортировка по возростанию
        arr.sortAsk();
        // сортировка по убыванию
        arr.sortDesk();
    }
}
