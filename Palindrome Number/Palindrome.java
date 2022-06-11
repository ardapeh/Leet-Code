class Palindrome{
    public static boolean isPalindrome(int x){
        int r;
        int sum = 0;
        int temp;
        int n = x;

        temp = n;
        while(x > 0){
            r = x % 10;
            sum = (sum * 10) + r;
            x /= 10;
        }

        if (temp == sum)
            return true;
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
}