import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GameCharacter> characters = List.of(
                new Archer("Robin",1,80),
                new Mage("Merlin", 1,60),
                new Warrior("Conan",1,100));
    }
}