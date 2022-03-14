public class Encryption {
    private String[][] message;

    public Encryption(String[][] message)
    {
        this.message = message;
    }

    public void shiftRows(int encryptionKey)
    {
        String temp;
        for (int i = 0; i < message.length; i++)
        {
            if (encryptionKey > 0)
            {
                for (int j = 0; j < encryptionKey; j++)
                {
                    temp = message[i][message[i].length - 1];
                    for (int k = message[i].length - 1; k > 0; k--)
                    {
                        message[i][k] = message[i][k - 1];
                    }
                    message[i][0] = temp;
                }
            }
            if (encryptionKey < 0)
            {
                for (int j = 0; j < Math.abs(encryptionKey); j++)
                {
                    temp = message[i][0];
                    for (int k = 0; k < message[i].length - 1; k++)
                    {
                        message[i][k] = message[i][k + 1];
                    }
                    message[i][message[i].length - 1] = temp;
                }
            }
        }
    }

    public void shiftColumns(int encryptionKey)
    {
        String temp;
        for (int i = 0; i < message[0].length; i++)
        {
            if (encryptionKey > 0)
            {
                for (int j = 0; j < encryptionKey; j++)
                {
                    temp = message[0][i];
                    for (int k = 0; k < message.length; k++)
                    {
                        message[k][i] = message[k + 1][i];
                    }
                    message[message.length - 1][i] = temp;
                }
            }
            if (encryptionKey < 0)
            {
                for (int j = 0; j < Math.abs(encryptionKey); j++)
                {
                    temp = message[message.length - 1][i];
                    for (int k = message.length - 1; k > 0; k--)
                    {
                        message[k][i] = message[k - 1][i];
                    }
                    message[0][i] = temp;
                }
            }
        }
    }

    public void encrypt()
    {
        shiftRows(3);
        shiftColumns(5);
    }

    public void decrypt()
    {
        shiftColumns(-5);
        shiftRows(-3);
    }
}
