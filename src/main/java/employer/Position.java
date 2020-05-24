package employer;

import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by chandimajanakantha on 25/5/20.
 *
 * conatiner class which represents a position in the Organisation
 */
public class Position {
    private Employer employer;
    private Employer manager;
    private List<Employer> staff;

    public Position(Employer employer) {
        this.employer = employer;
        this.staff = new ArrayList<Employer>();
    }

    public Employer getEmployer() {
        return this.employer;
    }

    public Employer getManager() {
        return manager;
    }

    public void setManager(Employer manager) {
        this.manager = manager;
    }

    public List<Employer> getStaff() {
        return staff;
    }

    public void addStaff(Employer employer) {
        this.staff.add(employer);
    }

}
