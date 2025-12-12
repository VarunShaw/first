public class CODES4 {
    public static void main(String[] args) {
        int num = 150;
        int temp = num, rev = 0;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (num == rev)
            System.out.println(num + " is Palindrome");
        else
            System.out.println(num + " is Not Palindrome");
    }
}

