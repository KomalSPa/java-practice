package revision;

/**
 * Created by Jay Vaghani
 */
public class Main extends Employee{

    String companyName;

    public Main(String eName, int eId, String companyName) {
        super(eName, eId);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public static void main(String[] args) {
        Main main = new Main("Jay", 101, "Prime");
        System.out.println(main.geteName());
        System.out.println(main.getCompanyName());
    }
}
