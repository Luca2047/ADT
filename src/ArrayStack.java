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

        public ArrayStack copy() {

            ArrayStack tmp = new ArrayStack();
            ArrayStack copy = this;

            while (!copy.empty()) {
                tmp.push(copy.top());
                copy.pop();
            }
            while (!tmp.empty()) {
                copy.push(tmp.top());
                tmp.pop();
            }
            return copy;
        }

        public void connect(ArrayStack arrayStack) {
            while (!arrayStack.empty()) {
                this.push(arrayStack.top());
                arrayStack.pop();
            }
        }
}