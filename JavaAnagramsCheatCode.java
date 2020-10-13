public class JavaAnagramsCheatCode {

    static boolean isAnagram(String a, String b) {
            alen=a.length();
            blen=b.length();
            if(alen!=blen) return false;
            a=a.toLowerCase();
            b=b.toLowerCase();

            char[] achars=a.toCharArray();
            char[] bchars=b.toCharArray();

            Arrays.sort(achars);
            Arrays.sort(bchars);

            return Arrays.equals(achars,bchars);
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