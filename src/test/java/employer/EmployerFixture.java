package employer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chandimajanakantha on 25/5/20.
 */
public class EmployerFixture {

    public static List<Employer> getSampleEmployerList() {
        List list = new ArrayList<Employer>();
        list.add(createEmployer("Alan", 100, 150));
        list.add(createEmployer("Martin", 220, 100));
        list.add(createEmployer("Jamie", 150, null));
        list.add(createEmployer("Alex", 275, 100));
        list.add(createEmployer("Steve", 400, 150));
        list.add(createEmployer("David", 190, 400));
        return list;
    }


    public static List<Employer> getEmployerWithManagerNotPresent() {
        List list = new ArrayList<Employer>();
        list.add(createEmployer("Alan", 100, 150));
        list.add(createEmployer("Martin", 220, 100));
        list.add(createEmployer("Jamie", 150, null));
        list.add(createEmployer("Alex", 275, 100));
        list.add(createEmployer("Steve", 400, 150));
        list.add(createEmployer("David", 190, 400));
        list.add(createEmployer("Orphan", 195, 1000));
        return list;
    }

    public static Employer createEmployer(String name, Integer id, Integer managerId) {
        return new Employer(name, id, managerId);
    }
}
