/*-----------------------This program shows the order of initialization of classes during inheritance.
The program contains 3 classes, 1 super-super-classes, 1 super-sub-classes and 1 sub-class.
The super-super-class is driver, the super-sub-class is car and the sub-class is garage.
The order of initialization is from the top super-class to the bottom sub-class. Java follows the top-bottom approach, opposite to that of C++. */

class driver
    {
        driver()
            {
                System.out.print("\nThe driver is now inside. (Super Class)\n");
            }
    }
class car extends driver
    {
        car()
            {
                System.out.print("\nThe car is ready.\n");
            }
    }

class garage extends car
    {
        garage()
            {
                System.out.print("\nThe garage is ready.\n");
            }
    }

class inheritance_initialization_order
    {
        public static void main(String args[])
            {
                System.out.print("\n-----Inheritance Initialization Order----\n");
                garage g = new garage();
                car c = new car();
                System.out.print("\n");
            }
    }