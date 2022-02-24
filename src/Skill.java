import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Victor Garvalov
 */

public class Skill {

    public static List<Integer> skillsScore(List<String> skills, List<Project> projects, List<Contributor> contributors) {
        List<Integer> ponderate = new ArrayList<>();
        for (String skill : skills ) {
            int averageDemand = 0;
            int ponderateInt = 0;
            for(Project p : projects) {
                if(p.skills.containsKey(skill)) {
                    averageDemand += p.skills.get(skill);
                    ponderateInt++;
                }
            }

            averageDemand /= projects.size();

            for(Contributor c : contributors) {
                if((c.skills.containsKey(skill) && c.skills.get(skill) < averageDemand) || !c.skills.containsKey(skill)) {
                    ponderateInt++;
                }
            }
            ponderate.add(ponderateInt);
        }
        return ponderate;
    }
}
