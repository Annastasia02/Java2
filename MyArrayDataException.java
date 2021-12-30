package Java2_2.Lesson2Home;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(String cellValue, int rowIndex, int colIndex){
        super(String.format("Не правильное значние %s в ячейке [%d][%d]",cellValue,rowIndex,colIndex));


    }
}
