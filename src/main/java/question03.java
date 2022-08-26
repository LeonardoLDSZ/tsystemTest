public class question03 {

    public static void main(String[] args) {

        int[] array = new int[5];

        int aux = 1;

        for (int i = 0; i < array.length; i++) {
            aux = aux * (i + 1);
            array[i] = aux / 2;
        }


        System.out.println(array[3]);

    }
}
