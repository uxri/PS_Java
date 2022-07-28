package JavaCoding;

import java.util.HashSet;
//임시 완료, 추후 수정 필요
public class Q5_Duplicate {
    public static void main(String[] args){

        String str = "yuree";
        HashSet hash = new HashSet();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int count = 1;

            if (!hash.add(c)) {
                count++;
            } if (hash.add(c))  {
                count--;
            }

            System.out.println("duplicate character : " + c + " ====== " + " count : " + count);
        }
    }
}
