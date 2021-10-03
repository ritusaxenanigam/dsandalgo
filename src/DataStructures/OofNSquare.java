package DataStructures;

public class OofNSquare {
    public static void main(String[] args) {
        int[][] a ={{1,2},{2,3,4},{3,4,5}}; // size -> 3 internal array size-> 3 -> O(1)

        for(int i=0;i<a.length;i++){ // -> 3
            int[] b = a[i];
            for(int j=0;j<b.length;j++){ // 3 times
                System.out.println(b[j]);
            }
        }
        
    }
    // n % m -> reminder 

    // O(n*m)  if n==m then O(n^2);

    // auxillary Time complexity / Auxillary space complexity

}
