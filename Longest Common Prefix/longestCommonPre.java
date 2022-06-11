public class longestCommonPre {
    public static String longestPrefix(String[] strs) {
        int minStringLength = Integer.MAX_VALUE;

        for (String s : strs) {
            if (s.length() <= minStringLength)
                minStringLength = s.length();
        }

        int lookedIndex = 0;
        int flag = 0;
        StringBuilder returnString = new StringBuilder();
        while (flag != 1 && lookedIndex < minStringLength) {
            for (String s : strs) {
                if (s.toCharArray()[lookedIndex] != strs[0].toCharArray()[lookedIndex]) {
                    flag = 1;
                    break;
                }


            }
            if (flag != 1) {
                returnString.append(strs[0].toCharArray()[lookedIndex]);
                lookedIndex++;


            }
        }

        return returnString.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"aaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa"};
        System.out.println(longestPrefix(strs));
    }
}
