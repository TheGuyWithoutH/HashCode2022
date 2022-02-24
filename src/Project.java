package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Victor Garvalov
 */
public class Project {
    public String nameProj ;
    public int nDays  ;
    public int projScore  ;
    public int projDeadline  ;
    public int nRoles ;
    public Map<String, Integer> skills ;
    private boolean isStarted;
    private List<Contributor> contributors;
    public double cost =0;

    public Project(String nameProj, int nDays, int projScore, int projDeadline, int nRoles, Map<String, Integer> skills) {
        this.nameProj = nameProj;
        this.nDays = nDays;
        this.projScore = projScore;
        this.projDeadline = projDeadline;
        this.nRoles = nRoles;
        this.skills = skills;
        isStarted = false;
    }

    public void update() {
        if(isStarted && !isFinished()) {
            nDays--;
        }
    }

    public void start(List<Contributor> contributorsList) {
        isStarted = true;
        contributors = contributorsList;
        for (Contributor contributor : contributors) {
            contributor.hire();
        }
    }

    public boolean isStarted() {
        return isStarted;
    }

    public boolean isFinished() {
        if(nDays == 0) {
            for(Contributor contributor : contributors) {
                contributor.release();
            }
            contributors.clear();
            return true;
        }
        return false;
    }

    public double cost(){
        cost=(double) projScore/(nRoles*nDays);
        return cost;
    }
}
