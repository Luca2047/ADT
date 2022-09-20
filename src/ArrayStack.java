public class ArrayStack {

    private int[] stapel;
    private int   tos;

    public ArrayStack() {

        stapel = new int[100];
        tos   = -1;
        }

        public void push(int x) {
            if (tos < 99) {
                tos++;
                stapel[tos] = x;
            }
        }

        public void pop() {
            if (!empty()) {
                tos--;
            }
        }

        public Boolean empty() {
            if (tos==-1) {
                return true;
            }
            else {
                return false;
            }
        }

        public void top() {
            if (!empty()) {
                System.out.println(stapel[tos]);
            }
            else {
                System.out.println(-1);
            }
        }
}
