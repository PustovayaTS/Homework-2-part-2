public class Main {
    public static void main(String[] args) {

        int[] arr = generateRandomArray();
        int sum = 0;
        int max = 0;
        int min = arr[0];
        for (int j : arr) {
            sum += j;
            if (max < j) {
                max = j;
            }
            if (min > j) {
                min = j;
            }
        }
        System.out.println("Задание 1");
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println("Задание 2");
        System.out.println("Минимальная сумма трат за день составила "+min+" рублей. " +
                           "Максимальная сумма трат за день составила " + max + " рублей"
        );
        System.out.println("Задание 3");
        System.out.println("Средняя сумма трат за месяц составила " + sum / arr.length + " рублей");
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int r = reverseFullName.length - 1; r >= 0; r--) {
            System.out.print(reverseFullName[r]);
        }

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}