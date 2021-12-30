package Java2_2;

import Java2_2.Lesson2Home.MyArrayDataException;
import Java2_2.Lesson2Home.MyArraySizeException;

public class Lesson2 {

    private static final int REQUIRED_ARRAY_SIZE = 4;

    private static final String[][] CORRECT_DATA = new String[][]{
            {"1","2","3","4"},
            {"5","6","7","8"},
            {"9","10","11","12"},
            {"13","14","15","16"}
    };
    private static final String[][] INCORRECT_SIZE_DATA = new String[][]{
            {"1","2","3","4"},
            {"5","6","7","8"},
            {"9","10","11"},
            {"13","14","15","16"}
    };
    private static final String[][] INCORRECT_VALUE_DATA = new String[][]{
            {"1","2","3","4"},
            {"5","hi","7","8"},
            {"9","10","11","12"},
            {"13","14","15","16"}
    };

    public static void main(String[] args) {
        try {
            int sum = sumArrayValue(INCORRECT_SIZE_DATA);
            System.out.println("sumArrayValue(INCORRECT_SIZE_DATA)=" +sumArrayValue(INCORRECT_SIZE_DATA));
            sumArrayValue(INCORRECT_SIZE_DATA);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e){
            System.out.println(e.getMessage());
        }
    }

    private static int sumArrayValue(String[][] data){
        checkValue(data);
        int sumResult = 0;

        for (int rowIndex = 0; rowIndex < data.length; rowIndex ++){
            String[] row = data[rowIndex];
            for (int colIndex = 0;colIndex < row.length; colIndex ++){
                String stringValue = row[colIndex];
                try {
                  int intValue = Integer.parseInt(stringValue);
                  sumResult += intValue;
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(stringValue, rowIndex, colIndex);

                }
            }
        }
        return sumResult;
    }

    private static void checkValue (String[][] data){
        if(data.length != REQUIRED_ARRAY_SIZE){
            throw new MyArraySizeException();
        }
        for (String[] row : data) {
            if (row.length != REQUIRED_ARRAY_SIZE){
                throw new MyArraySizeException();
            }
        }

    }

}
