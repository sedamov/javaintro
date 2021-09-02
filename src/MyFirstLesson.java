public class MyFirstLesson {

    /**
     * this is a java doc comment
     */
    public  static  void main(String[] args) {
        int firstVariable;

        int a = 5;

        a %= 2;
        System.out.println(a);
        //this is a line comment

        /*
        this is a block comment
         */

        firstVariable = 50;
        System.out.println(firstVariable);
        int secondVariable = 100;;
        firstVariable = secondVariable;
        System.out.println(firstVariable);
        System.out.println(secondVariable);

        float thirdVar = 1.5f;
        double doubleVar = 0.44;
        System.out.println(doubleVar);
        char armSymbol = '\u0536';
        char simplSymbol = 'Զ';
        System.out.println(armSymbol);
        System.out.println(simplSymbol);

        boolean isDark = false;
        System.out.println(isDark);
    }
}
