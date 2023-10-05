package pro.sky.skyprospringdemo.example;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
//        Объявление массива и листа
        Integer[] numbersArray = {1, 2, 3};
        List<Integer> numbersList = new ArrayList<>(List.of(9, 2, 3, 5));
//        Map<String, Integer> numbersMap = new HashMap<>();
        Map<String, Integer> numbersMap = new HashMap<>(Map.of("four", 4, "five", 5));
        Map<String, Integer> numbersMap2 = Map.of("four", 4, "five", 5);
        Set<Integer> numbersSet = new HashSet<>(List.of(1, 2, 40, 12));

//        Получение значения по ключу
        final Integer num = numbersArray[0]; numbersList.get(0); numbersMap.get("two"); /*--------*/

//        Запись значения в элемент
        numbersArray[1] = 10;  numbersList.set(1, 10);  numbersMap.put("one", 1); /*------------*/
                                                        numbersMap.put("two", 2);
//         Получение размера
        System.out.println(numbersArray.length);
        System.out.println(numbersList.size());
        System.out.println(numbersMap.size());

//          Получение строки с содержимым
        Arrays.toString(numbersArray);
        numbersList.toString();
        numbersMap.toString();
        numbersSet.size();

//        Добавление элемента в конец коллекции
        numbersList.add(56);
        numbersMap.put("Нет конца и начала", 3);
        numbersSet.add(256); /*нет начала и конца*/

//        Проверить есть ли элемент в коллекции
        /*массив - цикл*/
        numbersList.contains(56);           numbersMap.containsKey("ключ");            numbersSet.contains(45);
                                            numbersMap.containsValue(3);


        numbersSet.add(256);
        System.out.println(numbersMap.get("two"));
        System.out.println(numbersMap.toString());
        System.out.println(numbersSet);
    }
}
