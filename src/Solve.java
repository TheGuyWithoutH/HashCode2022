import java.util.ArrayList;
import java.util.List;

public class Solve {

    public static void solve(List<Contributor> contributors, List<Project> projects, List<String> skills){
        List<Project> toDo = new ArrayList<>(projects);
        int i = 0;

        while(!toDo.isEmpty()) {

            List<Contributor> available = contributors.stream().filter(Contributor::available).toList();
            List<Integer> skillWanted = Skill.skillsScore(skills, projects, available);

            for (Project project : toDo) {
                if(project.isFinished()) {
                    toDo.remove(project);
                }
                project.update();
            }

            i++;

        }

    }

}
