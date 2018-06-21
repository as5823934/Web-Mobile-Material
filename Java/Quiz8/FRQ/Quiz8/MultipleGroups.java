package MyPractice.Quiz8;

import java.util.ArrayList;
import java.util.List;

public class MultipleGroups implements NumberGroup{
    private List<NumberGroup> groupList;

    public MultipleGroups(NumberGroup group){
        groupList = new ArrayList<>();
        groupList.add(group);
    }


    @Override
    public boolean contains(int num){
        for(NumberGroup i : groupList){
            if(i.contains(num)){
                return true;
            }
        }
        return false;
    }
}
