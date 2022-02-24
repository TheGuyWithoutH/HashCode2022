/**
 * @author Victor Garvalov
 */

public class Skill {
    public final String name;
    public int level;


    public Skill(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void increaseSkill() {
        level++;
    }

    public int getSkill() {
        return level;
    }

    @Override
    public String toString() {
        return name;
    }
}
