public class ArrayQueue {

    public int[] queue;
    public int eoq;

    public ArrayQueue() {
        queue = new int[100];
        eoq = -1;
    }

    public void enqueue(int x) {
        eoq++;
        queue[eoq] = x;
    }

    public void dequeue() {
        for (int i=0;i<eoq;i++) {
            queue[i] =queue[i+1];
        }
        eoq--;
    }

    public int front() {
        //System.out.println(queue[0]);
        return queue[0];
    }

    public int back() {
        System.out.println(queue[eoq]);
        return queue[eoq];
    }

    public Boolean empty() {
        if (eoq==-1) {
            return true;
        }
        else {
            return false;
        }
    }

    public void concat(ArrayQueue second) {
        while (!second.empty()) {
            eoq++;
            queue[eoq] = second.front();
            second.dequeue();
        }
    }
}
