package deleteDemo;

import java.util.Scanner;

/**
 *  ��Ƴ�����ʾ�û�����һ���ַ�����Ȼ������ʾ�û�����һ���ַ�������ַ����д�������ַ����ͽ���ɾ����
����ʾɾ�����ַ�����ַ�����
1���ύ�ɸ��Ʊ����Դ���txt�ļ���
2������淶��д���룬������������ע�͡���������Ŀ���ȣ�
3�����뾡����ࣨ���ص㣩��
 * @author miku
 *
 */
public class deleteDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//���������ַ�
		String numer = null;
		System.out.println("������һ���ַ�����");
		//�����ַ���
		String a = input.nextLine();
		System.out.println("Ȼ��˳������һ���ַ����������ַ���������һ���ַ������Ҿͽ���ɾ����");

		while(true)
		{
			int max = -1;
			char num = input.next().charAt(0);
			for (int i = 0; i < a.length(); i++) 
			{
				if(Character.toString(num).equals(Character.toString(a.charAt(i))))
				{//������ַ������ҵ����ַ���������ѭ��
					numer = Character.toString(num);
					max = i;
					break;
				}
			}
			//������ַ�����û���ҵ�
			if(max == -1)
			{
				System.out.println("��������ַ������ַ����ڣ�");
				System.out.println("�Ƿ�������룿(y\n)");
				if(input.next().equalsIgnoreCase("n"))
				{
					System.exit(0);
				}
			}
			else {
				break;
			}
		}
		
		String b[] = a.split(numer);
		System.out.println("ɾ��֮����ַ���Ϊ��");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
		
	}

}
