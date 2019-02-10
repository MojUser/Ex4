import java.util.HashSet;
import java.util.Set;

public class LotteryRound {
    private final int id;
    private final Set<Integer> numbers;
    private final Person winner;

    public LotteryRound(int id, Set<Integer> numbers, Person winner) {
        this.id = id;
        this.numbers = numbers;
        this.winner = winner;
    }

    public int getId() {
        return id;
    }

    public Set<Integer> getNumbers() {
        return new HashSet<>(numbers);
    }

    @Override
    public String toString() {
        return "LotteryRound{" +
                "id=" + id +
                ", numbers=" + numbers +
                ", winner=" + winner +
                '}';
    }

    public Person getWinner() {
        return winner;
    }
}
