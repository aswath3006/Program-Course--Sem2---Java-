/*Error Thrown:
    Exception in thread "main" java.lang.ArithmeticException: / by zero
        at error_handling_intro_without_blocks.main(error_handling_intro_without_blocks.java:11)
    --Run Time Error.
*/
class error_handling_intro_without_blocks
{
    public static void main(String args[])
    {
        int a=20, d=0;
        System.out.print("\nTrying this statement"+(a/d));
    }
}