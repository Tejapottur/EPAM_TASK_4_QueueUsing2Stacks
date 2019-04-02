import java.util.*;
public class QueueUsingTwoStacks {
    private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
            int n=in.nextInt();
            int arr[]=new int[n];
        int rear=-1;
        int front=0,num;
        for(int i=0;i<n;i++)
            {
            int ops=in.nextInt();
            if(ops ==1)
                {
                num=in.nextInt();
                arr[++rear]=num;
            }
            else if (ops==2)
                {
                num=arr[front++];
            }
            else 
                {
                System.out.println(arr[front]);
            }
        } 
    }
}