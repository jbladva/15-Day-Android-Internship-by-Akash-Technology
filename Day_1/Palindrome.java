public class Palindrome {
    public static void main(String[] args) {

        String str = "radar";
        StringBuilder reverseStr = new StringBuilder();

        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr.append(str.charAt(i));
        }

        if (str.toLowerCase().equals(reverseStr.toString().toLowerCase())) {
            System.out.println('"'+str +'"'+ " is a Palindrome String.");
        }
        else {
            System.out.println('"'+str +'"'+ " is not a Palindrome String.");
        }
    }
}
