/**
 * @author Victor Garvalov
 */
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // INIT
        List<Contributor> contributors = new ArrayList<>();
        List<Project> projects = new ArrayList<>();
        Set<String> allSK = new HashSet<>();


        int nContributors  = sc.nextInt();
        int nProjects  = sc.nextInt();

        for (int i = 0; i <nContributors ; i++) {  // get info on contr
            String nameCon = sc.next();
            int nSkill  = sc.nextInt();
            Map<String, Integer> skills = new TreeMap<>();
            for (int j = 0; j < nSkill ; j++) {   //get info on skill
                String nameSK = sc.next();
                int levelSK = sc.nextInt();
                allSK.add(nameSK);                // add skill to all Skills
                skills.put(nameSK,levelSK);
            }
            Contributor cont = new Contributor(nameCon,skills);
            contributors.add(cont);
        }
        ArrayList<String> aS = new ArrayList<String>(allSK);
        for (int i = 0; i <nProjects ; i++) { //get info on projects
            String nameProj = sc.next();
            int nDays  = sc.nextInt();
            int projScore  = sc.nextInt();
            int projDeadline  = sc.nextInt();
            int nRoles  = sc.nextInt();
            Map<String, Integer> skills = new HashMap<>();
            for (int j = 0; j < nRoles ; j++) {   //get info on required skill for project
                String nameSK = sc.next();
                int levelSK = sc.nextInt();
                skills.put(nameSK, levelSK);
            }
            Project proj = new Project(nameProj,nDays,projScore,projDeadline,nRoles,skills);
            projects.add(proj);
        }


      /*
      int n      = sc.nextInt();        // read input as integer
      long k     = sc.nextLong();       // read input as long
      double d   = sc.nextDouble();     // read input as double
      String str = sc.next();           // read input as String
      String s   = sc.nextLine();       // read whole line as String

      int result = 3*n;
      out.println(result);                    // print via PrintWriter
      */

        // Stop writing your solution here. -------------------------------------
        out.close();
    }


    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}
