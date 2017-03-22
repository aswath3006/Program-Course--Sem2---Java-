/**Shows what the 'P' literal does. */
/*Note:
    - System.out.print("\nThis is the number in:\n\tHexdecimal:\t0x12.2\n\tDecimal:\t"+0x12.2+"\n\tWorking of P\t"+0x12.2P2+"\n"); is invalid.
    - Float is turning out the be the most pointless data type.
    - Resason for unformed data
    */
class what_is_px_literals
{
    public static void main(String args[])
    {
        float a = 0x12;
        System.out.print("\nThis is the number in:\n\tHexdecimal:\t0x12.2\n\tDecimal:\t"+a+"\n\tWorking of P\t"+0x12.2P2+"\n");
    }
}