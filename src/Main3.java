import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<String> notes = new ArrayList<>();
        notes.add("Kup Mleko");
        notes.add("Idź do pracy");
        notes.add("Wróć z pracy");
        User user = new User("Jan", "Kowalski", 25, notes);
        System.out.println(user);
        user.getNotes().clear();
        System.out.println(user);

    }
}
