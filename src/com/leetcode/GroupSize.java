package src.com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupSize {

	public static void main(String[] args) {
		int groupsizes[]= {3,3,3,3,3,1,3};
		System.out.println(groupThePeople(groupsizes));
		
		
	}
	public static List<List<Integer>> groupThePeople(int[] groupSizes) {
		HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList();
        
        for(int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            
            List<Integer> group = map.getOrDefault(size, new ArrayList());
            group.add(i);
            map.put(size, group);
            
            if(group.size() == size) {
                list.add(group);
                map.remove(size);
            }
        }
        
        return list;
    }

}
