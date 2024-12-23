public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 0;
        int y = 10;

        while (x < y) {
            System.out.println(x);
            x++; // Increment x to prevent infinite loop
        }
    }
}