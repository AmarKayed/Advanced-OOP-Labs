package com.company.examples;

public class Operators {

    public static void main(String[] args) {
//        1. Postfix increment si decrement: expr++, expr--
        int age = 23;
        System.out.println(++age);
        System.out.println(age);



//        2. Prefix incremet si decrement si unary: ++expr, +expr, -expr, !, !
        int total = 45;
        System.out.println(--total);
//        3. Multiplicativi: *, /, %
        System.out.println(4 % 2);

//        4. Aditivi: +, -, concatenare stringuri: +. Asociativitatea este de la stanga la dreapta!

        System.out.println(2 + 2);
        String firstName = "Diana";
        String lastName = "Maftei";

        System.out.println(firstName + " " + lastName);

//        5. Shiftare: <<, >>, >>>

        System.out.println(2 << 3);

//        6. Relationali:
        Byte b = 2;

        System.out.println(b instanceof Byte);
        System.out.println(b instanceof Number);
        System.out.println(b instanceof Object);


//        7. Egalitate: ==, !=
        System.out.println("-------------");
        System.out.println(2 == 2);
        System.out.println("cat" == new String("cat"));

//        8. Bitwise AND(&)
//        9. Bitwise exclusive OR(^)
//        10. Bitwise inclive OR



    }
}
