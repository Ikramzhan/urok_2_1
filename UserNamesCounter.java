import java.util.HashMap;



public class UserNamesCounter {



    public static void main(String[] args) {

        // Создаем HashMap для хранения имен и количества их вхождений

        HashMap<String, Integer> nameCount = new HashMap<>();



        // Принимаем имена пользователей в качестве аргументов командной строки,

        // но также можно задать имена по умолчанию

        String[] userNames = new String[5];

        if (args.length >= 5) {

            for (int i = 0; i < 5; i++) {

                userNames[i] = args[i];

            }

        } else {

            userNames = new String[]{"Elena", "Elena", "Elena", "Ivan", "Ivan"};

        }



        // Подсчитываем количество вхождений каждого имени и записываем в HashMap

        for (String name : userNames) {

            if (nameCount.containsKey(name)) {

                nameCount.put(name, nameCount.get(name) + 1);

            } else {

                nameCount.put(name, 1);

            }

        }
    }
    private HashMap<String, Integer> names;
    private char[] nameCount;

public void showNamesOccurrences() {

            for (String name : names.keySet()) {
    
                int count = names.get(name);

        // Выводим результат в виде пар "имя - количество"

        System.out.println(nameCount);

    }


        
    }
}