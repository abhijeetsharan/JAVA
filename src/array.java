public class array {
    public static void main(String[] args) {
        int nums[] = new int [5];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;

        for(int i = 0; i<=4; i++){
            System.out.println(nums[i]);
        }

        System.out.println(" ");

        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 15;
        nums[3] = 20;
        nums[4] = 25;

        for(int value : nums){
            System.out.println(value);
        }
    }
}
