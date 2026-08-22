class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> Map = new HashMap();
        for(String str : strs){
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String key = String.valueOf(strArr);
            Map.putIfAbsent(key,new ArrayList());
            Map.get(key).add(str);
        }
        return new ArrayList<>(Map.values());
    }
}