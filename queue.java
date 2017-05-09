import java.util.*;

import javax.net.ssl.ExtendedSSLSession;
class queue_op
    {
        public int rear=-1, front=-1;
        final int size=10;
        int[] array=new int[size];

        void enqueue(int value)
            {
                if(front>=size-1) //or rear
                    System.out.print("\nQueue is full.\n");
                else
                        array[++front]=value;
            }
        void dequeue()
            {
                if(front==-1)
                    System.out.print("\nQueue is empty.\n");
                else
                    rear++;
                if(rear==front)
                    front=rear=-1;
            }
        void display()
            {
                if(front==-1&&rear==-1)
                    System.out.print("\nQueue is empty.\n");
                else
                    {
                        System.out.print("\nValues in the queue are:\n");
                        for(int i=rear;i<=front;i++)
                            {
                                if(rear==-1)
                                    continue;
                                System.out.print(array[i]+"\n");
                            }
                    }

            }
    }
class queue
    {
        public static void main(String args[])
            {
                queue_op Q = new queue_op();
                System.out.print("\n\nQueue");
                Q.display();
                Q.enqueue(6);
                Q.enqueue(7);
                Q.enqueue(9);
                Q.dequeue();
                Q.dequeue();
                Q.display();
                System.out.print("\n\nExiting....");
            }
    }