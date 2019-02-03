import java.util.Set;

public class LotteryRound {
    private int id;
    private Set<Integer> numbers;
    private Person winner;

    public LotteryRound(int id, Set<Integer> numbers, Person winner) {
        this.id = id;
        this.numbers = numbers;
        this.winner = winner;
    }

    public int getId() {
        return id;
    }

    public Set<Integer> getNumbers() {
        return numbers;
    }

    public Person getWinner() {
        return winner;
    }
}
