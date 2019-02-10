import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[] {1,2,3,4,5,6};
        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(Arrays.asList(numbers));
        Person person = new Person("Adam", "Kowalski", 55);
        LotteryRound lotteryRound = new LotteryRound(1, numberSet, person);
        System.out.println(lotteryRound);
        lotteryRound.getNumbers().clear();
        System.out.println(lotteryRound);
    }
}
