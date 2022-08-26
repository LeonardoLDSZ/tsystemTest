public class question04 {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 4;

        if (a > b && a > c) {
            if (b > c) {
                System.out.printf("%d, %d, %d",a,b,c);
            } else {
                System.out.printf("%d, %d, %d",a,c,b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.printf("%d, %d, %d", b, a, c);
            } else{
                System.out.printf("%d, %d, %d",b, c, a);
            }
        } else {
            if(c > a) {
                System.out.printf("%d, %d, %d", c, a, b);
            } else {
                System.out.printf("%d, %d, %d", c, b, a);
            }
        }
    }
}