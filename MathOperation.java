public class MathOperation {
    public static void main(String[] args) {

        System.out.println(addition(20,30));

        MathOperation mo = new MathOperation();
        String result = mo.multiplication(20, 10); //
        System.out.println(result);  // Multiplication of 20, 10 is = 200

    }

    static int addition(int x, int y){
        return x + y;
    }

    String multiplication(int a, int b){
        return "Multiplication of " + a + ", " + b + " is = " + (a*b);
    }

    // .java(source code)  --> javac filename.java: compailer(.class) --> java filename --> output on console
}
