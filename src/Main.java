public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        int bmi = (int) service.calculate(105, 1.89);

        System.out.println("Ваш индекс массы тела равен " + bmi);
    }
}
