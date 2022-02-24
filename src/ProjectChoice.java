package src;

import java.util.*;
import java.util.stream.Collectors;

public final class ProjectChoice {

    public static List<Pair<Project, List<Contributor>>> dumbChoice(List<Project> todo, List<Contributor> availableContributors) {
        List<Pair<Project, List<Contributor>>> choices = new ArrayList<>();

        for (Project project : todo) {
            Map<String, Integer> skills = new HashMap<>(project.skills);
            List<Contributor> contributors = new ArrayList<>();

            for (Contributor contributor : availableContributors) {
                if(skills.size() == project.skills.size()) {
                    break;
                }
                for(String skill : contributor.skills.keySet()) {
                    if(skills.containsKey(skill)) {
                        contributors.add(contributor);
                        break;
                    }
                }
            }

            choices.add(new Pair<>(project, contributors));
        }

        return choices;
    }

    public static Map<Project, List<Contributor>> randomizedChoice(List<Project> todo, List<Contributor> availableContributors) {
        Map<Project, List<Contributor>> choices = new HashMap<>();
        /*todo.stream().filter(x -> x.necessarySkills(availableContributors)).collect(Collectors.toList());
        Collections.shuffle(todo) ;*/
        return choices;
    }

    public static Map<Project, List<Contributor>> prioritizedChoice(List<Project> todo, List<Contributor> availableContributors) {
        Map<Project, List<Contributor>> choices = new HashMap<>();
        /*todo.stream().filter(x -> x.necessarySkills(availableContributors))
                .sorted((x, y) -> x.hashCode())
                .collect(Collectors.toList());*/

        return choices;
    }

}
