class Test{
  static void isAnagram(String str1,String str2){
    String s1=str1.toLowerCase().replaceAll("\\s","");
    String s2=str2.toLowerCase().replaceAll("\\s","");
    int counter=0;
    int count=0;
    char s11[]=s1.toCharArray();
    char s22[]=s2.toCharArray();
    if(s11.length==s22.length){
          for(int i=0;i<s11.length;i++){
            for(int j=0;j<s22.length;j++){
              if(s11[i]==s22[j]){
                counter++;
              break;
            }
            }
          }

  for(int i=0;i<s22.length;i++){
            for(int j=0;j<s11.length;j++){
              if(s22[i]==s11[j]){
                count++;
              break;
            }
            }
          }

    if(counter==count){
      System.out.println("yes Anagram");
    }else{
      System.out.println("No Anagram");
    }

    }else{
      System.out.println("Not an Anagram");
    }
  }
  public static void main(String[]args){
     String s1="Mother in laa";
     String s2="Hitler Woman";
     isAnagram(s1,s2);
  }
}