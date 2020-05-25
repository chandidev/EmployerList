package employer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Created by chandimajanakantha on 25/5/20.
 */
public class PositionTest {

    @Test
    public void staffAddedToManagerWhenSettingManager() {
        Employer manager = EmployerFixture.createEmployer("manager", 100, null);
        Employer staff1 = EmployerFixture.createEmployer("staff1", 200, null);
        Employer staff2 = EmployerFixture.createEmployer("staff2", 300, null);

        Position managerPosition = new Position(manager);
        Position staff1Posisition = new Position(staff1);
        Position staff2Posision = new Position(staff2);

        staff1Posisition.setManager(managerPosition);
        staff2Posision.setManager(managerPosition);

        assertEquals(2, managerPosition.getStaff().size());
        assertTrue(managerPosition.getStaff().contains(staff1Posisition));
        assertTrue(managerPosition.getStaff().contains(staff2Posision));
    }

}
