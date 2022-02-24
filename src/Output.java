import java.lang.reflect.AnnotatedArrayType;
import java.util.*;
import java.lang.*;

/**
 * @author Victor Garvalov
 */
public class Output {
    public int score =0;
    public int numProjects=0;
    public String outString ="";
    public ArrayList<Pair<Project,ArrayList<Contributor>>> outArr = new ArrayList<>();

    public void addProject(Project p, ArrayList<Contributor> contributors, int day){
        //Compute Score
        int pTakes = p.timeTakes;
        if(day+pTakes<p.bbd){score+=p.score;}
        else{
            int nS = score-(day+pTakes -p.bbd);
            if(nS>0) score+= nS;
        }
        //Update Output String
        outString += p.name + '\n' + allC(contributors) + '\n';
        numProjects++;
    }

    public int score(){return score;}
    public String getString(){return numProjects+'\n'+outString;}

    private String allC(ArrayList<Contributor> co){
        StringBuilder s = new StringBuilder();
        for(Contributor c : co){
            s += c.name + ' ';
        }
        s.deleteCharAt(s.length()-1);
        return s.toString();
    }
}
