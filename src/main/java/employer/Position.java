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
    private Position manager;
    private List<Position> staff;

    public Position(Employer employer) {
        this.employer = employer;
        this.staff = new ArrayList<Position>();
    }

    public Employer getEmployer() {
        return this.employer;
    }

    public Position getManager() {
        return manager;
    }

    public void setManager(Position manager) {
        this.manager = manager;
        this.manager.staff.add(this);

    }

    public List<Position> getStaff() {
        return staff;
    }

}
