//sameEnds
public boolean sameEnds(int[] nums, int len) {
  boolean FinalIgual = true; // C1
  for (int i = 0; i < len; i++) { // C2*n
    if (nums[i] == nums[nums.length-len+i]) // C3
      FinalIgual = true; // C4
    else
     FinalIgual = false; // C5
  }  
  return FinalIgual; // C6
}
//T(n)=C1+C2*n+C3+C4+C5+C6
//T(n)=O(C1+C2*n+C3+C4+C5+C6)
//T(n)=O(C2*n+C3+C4+C5+C6)
//T(n)=O(C2*n)
//T(n)=O(n)


//shiftLeft
public int[] shiftLeft(int[] nums) {
  int largo = nums.length; // C1
  int temporal = 0; // C2
  for(int i=0; i<largo-1; i++){ // C3*n
    temporal = nums[i]; // C4
    nums[i]= nums[i+1]; // C5
    nums[i+1] = temporal; // C6
  }
  return nums; // C7
}
//T(n)=C1+C2+C3*n+C4+C5+C6+C7
//T(n)=O(C1+C2+C3*n+C4+C5+C6)
//T(n)=O(C3*n+C4+C5+C6)
//T(n)=O(C3*n)
//T(n)=O(n)

//post4 
public int[] post4(int[] nums) {
  int largo = nums.length -1; // C1
  int index = 0; // C2
  for(int i = nums.length-1; i >= 0;i--){ // C3*n
    if(nums[i] == 4){ // C4
      index = i; // C5
      break; // C6
    }
  }
  int[] arr = new int[largo-index]; // C7
  for(int i = index+1, j=0; i < nums.length; i++, j++){ // C8*n*m
    arr[j] = nums[i]; // C9
  }
  return arr; // C10
}
//T(n)= C1+C2+C3*n+C8*n*m+C4+C5+C6+C7+C9+C10
//T(n)=O(C3*n+C8*n*m+C4+C5+C6+C7+C9+C10)
//T(n)= O(C8*n*m+C4+C5+C6+C7+C9+C10)
//T(n)= O(C8*n*m)
//T(n)= O(n*m)

//withoutTen 
public int[] withoutTen(int[] nums) {
  int resultado = 0; // C1
  for(int i = 0; i < nums.length; i++){ //C2*n
    if(nums[i] != 10){ // C3
      int temporal = nums[i]; // C4
      nums[i] = 0; // C5
      nums[resultado] = temporal; // C6
      resultado++; // C7
    }
    else{
      nums[i] = 0; // C8
    }
  }
  return nums; // C9
}
//T(n)=C1+C2*n+C3+C4+C5+C6+C7+C8+C9
//T(n)=O(C1+C2*n+C3+C4+C5+C6+C7+C8+C9)
//T(n)=O(C2*n+C3+C4+C5+C6+C7+C8+C9)
//T(n)=O(C2*n)
//T(n)=O(n)

//fizzBuzz 
public String[] fizzBuzz(int start, int end) {
  String[] resultado = new String[end - start]; // C1
  for (int i = start; i < end; i++){ // C2*n*m
    if(i % 3 != 0 && i % 5 != 0){ // C3
      resultado[i - start] = String.valueOf(i); // C4
    }if(i % 3 == 0){ // C5
      resultado[i - start] = "Fizz"; // C6
    }if(i % 5 == 0){ // C7
      resultado[i - start] = "Buzz"; // C8
    }if(i % 3 == 0 && i % 5 == 0){ // C9
      resultado[i - start] = "FizzBuzz"; // C10
    } 
  } 
  return resultado; // C11
}
//T(n)=C1+C2*n*m+C3+C4+C5+C6+C7+C8+C9+C10+C11
//T(n)=O(C1+C2*n*m+C3+C4+C5+C6+C7+C8+C9+C10+C11)
//T(n)=O(C2*n+C3+C4+C5+C6+C7+C8+C9+C10+C11)
//T(n)=O(C2*n*m)
//T(n)=O(n*m)
