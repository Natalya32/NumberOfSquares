import ru.netology.sqr.NumberOfSquares.sevices.*;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.calcSqrNumber(900, 100));
    }
}