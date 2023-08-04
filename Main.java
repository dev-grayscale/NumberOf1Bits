/**
 * Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
 *
 * Note:
 *
 * Note that in some languages, such as Java, there is no unsigned integer type.
 * In this case, the input will be given as a signed integer type. It should not affect your implementation,
 * as the integer's internal binary representation is the same, whether it is signed or unsigned.
 * In Java, the compiler represents the signed integers using 2's complement notation.
 * Therefore, in Example 3, the input represents the signed integer. -3.
 *
 * Input: n = 00000000000000000000000000001011
 * Output: 3
 * Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
 *
 * https://leetcode.com/problems/number-of-1-bits/
 */
public class Main {

  /**
   * We can repeatedly check the bit at 0th position, followed by a shift to the right,
   * until the number becomes 0. For each occurrence of 1, count is increased by 1.
   *
   * With <b>n & 1 == 1</b> we check if the bit at 0th position is 1. Ultimately it performs AND
   * on the 0th bit of n and 1, which resolves to 1 only of the bit is 1 and 0 otherwise.
   *
   * With <b>n >>>= 1</b> we discard the already checked bit (<link>to logical shifting</link>)
   */
  public static short count1s(int n) {
    short count = 0;

    while (n != 0) {
      if ((n & 1) == 1) {
        count++;
      }

      n >>>= 1;
    }

    return count;
  }

  /**
   * An alternative approach is to pass through all Integer.BYTES * 8 bits and count how many of them are 1s.
   * We can do that by shifting the 1 bit to the left by 1 position until it surpass the MSB and its value becomes 0, while
   * in the meantime checking if <b>n & i(the 1 bit at the concrete position) != 0</b>.
   */
  public static short count1sV2(int n) {
    short onesCount = 0;

    for (int i = 1; i != 0; i <<= 1) {
      if ((n & i) != 0) {
        onesCount++;
      }
    }

    return onesCount;
  }

  /**
   * Another solution could be derived by using the formula <b>n & (n - 1)</b> which
   * acts as discarding the rightmost 1 bit. Each time the result of it is bigger than 0 indicates there was a 1 bit
   * at some position. Incrementing the count by 1 for each such outcome leads to accurate way to count the 1s.
   */
  public static short count1sV3(int n) {
    short count = 0;

    while (n != 0) {
      count++;
      n = n & (n - 1);
    }

    return count;
  }
}


