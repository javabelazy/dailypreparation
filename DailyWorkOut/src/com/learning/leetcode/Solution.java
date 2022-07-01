package com.learning.leetcode;

class Solution {
	public int reverse1(int x) {
		int output = 0;
		while (x > 0) {
			int mod = x % 10;
			x = x / 10;
			output = output * 10 + mod;
		}
		return output;
	}

	public int reverse(int x) {
		int output = 0;
		while (x > 0) {
			int mod = x % 10;
			x = x / 10;
			output = output * 10 + mod;
		}
		return output;
	}

	public static void main(String[] args) {

		System.out.println(new Solution().reverse(123));

	}
}