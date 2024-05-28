public class jump2leetcode {
    public static int main(String[] args) {
        int[] nums ={2,3,1,1,4};
        int jump=0;
        int pos=0;
        int des=0;
        for (int i=0;i<nums.length-1;i++)
        {
            des=Math.max(des,nums[i]+1);
            if (pos==i)
            {
                pos=des;
                jump++;
            }

        }
        return jump;

    }
}
