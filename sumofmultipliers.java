public class sumofmultipliers {
    public static void main(String[] args) {
        int n = 8;
        int i = 1;
        int sum = 0;
        while (i<=10)
        {
            int product = n *i;
            sum = sum + product;
            i++;
        }
        System.out.println(sum);
    }
}
