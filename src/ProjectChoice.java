import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ProjectChoice {

    public static Project dumbChoice(List<Project> todo, List<Contributor> availableContributors) {
        todo.stream().filter(x -> x.necessarySkills(availableContributors)).collect(Collectors.toList());
        return todo.get(0);
    }

    public static Project randomizedChoice(List<Project> todo, List<Contributor> availableContributors) {
        todo.stream().filter(x -> x.necessarySkills(availableContributors)).collect(Collectors.toList());
        Collections.shuffle(todo) ;
        return todo.get(0);
    }

    public static Project prioritizedChoice(List<Project> todo, List<Contributor> availableContributors) {
        todo.stream().filter(x -> x.necessarySkills(availableContributors))
                .sorted((x, y) -> x.hashCode())
                .collect(Collectors.toList());

        return todo.get(0);
    }

}
