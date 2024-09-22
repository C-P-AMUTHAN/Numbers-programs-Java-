class ThreeDarray {
    public static void main(String args[]){
        int arr[ ][ ][ ] = new int[3][4][5];
        int i,j,k;
        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                for(k=0; k<5; k++){
                    arr[i][j][k] = i*j*k;
                }
            }
        }
         for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                for(k=0; k<5; k++){
                    System.out.print(arr[i][j][k]+" ");
                    
                }
            }
        }
        System.out.println();
    }
    
}
