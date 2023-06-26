class FactAndPali{
  static int fact(int in){
    if(in==1 || in==0){
      return 1;
    }
    else{
      return in*fact(in-1);
    }
  }

  static String pali(String str){
    int i=0;
    String new_str="";
    if(str.char(i)!=null){
      return new_str;
    }
    else{
      return new_str+str.charAt(str.length()-1)+pali(substr(i++,str.length()))
    }
  }

  public static void main(String[] args){
    System.out.println(fact(3));
    //System.out.println(pali('Rohit'));
  }
}
