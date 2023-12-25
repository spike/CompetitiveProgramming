class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {

    Arrays.sort(hFences); //mlogn
    Arrays.sort(vFences); //nlogn

	List<Integer> hFencesList = new ArrayList<>();//m space
	for(int h : hFences) hFencesList.add(h);		
      hFencesList.add(0,1);
      hFencesList.add(m);

    List<Integer> vFencesList = new ArrayList<>(); //n space
	  for(int v : vFences) vFencesList.add(v);		
      vFencesList.add(0,1);
      vFencesList.add(n);

	Set<Integer> matcherSet = new HashSet<>(); //m^2
	for(int i=0;i<hFencesList.size();i++) {//m^2
		for(int j=i+1;j<hFencesList.size();j++) {
			matcherSet.add(Math.abs(hFencesList.get(j)-hFencesList.get(i)));
		}
    }
	
    long result = -1;
	for(int i=0;i<vFencesList.size();i++) { //n^2
		for(int j=i+1;j<vFencesList.size();j++) {
			int diff = vFencesList.get(j)-vFencesList.get(i);
			if(matcherSet.contains(diff)){
				result = Math.max(result,diff); 
            }
		}
    }

    return result == -1 ? -1 : (int) ((result * result) % (1000000007));
    }
  }