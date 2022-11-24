class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<List<Integer>>();
        getPermutations(0, nums, permutations);
        return permutations;
  }
    
    private void getPermutations(int i, int[] arr, List<List<Integer>> permutations){
        if(i == arr.length)
        {
  List<Integer> temp = new ArrayList<>();
        for (int val : arr) 
            temp.add(val);
        
            permutations.add(temp);
        }   else{
                for(int j = i ; j <arr.length;j++)
                {
                    swap(i,j, arr);
                    getPermutations(i + 1, arr, permutations);
                    swap(i,j,arr);
                }
            }
    }
    
    private void swap(int i, int j, int[] arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}