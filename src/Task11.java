public class Task11 {
    public static void main(String[] args) {
        System.out.println("Задание №11");
        long startSeconds = 133_414L;
        long days = startSeconds / 86400;
        long hours = (startSeconds % 86400) / 3600;
        long minuts = ((startSeconds % 86400) % 3600) / 60;
        long seconds = ((startSeconds % 86400) % 3600) % 60;
        System.out.println("сколько осталось дней до нового года")
                System.out.println("сколько осталось часов до нового года");
        System.out.println("сколько осталось минут до нового года");
        System.out.println("сколько осталось секунд до нового года");
    }
}
