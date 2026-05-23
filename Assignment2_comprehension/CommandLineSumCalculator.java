public class CommandLineSumCalculator {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Exactly two numbers are required!");
            return;
        }

        try{
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            System.out.println(n1 + " + " + n2 + " = "  + (n1+n2));
            System.out.println(n1 + " x " + n2 + " = "  + (n1*n2));
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid Input type!");
        }
    }
}
