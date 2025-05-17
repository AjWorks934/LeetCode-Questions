class Solution {
    public int[][] substringXorQueries(String s, int[][] queries) {
        HashMap<Integer, int[]> map = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
            // putIfAbsent = if not present in map then put else     leave it
                map.putIfAbsent(0, new int[]{i, i});
                continue;
            }

            int num = 0;
            for(int j = i; j<s.length() && j < i+32; j++){
                num = num * 2;
                num = num + (s.charAt(j) - '0');
                map.putIfAbsent(num, new int[]{i, j});
            }
        }

        int result[][] = new int[queries.length][2];
        for(int i = 0; i<queries.length; i++){
            int xor = queries[i][0] ^ queries[i][1];
            // it xor is in map then put its mapping value else -1,-1
            result[i] = map.getOrDefault(xor, new int[]{-1, -1});
        }

        return result;
        
    }
}