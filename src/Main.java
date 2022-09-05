import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(name(21,20));
        System.out.println(name(100,-31));
        System.out.println(name( 34,22));
        System.out.println(name(21,66));
        System.out.println(name(33,23));
        System.out.println(name(generateRandomAge(),25));
    }
    public static  String name (int age , int temperature){
        if (20<=age && age <= 45 && -20 <= temperature && temperature <= 30){
            return  " можно идти гулять";
        } else if (20>= age && 0<= temperature && 28<= temperature) {
            return  "можно идти гулять";
        } else if (45<= age && -10 <= temperature && 25 <= temperature) {

          return " можно идти гулять";
        }
        else {
            return  "оставайтесь дома";
        }

    }public static int generateRandomAge (){
        Random random = new Random();
        int ageO = random.nextInt(100);
        return ageO;

    }
}