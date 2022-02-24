import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solve {

    public static void solve(List<Contributor> contributors, List<Project> projects, List<String> skills){
        List<Project> toDo = new ArrayList<>(projects);
        int i = 0;
        Output out = new Output();

        while(!toDo.isEmpty()) {

            List<Contributor> available = contributors.stream().filter(Contributor::available).toList();
            List<Integer> skillWanted = Skill.skillsScore(skills, projects, available);

            List<Pair<Project, List<Contributor>>> possibility =  ProjectChoice.dumbChoice(toDo.stream().filter(x -> !x.isStarted()).toList(), available);

            possibility.get(0).p1.start(possibility.get(0).p2);
            out.addProject(possibility.get(0).p1, possibility.get(0).p2, i);

            for (Project project : toDo) {
                project.update();
                if(project.isFinished()) {
                    toDo.remove(project);
                }
            }

            i++;

        }

        System.out.println(out.getString());

    }

}
