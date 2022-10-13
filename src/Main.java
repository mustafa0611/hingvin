

public class Main {

    public static void main(String[] args) {

//        Quader quader1 = new Quader();
//        Quader quader2 = new Quader();

//        String hengvin = "hengvin"; // char -> 'a', String -> "fdsf fsjd fdsh fjs"
//        VoidMethoden.printName("mustafa", "m",1);
//        VoidMethoden.printName(hengvin, "a", 2);

        System.out.println(
                Calculater.addition(1, 2)
        );

        System.out.println(
                Calculater.addition(10, 20) == 31
        );

        System.out.println(
                "Die Summe von sub 5 und 4 ist: " + Calculater.substraktion(5, 4)
        );

        System.out.println(Calculater.substraktion(3, 5));
        System.out.println(Calculater.substraktion(1.4f, 10.9f));

        System.out.println(Calculater.multiplikation(554, 65));


        System.out.println(Calculater.divison2(100, 10));

        System.out.println(Calculater.divison2(0, 100));

        System.out.println(Calculater.divison2(100, 0));

        // Test
        System.out.println(Calculater.divison1(100,0) == Calculater.divison2(100, 0));
        System.out.println(Calculater.divison1(100,10) == Calculater.divison2(100, 10));
        System.out.println(Calculater.divison1(100,103) != Calculater.divison2(100, 10)); // nicht equal
        System.out.println(Calculater.divison1(100,103) == Calculater.divison2(100, 10)); // equal
        System.out.println("nicht true = " + !true);
        System.out.println("nicht false = " + !false);
    }





}
