import java.util.Arrays.*;
public class ArrLesson3{
	public static void main(String[] args){
		int[] dataA={3,5,10};
		int[] dataB=new int[]{4,6,10};
		int[] dataB;
		dataB=new int[]{4,6,10};
		//普通のfor文
		for(int i=0; dataA.length; i++){
			System.out.println(dataA[i]);
		}

		//拡張for文
		for(int n:dataB){
			System.out.println(n);
		}

		System.out.println(Arrays.toString(dataA));
	}
}
