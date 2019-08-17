//groupSum6 
public boolean groupSum6(int Inicio, int[] nums, int objetivo) {
  if (Inicio>=nums.length) {
    return objetivo==0;
  }
  if(nums[Inicio]!=6 && groupSum6(Inicio+1, nums, objetivo) 
    || groupSum6(Inicio+1, nums, objetivo-nums[Inicio])){
    return true;
  }
  
  else{
    return false;
  }
}

//groupNoAdj
public boolean groupNoAdj(int Inicio, int[] nums, int Objetivo) {
  if (Inicio>=nums.length) {
    return Objetivo==0;
  }
  if(groupNoAdj(Inicio+2, nums, Objetivo-nums[Inicio])
     ||groupNoAdj(Inicio+1, nums, Objetivo)){
    return true;
  }
  else{
    return false;
  }
}

//groupSum5
public boolean groupSum5(int Inicio, int[] nums, int Objetivo) {
  if (Inicio>=nums.length) {
    return Objetivo==0;
  }
  if(nums[Inicio]%5 ==0){
    if(Inicio <= nums.length - 2 && nums[Inicio+1] == 1){
      return groupSum5(Inicio+2, nums, Objetivo-nums[Inicio]);
    }
    return groupSum5(Inicio+1, nums, Objetivo-nums[Inicio]);
  }
  if(groupSum5(Inicio+1, nums, Objetivo-nums[Inicio])
    ||groupSum5(Inicio+1, nums, Objetivo)){
    return true;
  }
  else{
    return false;
  }
}

//groupSumClump 
public boolean groupSumClump(int start, int[] nums, int Objetivo) {
  if(start >= nums.length){
    return Objetivo == 0;
  }
  int inicio = start;
  int suma = 0;
  while(inicio < nums.length && nums[start] == nums[inicio]) {
    suma += nums[inicio];
    inicio++;
  }
  if(groupSumClump(inicio, nums, Objetivo-suma)
    || groupSumClump(inicio, nums, Objetivo)){
    return true;
  }
  else{
    return false;
  }
}

//splitArray 
public boolean splitArray(int[] nums) {
  return splitArrAux(0, nums, 0, 0);
}
public boolean splitArrAux(int Inicio, int[] nums, int grupo1, int grupo2) {
  if(Inicio >= nums.length){
    return grupo1 == grupo2;
  }
  if(splitArrAux(Inicio+1, nums, grupo1 + nums[Inicio], grupo2)
    || splitArrAux(Inicio+1, nums, grupo1, grupo2 + nums[Inicio])){
   return true;
  }
  else{
    return false;
  }
}
