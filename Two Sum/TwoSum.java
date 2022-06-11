 class TwoSum {
     public static int[] twoSum(int[] nums, int target) {
          int counter = 0;
          int sol1 = 0;
          int sol2 = 0;
          int flag = 0;
          while(counter < nums.length){
               for (int i = 0; i < nums.length; i++) {
                    if (i == counter)
                         continue;
                    if (nums[counter] + nums[i] == target){
                         sol1 = counter;
                         sol2 = i;
                         flag = 1;
                         break;
                    }
               }
               if(flag == 1)
                    break;
               counter++;
          }
          return new int[]{sol1, sol2};
     }

     public static void main(String[] args) {
          int[] nums = {3,2,4};
          int target = 6;
          System.out.println("[" + twoSum(nums,target)[0] + ", " + twoSum(nums, target)[1] + "]");
     }
}