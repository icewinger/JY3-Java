import java.util.*;
public class Homework213 
{
    public static void main(String[] args) {
        long s1 = 1;
        long s2 = 1;
        int count;
        long temp;
        Scanner in = new Scanner(System.in);
		System.out.print("������Ҫ����·�");
        count = in.nextInt();
        for (int i = 1; i <= count; i++) {
            if (i == 1) {
                System.out.println("��" + i + "���µ����Ӷ�����" + s1);
                continue;
            } else if (i == 2) {
                System.out.println("��" + i + "���µ����Ӷ�����" + s2);
                continue;
            } else {
                temp = s2;
                s2 = s1 + s2;
                s1 = temp;
                System.out.println("��" + i + "���µ����Ӷ�����" + s2);
            }
        }
    }
}