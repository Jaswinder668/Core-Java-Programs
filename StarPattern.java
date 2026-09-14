package CoreJava_Program;

public class StarPattern {
    public static void main(String[] args) {

        int[] rows = {1, 2, 1, 2, 3};

        for (int i = 0; i < rows.length; i++) {

            for (int j = 1; j <= rows[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
