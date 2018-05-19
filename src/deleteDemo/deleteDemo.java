package deleteDemo;

import java.util.Scanner;

/**
 *  设计程序：提示用户输入一个字符串，然后再提示用户输入一个字符，如果字符串中存在这个字符，就将其删除，
并显示删除该字符后的字符串。
1、提交可复制编译的源码或txt文件；
2、必须规范书写代码，包括变量名、注释、类名、项目名等；
3、代码尽量简洁（划重点），
 * @author miku
 *
 */
public class deleteDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//用来保存字符
		String numer = null;
		System.out.println("请输入一个字符串：");
		//保存字符串
		String a = input.nextLine();
		System.out.println("然后顺便输入一个字符，如果这个字符存在于上一个字符串，我就将其删除：");

		while(true)
		{
			int max = -1;
			char num = input.next().charAt(0);
			for (int i = 0; i < a.length(); i++) 
			{
				if(Character.toString(num).equals(Character.toString(a.charAt(i))))
				{//如果再字符串内找到该字符，就跳出循环
					numer = Character.toString(num);
					max = i;
					break;
				}
			}
			//如果在字符串内没有找到
			if(max == -1)
			{
				System.out.println("您输入的字符不在字符串内！");
				System.out.println("是否继续输入？(y\n)");
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
		System.out.println("删除之后的字符串为：");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
		
	}

}
