import java.util.*;
public class Method1{
	public static void main(String[] args){
		int max = maxOf(3,8);
		System.out.println(max);
	}
	public static int maxOf(int a, int b){
		return a > b ? a:b;
	}
}
