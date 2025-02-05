public abstract class GameCharacter {
    private String name;
    int level;
    int health;

    public GameCharacter(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }
}
