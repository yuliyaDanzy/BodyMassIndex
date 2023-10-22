public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 98;// вес вводится в килограммах целым числом
        double height = 1.87;// рост вводится в метрах в виде дробного числа с двумя знаками после точки
        int index = service.calculate(mass, height); // должно получиться 28
        System.out.println(index);
    }
}