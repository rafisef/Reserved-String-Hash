import java.util.Random;

/**
 * Created by Rafael on 5/6/2016.
 */
public class Test {
    private static final String [] reserved =
            { "and",
                    "begin",
                    "define",
                    "do",
                    "else",
                    "end",
                    "if",
                    "not",
                    "or",
                    "return",
                    "then",
                    "while" };

    private static int hash(String name) //finds a perfect hash function by multiplying the first character as an int by the length of the word
    {
        int t = name.charAt(0);
        int length = name.length();
        return t*length;
    }

    public static void main(String [] args)
    {
        for (int index = 0; index < reserved.length ; index += 1)
        {
            System.out.print("h(\"" + reserved[index] + "\") = ");
            System.out.print(hash(reserved[index]));
            System.out.println();
        }
    }
}

/*
h("and") = 291
h("begin") = 490
h("define") = 600
h("do") = 200
h("else") = 404
h("end") = 303
h("if") = 210
h("not") = 330
h("or") = 222
h("return") = 684
h("then") = 464
h("while") = 595
 */