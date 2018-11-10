public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        ArrayList<ArrayList<Integer>> returnList = new ArrayList();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap(); 
        for(int i =0; i< A.size() ; i++){
            char[] charArray = A.get(i).toCharArray();
            Arrays.sort(charArray);
            String newString = new String(charArray);
            int hashCode = newString.hashCode();
            ArrayList<Integer> list;
            if(map.get(hashCode) != null){
                list = map.get(hashCode);
                list.add(i+1);
                map.put(hashCode, list);
            }else{
                list = new ArrayList();
                list.add(i+1);
                map.put(hashCode , list);
            }
            
        }
        returnList.addAll(map.values());
        
        return returnList;
    }
}
