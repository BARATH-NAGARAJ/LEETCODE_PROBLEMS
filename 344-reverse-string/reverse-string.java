class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char store = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = store;
        }
    }
} //two pointers