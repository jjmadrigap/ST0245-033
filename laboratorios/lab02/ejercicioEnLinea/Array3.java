//maxSpan 
public int maxSpan(int[] nums) {
  int max=0;// O(1)
  for(int i=0; i<nums.length; i++) {// O(n)
    int j=nums.length-1;//O(1)
    while(nums[i] != nums[j]){//O(n)
      j--;//n-1
    }
    int lapso=1+(j-i);//O(1)
    if(lapso>max){//O(1)
      max=lapso;//O(1)
    }
  }
  return max;//O(1)
}
// O(1)+(O(1)*O(n)*O(n)) ==> O(1)*O(n)*O(n)
// O(1)*O(n)*O(n) ==> O(n)*O(n)
// O(n)*O(n) ==> O(n2)

//fix34 
public int[] fix34(int[] nums) {
	int i=0; // O(1)
  while(i<nums.length && nums[i]!=3) // O(n)
    i++; // n+1
  int j=i; // O(1)
  while(j+1<nums.length && nums[j+1]!=4) // O(n)
    j++; // n+1
  while(i<nums.length){ // O(n)
    if(nums[i]==3){ // O(1)
      int temp=nums[i+1]; // O(1)
      nums[i+1]=nums[j+1]; //O(1)
      nums[j+1]=temp; // O(1)
      while(j+1<nums.length && nums[j+1] != 4) //O(n)
        j++; // n+1
    }
    i++; // n+1
  }
  return nums; //O(1)
}
// O(1)+O(n)+(O(1)*O(n)*O(n)) ==> O(n)+(O(1)*O(n)*O(n))
// O(n)+(O(1)*O(n)*O(n)) ==> O(1)*O(n)*O(n)
// O(1)*O(n)*O(n) ==> O(n)*O(n)
// O(n)*O(n) ==> O(n2)

//public int[] fix45(int[] nums) {
  int temp;// O(1)
  for (int i=0; i<nums.length; i++) { // O(n)
    if (nums[i]==4) { // O(1)
      for (int j=0; j<nums.length; j++) { // O(n)
        if (nums[j]==5) { // O(1)
          if (j>0 && nums[j-1]!=4) { // O(1)
            temp = nums[i+1]; // O(1)
            nums[i+1]=5; // O(1)
            nums[j]=temp; // O(1)
          } 
          else if (j==0) { // O(1)
            temp=nums[i+1]; // O(1)
            nums[i+1]=5; // O(1)
            nums[j]=temp; // O(1)
          }
        }
      }
    }
  }
  return nums; // O(1)
}
// O(1)+(O(1)*O(n)*O(n)) ==> O(1)*O(n)*O(n)
// O(1)*O(n)*O(n) ==> O(n)*O(n)
// O(n)*O(n) ==> O(n2)

//linearIn 
public boolean linearIn(int[] outer, int[] inner) {
  int comp=0; // O(1)
  int count=0; // O(1)
  if(inner.length==0) // O(1)
    return true; // O(1)
  for(int i=0; i<outer.length; i++) { // O(n)
    if(outer[i]==inner[count]) { // O(1)
      comp++; // O(1)
      count++; // O(1)
    } else if(outer[i]>inner[count]) // O(1)
      return false; // O(1)
    if (comp==inner.length) // O(1)
      return true; // O(1)
  }
  return false; // O(1)
}
// O(1)+(O(1)*O(n)) ==> O(1)*O(n)
// O(1)*O(n) ==> O(n)

//squareUp 
public int[] squareUp(int n) {
  int[]arreglo=new int[(n*n)]; // O(1)
  if(n==0){ // O(1)
    return arreglo; // O(1)
  }
  for(int i=n-1;i<arreglo.length;i=i+n){ // O(n)
    for (int j=i;j>=i-(i/n);j--){ // O(1)
      arreglo[j]=1+(i-j); // O(1)
    }
  }
  return arreglo; // O(1)
}
// O(1)+(O(1)*O(n)) ==> O(1)*O(n)
// O(1)*O(n) ==> O(n)