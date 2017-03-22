class box
{
    int number;
    box(int i)
    {
        number=i;
    }
    int ten()
    {
        number+=10;
        return number;
    }
}
class reference_to_object
{
    public static void main(String args[])
    {
        box b = new box(2);
        box a;
        a=b;
        System.out.println(b.number);
        b.ten();
        System.out.println(a.number);
        System.out.println(b.number);
    }
}


/* This program includes a method inside the box class.
class Box {
double width;
double height;
double depth;
// display volume of a box
void volume() {
System.out.print("Volume is ");
System.out.println(width * height * depth);
}
}
class reference_to_object {
public static void main(String args[]) {
Box mybox1 = new Box();
Box mybox2 = new Box();
// assign values to mybox1's instance variables
mybox1.width = 10;
mybox1.height = 20;
mybox1.depth = 15;

mybox2.width = 3;
mybox2.height = 6;
mybox2.depth = 9;
// display volume of first box
mybox1.volume();
// display volume of second box
mybox2.volume();
}
}
*/