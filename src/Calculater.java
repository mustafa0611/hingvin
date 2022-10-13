
public class Calculater {
    public static int addition(int nummer1, int nummer2){
        return nummer1 + nummer2;
    }

    public static float substraktion(float nummer1, float nummer2){
        return nummer1 - nummer2; // 3 - 5 = -2
    }

    public static float multiplikation(float nummer1, float nummer2){
        return nummer1 * nummer2;
    }

    public static int divison1(int nummer1, int nummer2){
        if (nummer2 == 0){
            return Integer.MAX_VALUE;
        }

        return nummer1 / nummer2;
    }

    public static int divison2(int nummer1, int nummer2){
        int tmp;
        if (nummer2 == 0){
            tmp = Integer.MAX_VALUE;
        } else {
            tmp = nummer1 / nummer2;
        }

        return tmp;
    }
}
