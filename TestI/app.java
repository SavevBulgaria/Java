package TestI;

public class app {
    public static void main(String[] args) {
        //0   1   2   3
        int[][] arr = {{10, 20, 30, 40},  //0
                       {1, 34, 54, 12},   //1
                       {1, 1, 12, 65},    //2
                       {1, 1, 1, 82}};    //3
        System.out.println(sum(arr));
    }

    public static int sum(int arr[][]) {
        int sum = 0;

        for (int y = 1; y < arr.length; y++) {
            for (int x = 0; x < y; x++) {
                sum += arr[y][x];

            }
        }
        return sum;
    }
}
