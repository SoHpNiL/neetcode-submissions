class Solution {
    public String encode(List<String> strs) {
        if (strs.size() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String x : strs) {
            sb.append(x.length()).append('#');
            sb.append(x);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> fr = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));

            i = j + 1;

            String s = str.substring(i, i + length);
            fr.add(s);

            i += length;
        }

        return fr;
    }
}
