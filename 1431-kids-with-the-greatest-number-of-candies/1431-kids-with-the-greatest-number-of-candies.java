class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = 0;
    for (int candy : candies) {
        if (candy > max) {
            max = candy;
        }
    }
    List<Boolean> res = new ArrayList<>(candies.length);
    for (int candy : candies) {
        res.add(candy + extraCandies >= max);
    }
    return res;    
    }
}