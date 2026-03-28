class SumOfDigits {

    public static void findSum(int num) {

        int sum = 0;

        for (; num = 0; num = num / 10) {
            int digit = num % 10;
            sum = sum + digit;
        }

        System.out.println("Sum of digits = " + sum);
    }
}