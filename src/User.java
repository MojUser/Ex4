import java.util.ArrayList;
import java.util.List;

public final class User {
    private final String name;
    private final String surname;
    private final int age;
    private final List<String> notes;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public List<String> getNotes() {
        List<String> listCopy = new ArrayList<>(notes.size());
        listCopy.addAll(notes);
        return listCopy;
    }

    public User(String name, String surname, int age, List<String> notes) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", notes=" + notes +
                '}';
    }
}
