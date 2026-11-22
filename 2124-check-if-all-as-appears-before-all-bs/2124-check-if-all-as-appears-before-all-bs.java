class Solution {
    public boolean checkString(String s) {
        int idx = s.length();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                idx = i;
                break;
            }
        }

        for (int i = idx; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                return false;
            }
        }

        return true;
    }
}