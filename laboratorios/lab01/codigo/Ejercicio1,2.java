public static int punto2(int n){
    if(n==1)return 1;
    if(n==2)return 2;
    else{
    return  punto2(n-1)+ punto2(n-2);
    }
}
