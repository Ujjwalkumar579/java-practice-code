package src.easy;

public class implementQue {
    static class Queue
    {
        static int[] arr;
        static int size;
        static int rear =-1;
        Queue(int n)
        {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty()
        {
            return rear == -1;
        }

        public static void add(int data)
        {
            if(rear == size-1)
            {
                System.out.println("Full queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue Empty");
                return -1;
            }

            int front = arr[0];

            for(int i=0;i<rear;i++)
            {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue Empty");
                return -1;
            }

            return arr[0];
        }

    }


    public static void main(String[] args) {
        Queue qu = new Queue(10);
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        Queue.add(4);
        Queue.add(5);

        while(!Queue.isEmpty())
        {
            System.out.print(Queue.peek()+" ");
            Queue.remove();
        }
    }
}
