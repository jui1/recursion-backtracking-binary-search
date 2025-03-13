package bitmanupulation;

public class nonrepetingnumber {
    public static void main(String[] args) {
        int[] arr = { 12, 12, 5, 8, 4, 5, 4 };
        System.out.println(ans(arr));

    }

    public static int ans(int[] arr) {
        int un = 0;
        for (int n : arr) {
            un ^= n;
        }

        return un;
    }
}
