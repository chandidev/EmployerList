package employer;

import java.util.Collections;
import java.util.List;

/**
 * Created by chandimajanakantha on 25/5/20.
 */
public class HierarchyDisplay {

    private static String INDENT = "  ";

    public void display(List<Position> topManagerList) {

    }

    private void displayRecursively(List<Position> positions, int level) {
        positions.forEach(p -> {
            display(getIndentation(level) + p.getEmployer().getName());
            if (p.getStaff() != null && p.getStaff().size() != 0) {
                displayRecursively(p.getStaff(), level + 1);
            }
        });
    }


    private String getIndentation(int level) {
        String.join("", Collections.nCopies(level, INDENT));
    }

    private void display(String str) {
        System.out.println(str);
    }
}
