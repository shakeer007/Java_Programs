public class UnaryOpetor{
    public static void main(String[] args) {
        int num1=25;
        System.out.println(num1);
        //post increment
        int num2=num1++;
        System.out.println(num1+""+num2);
        System.out.println(num2);
        //pre increment
        num2=++num1;
        System.out.println(num1+""+num2);
        
    }
}