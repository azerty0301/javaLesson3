import java.util.*;
public class Shuffle{
	public static void main(String[] args){
		int[] balls = {1,2,3,4,5};
		for(int i=0; 	i<balls.length-1; i++){
			int index = new Random().nextInt(balls.length - i) + i;
			int temp = balls[index];
			balls[index] = balls[i];
			balls[i] = temp;
		}
		System.out.prontln(Arrays.toString(balls));
	}
}
