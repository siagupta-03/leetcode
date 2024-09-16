class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        

HashMap<Character, Integer> hm= new HashMap<>();
List<Integer> ans = new ArrayList<>();

//int couunt=0;
int i=0;
int j=0;

int k=p.length();

for(int a =0;a<p.length();a++){
    hm.put(p.charAt(a), hm.getOrDefault(p.charAt(a), 0)+1);
}
int count= hm.size();

while(j<s.length()){

if(hm.containsKey(s.charAt(j))){
    hm.put(s.charAt(j), hm.get(s.charAt(j))-1);
    if(hm.get(s.charAt(j))==0){count--;}

}
if(j-i+1<k){j++;}
else if(j-i+1==k){
    if(count==0){
        //anagram found
        ans.add(i);

    }

if(hm.containsKey(s.charAt(i))){
    hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
    if(hm.get(s.charAt(i))==1){count++;}

}

i++;
j++;

}}
return ans;


    }
}