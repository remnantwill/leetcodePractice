package algorithms.hard;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/volume-of-histogram-lcci/
 */
public class VolumeOfHistogramLCCI17_21 {

    /**
     * solution I: dp
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return ans;
    }

    /**
     * solution II: monotonic stack
     * @param height
     * @return
     */
    public int trapII(int[] height) {
        int ans = 0;
        Deque<Integer> stack = new LinkedList<>();
        int n = height.length;
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                Integer top = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                Integer left = stack.peek();
                int width = i - left - 1;
                int minHeight = Math.min(height[i], height[left]) - height[top];
                ans += width * minHeight;
            }
            stack.push(i);
        }
        return ans;
    }

    /**
     * solution III: double pointer
     * @param height
     * @return
     */
    public int trapIII(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int ans = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (height[left] < height[right]) {
                ans += leftMax - height[left];
                left++;
            } else {
                ans += rightMax - height[right];
                right--;
            }
        }
        return ans;
    }

}
