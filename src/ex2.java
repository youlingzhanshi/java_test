public class ex2 {

    public static void main(String[] args) {
        int y = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        boolean leapyear = (y % 400 == 0 || y % 4 == 0 && y % 100 != 0);
        switch (m) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("此月有30天");
                break;
            case 2:
                if (leapyear)
                    System.out.println("闰年2月有29天");
                else
                    System.out.println("平年2月有28天");
                break;
            default:
                System.out.println("此月有31天");


        }


    }
}
