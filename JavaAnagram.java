public class JavaAnagram {

    static boolean isAnagram(String a, String b) {
			int alen=a.length();
            int blen=b.length();
			
			a=a.toLowerCase();
            b=b.toLowerCase();
			
            if(alen!=blen) return false;
			
            int charfre[]=new int[26];
			
            for(int i=0;i<a.length();i++){
                char currentChar=a.charAt(i);
                int index=currentChar-'a';
                charfre[index]++;
            }
			
            for(int i=0;i<b.length();i++){
                char currentChar=b.charAt(i);
                int index=currentChar-'a';
                charfre[index]--;
            }

            for(int i=0;i<26;i++){
                if(charfre[i]!=0) return false;
            }
			
            return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}