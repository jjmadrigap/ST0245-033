public static int punto1(String a, String b){
	if(a.length()==0||b.length()==0)return 0;
    String finA = a.substring(1);
    String finB = b.substring(1);
    if(a.charAt(0)==b.charAt(0)){
      int finC = punto1(finA, finB);
      return 1 + finC;
    }
    else {
      int finC = Math.max(punto1(finA, b), punto1(a, finB));
      return finC;
	}
}