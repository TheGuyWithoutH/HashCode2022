import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor Garvalov
 */
public class Output {
    public int score =0;
    public int numProjects=0;
    public String outString ="";
    public ArrayList<Pair<Project,ArrayList<Contributor>>> outArr = new ArrayList<>();

    public void addProject(Project p, List<Contributor> contributors, int day){
        //Compute Score
        int pTakes = p.nDays;
        if(day+pTakes<p.projDeadline){score+=p.projScore;}
        else{
            int nS = score-(day+pTakes -p.projDeadline);
            if(nS>0) score+= nS;
        }
        //Update Output String
        outString += p.nameProj + '\n' + allC(contributors) + '\n';
        numProjects++;
    }

    public int score(){return score;}
    public String getString(){return numProjects+'\n'+outString;}

    private String allC(List<Contributor> co){
        StringBuilder s = new StringBuilder();
        for(Contributor c : co){
            s.append(c.name).append(' ');
        }
        s.deleteCharAt(s.length()-1);
        return s.toString();
    }
}
