public class UncommonBug {
    public static void main(String[] args) {
        int x = 0;
        int y = 10;

        // This loop will run infinitely because x never changes
        while (x < y) {
            System.out.println(x);

            //The increment is missing
            //x++;
        }
    }
}