class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list=new ArrayList<Integer>();
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x){
                a=i;
            }
            else{
                break;
            }
        }
        int b=a+1;
        int temp=0;
        for(int i=0;i<k;i++){
            if(a>=0 && b<arr.length && (Math.abs(arr[a]-x)<Math.abs(arr[b]-x) || (Math.abs(arr[a]-x)==Math.abs(arr[b]-x) && arr[a]<arr[b]))){
                list.add(arr[a]);
                    a--;
            }
            else if(a<0){
                list.add(arr[b]);
                b++;
            }
            else if(b>=arr.length){
                list.add(arr[a]);
                a--;
            }
            else{
                list.add(arr[b]);
                    b++;
            }
        }
        Collections.sort(list);
        return list;
    }
}