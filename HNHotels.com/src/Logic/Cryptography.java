package Logic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public final class Cryptography {
    private static Cipher RSA;
    private static PublicKey publicKey;
    private static PrivateKey privateKey;

    public Cryptography() {
        try {
            //Generates a pair of keys.
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            publicKey = keyPair.getPublic();
            privateKey = keyPair.getPrivate();
        } catch (Exception ex) {
            System.out.println("Failed to generate encryption keys for the password.");
        }
    }
    
    public static byte[] encrypt(String password){
        byte[] encrypted;
        try {
            //Gets the instance of the class corresponding to RSA encryption.
            RSA = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            //Encrypting.
            RSA.init(Cipher.ENCRYPT_MODE, publicKey);
            encrypted =  RSA.doFinal(password.getBytes());
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException
        | IllegalBlockSizeException | BadPaddingException ex) {
            System.out.println("Failed to encrypt password.");
            encrypted = new byte[0];
        }
        return encrypted;
    }
    
    public static String decrypt(byte[] encrypted){
        String decryptedText;
        try {
            //Decrypting.
            RSA.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] bytesDesencriptados = RSA.doFinal(encrypted);
            decryptedText = new String(bytesDesencriptados);
        } catch (InvalidKeyException | IllegalBlockSizeException | BadPaddingException ex) {
            System.out.println("Failed to desencrypt password.");
            decryptedText = "";
        }
        return decryptedText;
    }

    private static PublicKey loadPublicKey(String fileName) throws Exception {
       FileInputStream file = new FileInputStream(fileName);
       int numBtyes = file.available();
       byte[] bytes = new byte[numBtyes];
       file.read(bytes);
       file.close();
       KeyFactory keyFactory = KeyFactory.getInstance("RSA");
       KeySpec keySpec = new X509EncodedKeySpec(bytes);
       PublicKey keyFromBytes = keyFactory.generatePublic(keySpec);
       return keyFromBytes;
    }

    private static PrivateKey loadPrivateKey(String fileName){
        PrivateKey keyFromBytes = null;
        try{
            FileInputStream file = new FileInputStream(fileName);
            int numBtyes = file.available();
            byte[] bytes = new byte[numBtyes];
            file.read(bytes);
            file.close();
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            KeySpec keySpec = new PKCS8EncodedKeySpec(bytes);
            keyFromBytes = keyFactory.generatePrivate(keySpec);
        }
        catch(IOException | NoSuchAlgorithmException | InvalidKeySpecException ex){
            System.out.println("Error loading key.");
        }
       return keyFromBytes;
    }

    private static void saveKey(Key key, String fileName){
        byte[] publicKeyBytes = key.getEncoded();
        try{
            FileOutputStream file = new FileOutputStream(fileName);
            file.write(publicKeyBytes);
            file.close();
        }
        catch(Exception ex){
            System.out.println("Failed to save key.");
        }
    }
}
