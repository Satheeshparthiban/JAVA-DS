public class pattern13 {
    public static void nNumberTriangle(int n) {
        int sum=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();
        }
    }
    public static void main( String args[]){
        nNumberTriangle(5);
    }
    
}

/* 1
2 3
4 5 6 
7 8 9 10*/