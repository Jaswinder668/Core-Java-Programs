import java.util.*;

public class Pascal_Triangle {
    public static void main(String[] args) {
       ListIterator e= pascal(5).listIterator();
      while(e.hasNext()){
          System.out.println(e.next());
      }
    }
    public static List<List<Integer>> pascal(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                int value = res.get(i - 1).get(j-1)
                        + res.get(i - 1).get(j);

                row.add(value);
            }
            if (i > 0) {
                row.add(1);
            }

            res.add(row);
        }
        return res;
    }
}
