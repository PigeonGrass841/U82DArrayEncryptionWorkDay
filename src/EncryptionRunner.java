public class EncryptionRunner {
    public static void main(String[] args)
    {
        String[][] message = {{"a", "b", "c"},
                              {"d", "e", "f"},
                              {"g", "h", "i"}};
        Encryption test = new Encryption(message);
        test.encrypt();
        System.out.println();
        test.decrypt();
    }
}
