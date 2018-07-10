public class ex1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = b * b - 4 * a * c;
        double x1 = 0, x2 = 0;
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1=" + x1 + "\n" + "x2=" + x2);
        } else if (d == 0) {
            x1 = -b / (2 * a);
            System.out.println("x1=x2=" + x1);
        } else
            System.out.println("ÎÞÊµ¸ù");
    }

}


