package createClassException;

/**
 * Created by Мария on 04.04.2016.
 * исключение - четное число.
 */
public class Main {
    public static void main(String[] a) {
        int number = 8;
        GenerateException exp = new GenerateException();
        try {
            exp.evenNumber(number);
        }
        catch(EvenNumber_Exception e){
            System.out.println(number + "  Исключение");

        }


    }
}
