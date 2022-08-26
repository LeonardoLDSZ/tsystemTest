public class question01 {

    public static int randomMethod(int number) {
        return number == 0 ? 1 : number * randomMethod(number - 1);
    }

    public static void main(String[] args) {
        System.out.println(randomMethod(5));
    }
}
