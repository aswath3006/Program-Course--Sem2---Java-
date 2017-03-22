class error_handling_intro_with_blocks
{
    public static void main(String args[])
    {
        int a=20, d=0, c;
        try
            {
                c=a/d;
            }
        
        catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.print("\nCannot divide by 0");
        }
        System.out.print("\nStatments after exception handled.\n");
    }
}