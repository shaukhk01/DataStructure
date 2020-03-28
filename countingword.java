class CountWordVowel
{
    public static void main(String[]args)
    {
       String str="How are   You";
       char[] arr=str.toCharArray();
       int vcount=0;
       int ccount=0;
       int sp=0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
           {
               vcount++;
           }
           else if(arr[i]!=' ')
           {
               ccount++;
           }
           else if(arr[i]==' ' && arr[i-1]!=' ')//arr[i--]!=' '-->we can't take like this
           {                                    //Because of loop becomes infinte i-- also stored
               sp++;                            //value but not i+1 is not stored
         }
    }
       System.out.println("vowel: "+vcount+" constant: "+ccount+"spaces: "+sp);
  }
}
       
