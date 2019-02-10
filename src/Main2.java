public class Main2 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Pieski");
        System.out.println(builder);
        reverse(builder);
        System.out.println(builder);
    }

    private static void increment(int a) {
        a += 1;
    }

    private static void reverse(StringBuilder builder){
       builder.reverse();
    }
}
