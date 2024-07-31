class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String output = "";
        int n1 = str1.length();
        int n2 = str2.length();
        int max = 0;
        if ((str1 + str2).equals(str2 + str1)) {
            for (int i=1; i<=Math.min(n1,n2); i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    max = i;
                }
            }
            return output = str1.substring(0, max);
        } else {
            return output = "";
        }
        
    }
}