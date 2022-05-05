public class control {
    public static void main(String[] args) {
        condition condit = new condition();
        int[] arr= {3,5,3,66,4,6};
        condit.repetition(5, arr, 4);
    }
}

class condition {
    public void repetition(int loop_counter, int[] Array, int target) {
        for (int i = 0; i < loop_counter; i++) {
            if (Array[i] == target) {
                System.out.println("Founded! (Index: " + i + ")");
            }
        }
    }
}