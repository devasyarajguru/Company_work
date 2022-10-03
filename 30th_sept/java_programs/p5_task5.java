import javax.crypto.*;

public class p5_task5{
    public static void main(String[] args) {
        String value = "Gain Knowledge"; // my string value
        int secret_key = 8;// generate key

        System.out.println("Original Value: "+ value);
        String encrypt = getEncryptedValue(value,secret_key); // calling a method to get encrypted value
        System.out.println("Encrypted Value: "+ encrypt);

        String decrypt = getDecryptedValue(encrypt,secret_key); // calling a method to get decrypted value
        System.out.println("Decrpyted Value: "+ decrypt);

    }

    private static String getDecryptedValue(String encrypt, int secret_key) {
        String decrypted = "";
        for (int i = 0; i < encrypt.length(); i++) {
            char ch = encrypt.charAt(i);
            ch -= secret_key;
            decrypted = decrypted + ch; 
        }
        return decrypted;
    }

    // generating a method to get encrypted value
    private static String getEncryptedValue(String value, int secret_key) {
        String encrypt = "";
        for (int i = 0; i < value.length(); i++) {
             char ch = value.charAt(i);
             ch+= secret_key;
             encrypt = encrypt + ch;
            
        }
        return encrypt;
    }
}