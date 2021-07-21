import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Sweet sweet1 = new Sweet();
        sweet1.weight(2);

        Barbaris barbaris1 = new Barbaris();
        barbaris1.weight(5);

        //public static void sweets() {
            int[] myArray = {sweet1.weight, barbaris1.weight};
            int sum = 0;
            for (int i = 0; i < myArray.length; i++) {
                sum = sum + myArray[i];
            }
            System.out.println(sum);

        }


    }
