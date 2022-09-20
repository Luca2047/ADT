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

        public int top() {
            if (!empty()) {
                return stapel[tos];
            }
            else {
                return -1;
            }
        }

        public ArrayStack copy(ArrayStack arrayStack) {

            ArrayStack tmp = new ArrayStack();

            while (!arrayStack.empty()) {
                tmp.push(arrayStack.top());
                arrayStack.pop();
            }

            while (!tmp.empty()) {
                arrayStack.push(tmp.top());
                tmp.pop();
            }
            return arrayStack;
        }
}
