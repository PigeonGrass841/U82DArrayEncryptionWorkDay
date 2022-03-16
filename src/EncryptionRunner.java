import java.util.Arrays;

public class EncryptionRunner {
    public static void main(String[] args)
    {
        String[][] message = {{"a", "b", "c"},
                              {"d", "e", "f"},
                              {"g", "h", "i"}};

        Encryption test = new Encryption(message);

        test.encrypt();
        for (int i = 0; i < message.length; i++)
        {
            System.out.println(Arrays.toString(message[i]));
        }

        System.out.println("---------------");

        test.decrypt();
        for (int i = 0; i < message.length; i++)
        {
            System.out.println(Arrays.toString(message[i]));
        }
    }
}
