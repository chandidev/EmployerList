package employer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by chandimajanakantha on 25/5/20.
 */
public class Hierarchy {

    public List<Position> createHierachy(List<Employer> employersList) {
        if (employersList == null || employersList.size() == 0) {
            return new ArrayList<>();
        }
        //create Position for each employer and add it to a map with keyed by employerId.
        Map<Integer, Position> positonsMap =
                employersList.stream().collect(Collectors.toMap(Employer::getId, emp -> new Position(emp)));

        //we will add all employers who have managers to this list.
        List<Integer> employerIdHavingManagers = new ArrayList<>();

        //set the manager for each Position if available.
        positonsMap.forEach((Integer employerId, Position position) -> {
            Integer managerId = position.getEmployer().getManagerId();
            //if there is a managerId proceed
            if (managerId != null) {
                //if managerId present in the employer list proceed.
                Position manager = positonsMap.get(managerId);
                if (manager != null) {
                    position.setManager(manager);
                    employerIdHavingManagers.add(position.getEmployer().getId());
                }
            }
        });

        //now return all the Positions without a manager
        List<Position> topLevelManagers = positonsMap.values().stream()
                .filter(position -> ! employerIdHavingManagers.contains(position.getEmployer().getId()))
                .collect(Collectors.toList());

        return topLevelManagers;
    }
}
