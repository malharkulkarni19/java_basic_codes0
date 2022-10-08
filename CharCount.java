public class CharCount {
    public static void main(String[] args){
        char myChar = 'P';
        System.out.println(myChar);

        char myChar1 = '1';
        System.out.println(myChar1);

        //char sizeOfChar1 = Character.MAX_VALUE;
        //char sizeOfChar2 = Character.MIN_VALUE;
        //System.out.println(sizeOfChar1);
        //System.out.println(sizeOfChar2);

        //From Unicode table, we actually print symbols that we can't find on Keyboard.
        //Example:-

        char firstsymbol = '\u00A5';
        System.out.println(firstsymbol);

        char firstsymbol1 = '\u1F97';
        System.out.println(firstsymbol1);

        //L with a dot
        char firstSymbol2 = '\u013F';
        System.out.println(firstSymbol2);
    }
}
