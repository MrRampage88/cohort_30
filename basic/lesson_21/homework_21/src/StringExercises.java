public class StringExercises {
    public static void main(String[] args) {
        //Задча 1. Выполнить все упражнения, которые мы делали на занятии со строкой.
        // В качестве примера строки взять свое слово или короткое предложение,
        // например, "Меня зовут Имя и Фамилия".
        String sentence = "Меня зовут Михаил Расулов";

        // Подсчет количества символов в строке
        int charCount = sentence.length();
        System.out.println("Количество символов: " + charCount);

        // Разделение строки на слова
        String[] words = sentence.split(" ");
        System.out.println("Слова в предложении:");
        for (String word : words) {
            System.out.println(word);
        }

        // Преобразование строки в верхний и нижний регистр
        String upperCase = sentence.toUpperCase();
        String lowerCase = sentence.toLowerCase();
        System.out.println("Строка в верхнем регистре: " + upperCase);
        System.out.println("Строка в нижнем регистре: " + lowerCase);

        // Замена подстроки в строке
        String replaced = sentence.replace("Имя", "Иван");
        System.out.println("Замененная строка: " + replaced);
    }
}
