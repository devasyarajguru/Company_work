public class p3_task3 {
    public static void main(String[] args) {
        String str = "Devasya Rajguru";// Our String 

        char[] strArray = str.toCharArray(); // this method stores string character as a sequence of characters stored in Array

        // StringBuffer s = new StringBuffer();
        String str2="";

        for(int i = 0;i<strArray.length;i++)
        {
            if((strArray[i]!= ' ')&&(strArray[i]!='\t'))
            {
                str2 = str2 + strArray[i];
                // s.append(strArray[i]);

            }
        }
        System.out.println(str2);
    
    }
}
