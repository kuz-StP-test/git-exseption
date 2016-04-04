package createClassException;

/**
 * Created by Мария on 04.04.2016.
 * Создаем свой класс исключение
 */
public class EvenNumber_Exception extends Exception {
    private int number;

    public EvenNumber_Exception(int number) {
        this.number = number;
    }
}
