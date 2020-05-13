public class Media {
    static int i = 1;

    public static double media(double[] array) {
        if(i > 1) return -1;
        i += 1;

        double res = 0.0;
        for (double d : array) {
            res += d;
        }
        return res / array.length;
    }
}
