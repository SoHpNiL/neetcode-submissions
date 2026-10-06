class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] newS = s.toCharArray();
        char[] newT = t.toCharArray();

        HashMap<Character, Integer> checkS = new HashMap<>();
        HashMap<Character, Integer> checkT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character x = newS[i];
            checkS.put(x, checkS.getOrDefault(x, 0) + 1);

            Character y = newT[i];
            checkT.put(y, checkT.getOrDefault(y, 0) + 1);
        }

        for (int j = 0; j < s.length(); j++) {
            Character keyC = newS[j];
            int intS = checkS.getOrDefault(keyC, -1);
            int intT = checkT.getOrDefault(keyC, -1);

            if (intS == -1 || intT == -1){
                return false;
            }

            if (intS != intT){
                return false;
            }
        }

        return true;
    }
}
