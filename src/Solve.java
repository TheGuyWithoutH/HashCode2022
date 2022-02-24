import java.util.ArrayList;
import java.util.List;

public class Solve {

    public static void solve(List<Contributor> contributors, List<Project> projects, List<String> skills){
        List<Project> toDo = new ArrayList<>(projects);

        while(!toDo.isEmpty()) {

            List<Contributor> available = contributors.stream().filter(Contributor::available).toList();
            List<Integer> skillWanted = Skill.skillsScore(skills, projects, available);

            for (Project project : projects) {
                if(project.isFinished()) {
                    projects.remove(project);
                }
                project.update();
            }

        }

    }

}
