import java.util.*;
public class IfExMatsuoka{
	public static void main(String[] args){
		/*
		 * サイコロを2つランダムで表示し出た面の和が奇数なら奇数と表示し、偶数なら偶数と表示
		 * 実行結果
		 * サイコロ14
		 * サイコロ23
		 * 和は奇数です*/
		System.out.println("enterを押してサイコロを振ってください");
		new Scanner(System.in).nextLine();
		int n1 = new Random().nextInt(6)+1;
		System.out.println(n1);
		System.out.println("もう一度enterを押してサイコロを振ってください");
		new Scanner(System.in).nextLine();
		int n2 = new Random().nextInt(6)+1;
		System.out.println(n2);
		int s = n1 + n2;
		if (s%2 == 0){System.out.println("和は偶数です");
		}else{
		}System.out.println("和は奇数です");
		}
	}

