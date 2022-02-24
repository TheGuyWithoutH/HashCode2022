package src;

import java.util.List;
import java.util.Map;

/**
 * @author Victor Garvalov
 */
public class Contributor {

    public String name;
    public Map<String, Integer> skills;
    private boolean taken;


    public Contributor(String name, Map<String, Integer> skills) {
        this.name = name;
        this.skills = skills;
        taken = false;
    }

    public Map<String, Integer> getSkills() {
        return skills;
    }

    public void incrementSkill(String name) {
        skills.get(name);
    }

    public void hire(){
        taken=true;
    }

    public void release(){
        taken = false;
    }

    public boolean available() {
        return !taken;
    }

    @Override
    public String toString() {
        return name;
    }
}
