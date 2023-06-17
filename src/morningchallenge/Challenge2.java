package morningchallenge;

/**
 * Created by Jay Vaghani
 */
public class Challenge2 {

    int eId;
    int deptNo;
    String eName;
    String job;

    public Challenge2(int eId, int deptNo, String eName, String job) {
        this.eId = eId;
        this.deptNo = deptNo;
        this.eName = eName;
        this.job = job;
    }

    public void display(){
        System.out.println(eId);
        System.out.println(deptNo);
        System.out.println(eName);
        System.out.println(job);
    }
}
