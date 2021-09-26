package classwork.lesson8;

public class Classwork8 {

    public static void main(String[] args) {

        String literalStr1 = "abc";
        String literalStr2 = "abc";

        System.out.println("Comparing reference values : " + (literalStr1 == literalStr2));
        System.out.println("Comparing object values : " + (literalStr1.equals(literalStr2)));

        String objectStr = new String("abc");
        String objectStr1 = new String("abc");

        char[] charArr = {'H', 'e', 'l', 'l', 'o'};
        String str = new String(charArr, 1, 3);
        byte[] byteArr = {97,98,99};
        String byteString = new String(byteArr, 1, 2);
        System.out.println("String value with char is: " + str);
        System.out.println("String value with byte is: " + byteString);

        StringBuilder strBuilder = new StringBuilder("abc");
        strBuilder.append(34);
        strBuilder.append("bc");

        String result = strBuilder.toString();
        System.out.println("StringBuilder value: " + strBuilder);
        System.out.println("Char At 2 : " + strBuilder.charAt(2));
        System.out.println("Index of bc: " + strBuilder.indexOf("bc"));
        System.out.println("Last Index of bc: " + strBuilder.lastIndexOf("bc"));
        System.out.println("Starts with : " + result.startsWith("ab"));
        String subStr = result.substring(1, 6);
        StringBuilder reverseString = new StringBuilder(subStr);
        reverseString = reverseString.reverse();
        System.out.println("Substring : " + new StringBuilder(subStr).reverse());
    }
}
