package algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/count-primes/
 */
public class CountPrimes204 {

    /**
     * solution I: enumeration
     *
     * @param n
     * @return
     */
    public int countPrimes(int n) {
        int ans = 0;
        for (int i = 2; i < n; i++) {
            ans += isPrime(i) ? 1 : 0;
        }
        return ans;
    }

    private boolean isPrime(int x) {
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * solution II: Eladosier screening
     *
     * @param n
     * @return
     */
    public int countPrimesII(int n) {
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            if (isPrime[i] == 1) {
                ans += 1;
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = 0;
                    }
                }
            }
        }
        return ans;
    }

    /**
     * solution III: Linear screening
     * @param n
     * @return
     */
    public int countPrimesIII(int n) {
        List<Integer> primes = new ArrayList<>();
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        for (int i = 2; i < n; i++) {
            if (isPrime[i] == 1) {
                primes.add(i);
            }
            for (int j = 0; j < primes.size() && i * primes.get(j) < n; j++) {
                isPrime[i * primes.get(j)] = 0;
                if (i % primes.get(j) == 0) {
                    break;
                }
            }
        }
        return primes.size();
    }

    /**
     * own solution(exceed time limit)
     *
     * @param n
     * @return
     */
    public int countPrimesOwn(int n) {
        if (n == 0) {
            return 0;
        }
        int[] nums;
        if (n == 1) {
            nums = new int[n];
        } else {
            nums = new int[n - 1];
        }
        int num = 1;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = num++;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 1; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                list.add(nums[i]);
            }
        }
        return list.size();
    }

}
