import java.util.*;
public class Game {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int dp[]= new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            if((i-1)>=0 && dp[i-1]==0){
                dp[i]=1;
            }
            else if((i-x)>=0 && dp[i-x]==0){
                dp[i]=1;
            }
            else if((i-y)>=0 && dp[i-y]==0){
                dp[i]=1;
            }
            else{
                dp[i]=0;
            }
        }
        System.out.println(dp[n]==1?true:false);
    }
}
