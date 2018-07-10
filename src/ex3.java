import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        //int grade = Integer.parseInt(args[0]);
        Scanner aa = new Scanner(System.in);
        System.out.print("请输入你的成绩：");
        int grade = aa.nextInt();
        switch (grade / 10) {
            case 10:
            case 9:
                System.out.println("优秀 ");
                break;

            case 8:
                System.out.println("良好 ");
                break;
            case 6:
                System.out.println("及格 ");
                break;
            default:
                System.out.println("不及格 ");
                break;

        }
        System.out.println("你的成绩是：" + grade);
    }

}
