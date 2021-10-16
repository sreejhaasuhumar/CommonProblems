package test;

public class TargetIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {1,3,5,6};
		int target=7;
		int ans=searchInsert(nums, target);
		System.out.println(ans);
	}

	public static int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while(l<=r)
        {
            int m=(l+r)/2;
            if(nums[m]==target)
                return m;
            if(nums[m]>target)
                r=m-1;
            else
                l=m+1;
        }
        if(l>r)
            return l;
        return 0;
        }
}
