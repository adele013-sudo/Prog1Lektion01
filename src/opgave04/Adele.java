package opgave04;

public class Adele {
    public static void main(String[] args){
        String[] a= {
                "   ***   ",
                "  *   *  ",
                " *     * ",
                " ******* ",
                " *     * ",
                " *     * ",
                " *     * "
        };
        String[] d = {
                " ****  ",
                " *   * ",
                " *   * ",
                " *   * ",
                " *   * ",
                " *   * ",
                " ****  "
        };

        String[] e = {
                " ***** ",
                " *     ",
                " *     ",
                " ****  ",
                " *     ",
                " *     ",
                " ***** "
        };

        String[] l = {
                " *     ",
                " *     ",
                " *     ",
                " *     ",
                " *     ",
                " *     ",
                " ***** "
        };
        String[] E = {
                " ***** ",
                " *     ",
                " *     ",
                " ****  ",
                " *     ",
                " *     ",
                " ***** "
        };

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " " + d[i] + "  " + e[i] + "  " + l[i] + "  " + E[i]);
        }
    }
}
