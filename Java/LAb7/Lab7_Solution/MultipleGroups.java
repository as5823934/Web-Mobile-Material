package PP_Excerice.Lab7_Solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Derrick on 2017-11-28.
 */
public class MultipleGroups implements NumberGroup {

    private List<NumberGroup> groupList;

    public MultipleGroups() {
        groupList = new ArrayList<>();
    }

    public void addNumberGroup(NumberGroup group) {
        groupList.add(group);
    }

    @Override
    public boolean contains(int num) {
        for(NumberGroup ng: groupList) {
            if (ng.contains(num)) {
                return true;
            }
        }
        return false;
    }
}
