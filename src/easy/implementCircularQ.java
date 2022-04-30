package src.easy;

public class implementCircularQ {
    static class circularQ
    {
       static int size;
       static int arr[];
        static int rear = -1;
        static int front = -1;

        circularQ(int size)
        {
            this.size = size;
             arr = new int[size];
        }

        public static boolean isEmpty()
        {
            return rear == -1 && front == -1;
        }

        public static boolean isFull()
        {
            return (rear+1)%size == front;
        }

        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("Queue is Full");
                return;
            }
            if(front == -1)
            {
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public static int remove()
        {
            if (isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            int res = arr[front];
            if(rear == front)
            {
                rear = -1;
                front = -1;
            }
            else
            {
                front = (front + 1) % size;
            }
            return res;
        }

        public static int peek()
        {
            if (isEmpty())
            {
                System.out.println("Queue Empty");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        circularQ cq = new circularQ(5);
        circularQ. add(1);
        circularQ.add(2);
        circularQ.add(3);
        circularQ.add(4);
        circularQ.add(5);
        System.out.println(circularQ.remove());
        circularQ.add(6);
        System.out.println(circularQ.remove());

        while(!circularQ.isEmpty())
        {
            System.out.print(circularQ.peek()+" ");
            circularQ.remove();
        }
    }
}
