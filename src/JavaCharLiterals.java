public class JavaCharLiterals {
    public static void main(String[] args) {
        char myFirstChar = 'a';
        char mySecondChar = 'b';
        char myThirdChar = 'c';
        char plusInUnicode = '\u002b';

        System.out.println("First three letter of the alphabet: "
                + myFirstChar + mySecondChar + myThirdChar);

        //Escape sequence as character literals
        System.out.println("The same three characters on separate lines: "
                + "\n" + myFirstChar
                + "\n\t" + mySecondChar
                + "\n" +myThirdChar);

        //Unicode character literal
        System.out.println("Letter a added to letter b: " +
                myFirstChar + plusInUnicode + mySecondChar);
    }
}
