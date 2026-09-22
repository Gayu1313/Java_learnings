public class MethodExample{
    static void display(){
        System.out.println("hello");
    }
    static void greet(String a){
        System.out.println("hello");
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int display1(){
        return 10;
    }
    public static void main(String[] args){
        display();
        greet("billa");
        System.out.println(sum(10,20));
        System.out.println(display1());
      }
    }