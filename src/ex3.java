import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        //int grade = Integer.parseInt(args[0]);
        Scanner aa = new Scanner(System.in);
        System.out.print("��������ĳɼ���");
        int grade = aa.nextInt();
        switch (grade / 10) {
            case 10:
            case 9:
                System.out.println("���� ");
                break;

            case 8:
                System.out.println("���� ");
                break;
            case 6:
                System.out.println("���� ");
                break;
            default:
                System.out.println("������ ");
                break;

        }
        System.out.println("��ĳɼ��ǣ�" + grade);
    }

}
