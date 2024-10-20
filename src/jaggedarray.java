public class jaggedarray {
    public static void main(String[] args) {
        int[][] jaggedArr = new int[3][];

        jaggedArr[0] = new int[2];
        jaggedArr[1] = new int[3];
        jaggedArr[2] = new int[4];

        for(int i = 0; i<jaggedArr.length; i++){
            for(int j = 0; j < jaggedArr[i].length; j++){
                jaggedArr[i][j] = i + j;
            }
        }

        for(int i = 0; i<jaggedArr.length; i++){
            for(int j = 0; j < jaggedArr[i].length; j++){
                System.out.print(jaggedArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
