import java.util.*;
public class Ex3_6{
	public static void main(String[] args){
		System.out.print("【数あてゲーム】");
		int ans = new Random().nextInt(10);
		for(int i=0; i<5; i++){
			System.out.print("0~9の数字を入力してください");
			int num = new Scanner(System.in).nextInt();
			if(num == ans){
				System.out.println("アタリ!");
				break;
			}else{
				System.out.println("違います");
			}
			System.out.println("ゲームを終了します");
		}
	}
}
