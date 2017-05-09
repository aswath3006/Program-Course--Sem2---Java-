import java.util.*;


class node  //Data Structure
    {
        node next;
        int data;
        node(int data)
        {
            this.data=data;
        }
    }
public class linkedlist
    {
        node head;
        int x;
        void append(int data)   //Insertion
            {
                if(head==null)
                    head=new node(data);        //Check if List is empty
                node current = head;            //Assing manipulator variable (current) the location of head.
                while(current.next!=null)       //Cycle to current node
                    current=current.next;       //To advance to next node.
                current.next=new node(data);    //Create new head with data from user.
            }
        
        void prepend(int data)
            {
                node current = new node(data);
                current.next=head;
                head=current;
            }
        void delete(int data)
            {
                if(head==null)
                    {
                        System.out.print("\nEmpty Stack");
                        return;
                    }
                if(head.data==data)
                    head=head.next;
                node current = head;
                while(current!=null)
                    {
                        if(current.next.data==data) //one next points to the next next.
                            {
                                current.next=current.next.next;
                                return;
                            }
                        current=current.next;
                    }
            }
        void display()
            {
                node current = head;
                while(current.next!=null)
                    {
                        System.out.print("\n"+current.data);
                        current = current.next;
                    }
            }
        public static void main(String args[])
            {
                linkedlist worker = new linkedlist();
                worker.append(6);
                worker.append(3);
                worker.append(14);
                worker.append(8);
                worker.append(7);
                worker.append(1);
                //Dispaly
                System.out.print("\nThe elements are:");
                worker.display();
                worker.prepend(10);
                worker.prepend(20);
                System.out.print("\nThe elements are:");
                worker.display();
                worker.delete(6);
                worker.delete(3);
                System.out.print("\nThe elements are:");
                worker.display();
                System.out.print("\n\nExiting");
            }
    }