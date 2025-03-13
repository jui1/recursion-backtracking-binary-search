package stackandquee;

import java.util.LinkedList;
import java.util.Queue;

public class quee {
    public static void main(String[] args) {
        Queue<Integer> ans = new LinkedList<>();
        ans.add(0);
        ans.add(9);
        ans.add(9);
        ans.add(9);
        ans.add(9);
        ans.add(9);
        ans.add(9);
        ans.add(9);
        ans.add(9);

        ans.add(9);
        ans.add(9);
        ans.add(9);

        System.out.println(ans.peek());
    }

}
