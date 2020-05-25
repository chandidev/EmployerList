package employer;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by chandimajanakantha on 25/5/20.
 */
public class HierarchyTest {

    private HierarchyDisplay display = new HierarchyDisplay();

    private Hierarchy hierarchy = new Hierarchy();

    @Test
    public void testSimpleHierachy() {
        List<Employer> list = EmployerFixture.getSampleEmployerList();

        List<Position> topManagers = hierarchy.createHierachy(list);

        assertTrue("only one top manager expected for data provided.", topManagers.size() == 1);
        display.display(topManagers);
    }

    @Test
    public void testEmployerWithManagerNotPresent() {
        String expected[] = {"Jamie", "Orphan"};
        List<String> expectedList = Arrays.asList(expected);
        List<Employer> list = EmployerFixture.getEmployerWithManagerNotPresent();

        List<Position> topManagers = hierarchy.createHierachy(list);

        assertTrue("only one top manager expected for data provided.", topManagers.size() == 2);
        assertTrue(expectedList.contains(topManagers.get(0).getEmployer().getName()));
        assertTrue(expectedList.contains(topManagers.get(1).getEmployer().getName()));
        display.display(topManagers);

    }


    @Test
    public void emptyListDoesNotFail() {
        List<Employer> list = new ArrayList<>();

        List<Position> topManagers = hierarchy.createHierachy(list);

        assertTrue("result should be empty", topManagers.size() == 0);
        display.display(topManagers);

    }

    @Test
    public void nullListDoesNotFail() {
        List<Employer> list = null;

        List<Position> topManagers = hierarchy.createHierachy(list);

        assertTrue("result should be empty", topManagers.size() == 0);
        display.display(topManagers);

    }
}
