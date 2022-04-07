import java.util.*;
public class IfExAkita{
	public static void main(String[] args){
		/*
		 * (最初の数字はランダムです)
		 * 現在の数字は1です(1~13)
		 * ハイor ロ―?>>
		 * ハイかローを入力
		 * 1～9、あなたの勝ちです。
		 * (負け)
		 */
		System.out.println("enterを押して始めてください");
		new Scanner(System.in).nextint();
		int n = new Random().nextInt(13)+1;
		int m = new Random().nextInt(13)+1;
		System.out.println("現在の数字は" + n + "です");
		System.out.println("ハイor ロー?>>");
		String hl = new Scanner(System.in).nextLine();
			if((hl.equals "ハイ") && (n <= 9)){System.out.println("あなたの勝ちです");
			}else if ((hl == "ハイ") && (n >= 10)){System.out.println("あなたの負けです");
			}else if ((hl == "ロー") && (n >= 9)){System.out.println("あなたの勝ちです");
			}else if ((hl == "ロー") && (n <= 10)){System.out.println("あなたの負けです");
	}
}
}


