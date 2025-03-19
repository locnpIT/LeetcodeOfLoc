public class _151_ReverseWordsInAString {
    
    public static void main(String[] args) {

        System.out.println(reverseWords("Nguyen Phuoc     Loc   "));
        
    }
    
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
            
        s = s.trim();
        String[] arr = s.split("\\s+");
        int len = arr.length;
        for(int i = len - 1; i >= 0; i--){
            if(i != 0)
                sb.append(arr[i] + " ");
            else
                sb.append(arr[i]);
        }
        return sb.toString();
    }
}
// upload this project to githubdfasdfasdfasdfdsfasd
// jfasdfasd;flkjkk

