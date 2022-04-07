import java.util.*;
public class IfExMorozumi{
	public static void main(String[] args){
		/*
		 * 0~3の数字どれかを入力
		 * 0なら優、1なら良、2なら可、3なら不可
		 * と表示させる
		 */
		System.out.println("0~3の数字いずれかを入力してください");
		int n = new Scanner(System.in).nextInt();
		if(n==0){System.out.println("優");
		}else if(n==1){System.out.println("良");
		}else if(n==2){System.out.println("可");
		}else if(n==3){System.out.println("不可");
		}
		

	}

}
