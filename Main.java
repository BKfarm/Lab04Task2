public class Main
{
    public static void main(String[] args)
    {
        double spring = 198.99;
        System.out.println("Home maintenance costs for Spring: " + spring);
        double summer = 289.72;
        System.out.println("Home maintenance costs for Summer: " + summer);
        double fall = 378.21;
        System.out.println("Home maintenance costs for Fall: " + fall);
        double winter = 400.00;
        System.out.println("Home maintenance costs for Winter: " + winter);
        double totalCost = spring + summer + fall + winter;
        System.out.println("Your yearly home maintenance cost is: $" + totalCost);
        
    }
}