import java.util.*;
public class Sasakitest{
	public static void main(String[] args){
		double r,m;
		Scanner scanner = new Scanner(System.in);
		System.out.print("円の半径を入力：");
		r = scanner.nextDouble();
		m = Math.pow(r,2)*3.14;
		System.out.print("円の面積は：" + m);
	}
}
