//bunnyEars2
public int bunnyEars2(int conejos) {
  if(conejos==0){
    return 0;
  }
  if(conejos%2==0){
    return 3+bunnyEars2(conejos-1);
  }
  else{
    return 2+bunnyEars2(conejos-1);
  }
}

//triangle 
public int triangle(int lineas) {
  if(lineas==0){
    return 0;
  }
  if(lineas==1){
    return 1;
  }else{
    return lineas +triangle(lineas-1);
  }
}

//count7 
public int count7(int numero) {
  if(numero<=0){
    return 0;
  }
  if(numero%10==7){
    return 1+count7(numero/10);
  }
  else{
    return count7(numero/10);
  }
}

//count8
public int count8(int numero) {
  if(numero<1){
    return 0;
  }
  if(numero%10==8 && (numero/10)%10==8){
    return 2+count8(numero/10);
  }
  if(numero%10==8){
    return 1+count8(numero/10);
  }else{
    return count8(numero/10);
  }
}

//countX 
public int countX(String cadena) {
  if(cadena.length()==0){
    return 0;
  }
  if((cadena.substring(cadena.length()-1)).equals("x")){
    return 1+countX(cadena.substring(0,cadena.length()-1));
  }
  else{
    return countX(cadena.substring(0,cadena.length()-1));
  }
}
