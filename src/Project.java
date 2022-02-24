package src;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor Garvalov
 */
public class Project {
    String nameProj ;
    int nDays  ;
    int projScore  ;
    int projDeadline  ;
    int nRoles ;
    List<Skill> skills ;

    public Project(String nameProj, int nDays, int projScore, int projDeadline, int nRoles, List<Skill> skills) {
        this.nameProj = nameProj;
        this.nDays = nDays;
        this.projScore = projScore;
        this.projDeadline = projDeadline;
        this.nRoles = nRoles;
        this.skills = skills;
    }
}
