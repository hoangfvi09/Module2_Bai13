public class AscendingString {

    public static String findAscendingString(String string){
        char currentChar=string.charAt(0);
        String result=""+currentChar;
        for(int i=1;i<string.length();i++){
            if (string.charAt(i) > result.charAt(result.length()-1)) {
                result+=string.charAt(i);

            }
        }
        return result;

    }

    public static void main(String[] args) {
        String string="minh la hoang vi xinh dep=)))";
        System.out.println(findAscendingString(string));
    }
}
