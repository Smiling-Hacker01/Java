//Ques is to move all X to the end of the string
public class Ques9{
     public static String moveX(String str,int index,int count){
        if (index == str.length()) {
            StringBuilder sb = new StringBuilder();
            for(int i =0; i<count; i++){
                sb.append('x');
            }    
            return sb.toString();
        }
        char curr = str.charAt(index);
        if (curr == 'x') {
            return moveX(str, index+1, count+1);
        }
        else{
            return curr + moveX(str, index+1, count);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxd";
        String result = moveX(str, 0, 0);
        System.out.println("String after moving X: " + result);
    }
}