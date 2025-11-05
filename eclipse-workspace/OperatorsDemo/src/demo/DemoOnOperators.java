package demo;

// Demo for different types of operators
public class DemoOnOperators {

    public static void main(String[] args) {

        //Arithmetic operators
        int x=24, y=13;

        boolean a=true, b=false;

        System.out.println("The addition value"+(x+y));
        System.out.println("The Subtraction value"+(x-y));
        System.out.println("The Division value"+(x/y));
        System.out.println("The multiplication value"+(x*y));

        //Assignment operators
        int z=x;
        System.out.println("the value of z"+z); 
        z+=y; //z=z+y;
        System.out.println("the value of z"+z); 

        //Relational operators (<,>,==,<=,!=)
        System.out.println(x==y);

        //logical operators (&,^,&&,||,~)
        System.out.println("The result of and operation"+(x&y));

        //unary operators (++,--)
        int d=24; //post increment
        System.out.println("the post increment value is "+d++); 
        System.out.println("the post increment value is "+d); 
        //pre increment
        ++d;
        System.out.println(d);
        d--;
        System.out.println(d);
        --d;
        System.out.println(d);

        //ternary operators (condition ? true : false)
        int a1=13, b1=13;
        int max = (a1<b1) ? a1 : b1;
        System.out.println("The max value is "+max);
    }
}
