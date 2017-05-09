import java.util.*;
class stack
    {
        static int top=-1;
        final static int size=10;
        static int[] array = new int[size];
        static void push(int value)
            {
                if(top>=size)
                    System.out.print("\nOverflow.");
                else
                    {
                        array[++top]=value;
                    }
            }
        static void pop()
            {
                if(top==-1)
                    System.out.print("\nUnderflow.");
                else
                    --top;
            }
        static void display()
            {
                /* Cannot use the following for-each loop as value is not actually deleted
                    and this will print everything in the array.
                    
                    for(int x:array)
                    System.out.print("\n"+x);
                */
                for(int i=top; i>=0; i--)
                    System.out.print("\n"+array[i]);
            }
        public static void main(String args[])
            {
                System.out.print("\n\nStack");
                push(6);
                push(7);
                push(8);
                push(2);
                push(10);
                display();
                System.out.print("\n\nStack");
                pop();
                pop();
                display();
                System.out.print("\n\nExiting\n");
            }
    }