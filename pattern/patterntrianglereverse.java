public class patterntrianglereverse {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++){
            //space
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            //star
            for(int k = 0;k< 2*n-(2*i+1);k++){
               
                System.out.print("*");
            }
            //space
            for(int a =0;a<i;a++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
