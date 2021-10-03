package DataStructures;

public class SumOfNumber {
    public static void main(String[] args) {
        int[] ip ={1,2,3,6};
        int target = 4;
        int[] op = targetSum(ip, target);
        for(int i=0;i<2;i++){
            System.out.println(op[i]);
        }
    }

    private static int[] targetSum(int[] ip, int target){
        for(int i=0;i<ip.length;i++){
            int tarelem  = target-ip[i];
            for(int j=i+1;j<ip.length;j++){
                if(tarelem==ip[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }
}
