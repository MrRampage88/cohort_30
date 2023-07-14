public class SentenceManipulation {
    public static void main(String[] args) {
        //Задача 2.
        // Дано предложение: "Казнить нельзя помиловать".
        //Поменяйте первое и последнее слово в нем местами;
        //добавьте в него запятую на нужном месте и выведите на печать.


        String sentence = "Казнить нельзя помиловать";
        String[] words = sentence.split(" ");

        // Поменять первое и последнее слово местами
        String temp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = temp;

        // Добавить запятую
        words[words.length - 2] += ",";

        // Объединить слова в предложение
        String modifiedSentence = String.join(" ", words);

        System.out.println(modifiedSentence);
    }
}
