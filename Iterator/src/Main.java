public class Main {
    public static void main(String[] args) {
        int min = 90;
        int max = 100;

        for (int r : new Randoms(min, max)) {
            System.out.println("случайное число: " + r);
            if (r == max) {
                System.out.println("Выпало число " + max + ", давайте на этом закончим");
                break;
            }
        }
    }
}