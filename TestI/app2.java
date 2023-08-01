package TestI;

public class app2 {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40},  //0
                {1, 34, 54, 12},   //1
                {1, 1, 12, 65},    //2
                {1, 1, 1, 82}};    //3
        System.out.println(sum(arr));
    }
    public static int sum(int arr[][]){
        int sum=0;

        for(int y=0;y< arr.length;y++){
            for(int x=0;x< arr[y].length;x++){
                if(y>x){
                    sum+=arr[y][x];
                }
            }
        }
        return sum;
    }
}