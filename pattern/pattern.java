public class pattern{
     public static void nBinaryTriangle(int n) {
        int k=1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                k=1;
            }else{
                k=0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(k+" ");
                k^=1;
            }
            System.out.println();
          }
        
    }

/*output
1
0 1
1 0 1
0 1 0 1*/
    public static void main(String args[]){
        nBinaryTriangle(5);
    }
    
}
