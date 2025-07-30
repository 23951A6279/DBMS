class Solution {
public int[] topKFrequent(int[] nums , int k){
	Map<Integer, Integer> map=new HashMap<>();
	int[] arr=new int[]{1,1,2,2,2,3,3};
	for(int i :nums)map.put(i,map.getOrDefault(i,0));
	System.out.print(map);
	}
	System.out.println();
	}
}

