public abstract class GameCharacter {
    private String name;
    int level;
    int health;

    public GameCharacter(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }
    public int lvlUp(int level){
        return level+=1;
    }
    public int dmg(int dmg){
        return dmg;
    }
    public int atk(int dmg,String name){
        return dmg;
    }
}
