package suanfa;
public class erfenchazhao {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int numF=1;
        System.out.println(erfen(arr,numF));
    }
    private static int erfen(int[]arr,int num){
        int base=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(num==arr[mid]){
                base = mid;
                break;
            } else if (num<arr[mid]) {
                high=mid-1;
            }else {
                //num>arr[mid]
                low=mid+1;
            }
        }
        return base;
    }
}
