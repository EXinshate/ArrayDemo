public class MinMax {
    public static void main(String args[]) {
        int nums[] = new int[10];
        int Min, Max;

        nums [0] = 99;
        nums [1] = -10;
        nums [2] = 100123;
        nums [3] = 18;
        nums [4] = -987;

        Min = Max = nums[0];
        for(int i = 1; i < 10; i++) {
            if(nums[i] < Min) Min = nums[i];
            if(nums[i] > Max) Max = nums[i];
        }
        System.out.println("最大值和最小值分别是： " + Max + "和" + Min);
    }
}