class Solution {
    public int findContentChildren(int[] g, int[] s) {

        int l=0; int r=0;
        Arrays.sort(g);
        Arrays.sort(s);
int ans=0;
        while(l<s.length && r<g.length){
            if(g[r]<=s[l]){
                ans++;
                r=r+1;
                
            }
            l=l+1;
        }
        return ans;

    }
}