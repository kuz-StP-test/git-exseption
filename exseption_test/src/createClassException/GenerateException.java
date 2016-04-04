package createClassException;

/**
 * Created by Мария on 04.04.2016.
 */
public class GenerateException {
    //функция проверки на четность
        public void evenNumber(int number) throws EvenNumber_Exception {
        if(number%2 == 0) throw new EvenNumber_Exception(number);
            System.out.println(number + " - не четное число");

    }
}
