package Java2_2.Lesson2Home;

public class MyArraySizeException extends IllegalArgumentException {

    public MyArraySizeException(){
        super("Не правильный размер, идеально 4x4");
    }

}
