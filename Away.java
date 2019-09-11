/*
Date: 9/11/2019
CCI chap1, #15
*/
public class Away{

  public static void main(String[] args){

    System.out.println(compare("pale", "bale"));

  }
  static boolean compare(String a, String b){
    int a_len = a.length();
    int b_len = b.length();
    int count = 0;

    if (a_len != b_len){
      count +=1;
      int len = (a_len > b_len) ? b_len : a_len;
      for (int i=0; i < len; i++){
        if (a.charAt(i) != b.charAt(i)){
          count +=1;
        }
      }
    }else {
      for (int j=0; j < a_len; j++){
        if (a.charAt(j) != b.charAt(j)){
          count += 1;
        }
      }
    }

    if (count > 1){
      return false;
    }
    return true;
  }
}
