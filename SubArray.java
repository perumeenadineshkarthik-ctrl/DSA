class SubArray{
    public static void main(String args[]){
       // Scanner sc =new Scanner (System.in);
        int arr[]={5,9,1,8,7};
        int n =arr.length;
        int sl =3;
        int ans =0;
        for(int i =0 ;i<=n-sl;i++){
            int j =i+sl-1;
            int temp =0;
            for(int k =i;k<=j;k++){
                temp+=arr[k];
               //System.err.println(temp);
            }
            ans =Math.max(temp,ans);
        }
        System.out.println(ans);
    }
}