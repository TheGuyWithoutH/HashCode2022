import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Victor Garvalov
 */
public class Project {
    String nameProj ;
    int nDays  ;
    int projScore  ;
    int projDeadline  ;
    int nRoles ;
    public Map<String, Integer> skills ;

    public Project(String nameProj, int nDays, int projScore, int projDeadline, int nRoles, Map<String, Integer> skills) {
        this.nameProj = nameProj;
        this.nDays = nDays;
        this.projScore = projScore;
        this.projDeadline = projDeadline;
        this.nRoles = nRoles;
        this.skills = skills;
    }
}
