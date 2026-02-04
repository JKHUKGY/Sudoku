public static void mystery3(int[] nums) {
   for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] > nums[i + 1]) {
         nums[i + 1]++;
      }
   }
}

// some changes