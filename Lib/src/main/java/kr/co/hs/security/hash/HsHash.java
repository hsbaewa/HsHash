package kr.co.hs.security.hash;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 생성된 시간 2017-06-07, Bae 에 의해 생성됨
 * 프로젝트 이름 : HsHash
 * 패키지명 : kr.co.hs.security.hash
 */

public class HsHash implements HsHashImpl{
    private static final int DEFAULT_BUFFERSIZE = 8192;
    private static final String ALG_MD5 = "MD5";
    private static final String ALG_SHA1 = "SHA-1";
    private static final String ALG_SHA256 = "SHA-256";

    private static HsHash instance = null;
    public static HsHash getInstance(){
        if(instance == null)
            instance = new HsHash();
        return instance;
    }


    @Override
    public String getMD5Hex(String text) {
        try
        {
            MessageDigest md = MessageDigest.getInstance(ALG_MD5);
            byte[] messageDigest = md.digest(text.getBytes());
            String strMD5 = new BigInteger(1, messageDigest).toString(16);
            while(strMD5.length() < 32)
            {
                strMD5 = "0" + strMD5;
            }
            return strMD5;
        }
        catch(NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getMD5Hex(byte[] b, int bufferSize) {
        if(b == null)
            return null;

        try{
            MessageDigest md = MessageDigest.getInstance(ALG_MD5);
            ByteArrayInputStream bais = new ByteArrayInputStream(b);
            byte[] buf = new byte[bufferSize];
            int nReadCnt = 0;

            while((nReadCnt = bais.read(buf, 0, buf.length))>0){
                md.update(buf, 0, nReadCnt);
            }

            byte[] messageDigest = md.digest();
            String strMD5 = new BigInteger(1, messageDigest).toString(16);

            while(strMD5.length() < 32)
            {
                strMD5 = "0" + strMD5;
            }

            return strMD5;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String getMD5Hex(byte[] b) {
        return getMD5Hex(b, DEFAULT_BUFFERSIZE);
    }

    @Override
    public String getMD5Hex(File file, int bufferSize) {
        if(!file.exists())
            return null;

        try{
            MessageDigest md = MessageDigest.getInstance(ALG_MD5);

            FileInputStream fis = new FileInputStream(file);
            byte[] buf = new byte[bufferSize];
            int nReadCnt = 0;

            while((nReadCnt = fis.read(buf, 0, buf.length))>0){
                md.update(buf, 0, nReadCnt);
            }

            byte[] messageDigest = md.digest();
            String strMD5 = new BigInteger(1, messageDigest).toString(16);

            while(strMD5.length() < 32)
            {
                strMD5 = "0" + strMD5;
            }

            return strMD5;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String getMD5Hex(File file) {
        return getMD5Hex(file, DEFAULT_BUFFERSIZE);
    }

    @Override
    public String getSHA1Hex(String text) {
        try
        {
            MessageDigest md = MessageDigest.getInstance(ALG_SHA1);
            byte[] messageDigest = md.digest(text.getBytes());
            String strMD5 = new BigInteger(1, messageDigest).toString(16);
            while(strMD5.length() < 32)
            {
                strMD5 = "0" + strMD5;
            }
            return strMD5;
        }
        catch(NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getSHA1Hex(byte[] b, int bufferSize) {
        if(b == null)
            return null;

        try{
            MessageDigest md = MessageDigest.getInstance(ALG_SHA1);
            ByteArrayInputStream bais = new ByteArrayInputStream(b);
            byte[] buf = new byte[bufferSize];
            int nReadCnt = 0;

            while((nReadCnt = bais.read(buf, 0, buf.length))>0){
                md.update(buf, 0, nReadCnt);
            }

            byte[] messageDigest = md.digest();
            String strMD5 = new BigInteger(1, messageDigest).toString(16);

            while(strMD5.length() < 32)
            {
                strMD5 = "0" + strMD5;
            }

            return strMD5;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String getSHA1Hex(byte[] b) {
        return getSHA1Hex(b, DEFAULT_BUFFERSIZE);
    }

    @Override
    public String getSHA1Hex(File file, int bufferSize) {
        if(!file.exists())
            return null;

        try{
            MessageDigest md = MessageDigest.getInstance(ALG_SHA1);

            FileInputStream fis = new FileInputStream(file);
            byte[] buf = new byte[bufferSize];
            int nReadCnt = 0;

            while((nReadCnt = fis.read(buf, 0, buf.length))>0){
                md.update(buf, 0, nReadCnt);
            }

            byte[] messageDigest = md.digest();
            String strMD5 = new BigInteger(1, messageDigest).toString(16);

            while(strMD5.length() < 32)
            {
                strMD5 = "0" + strMD5;
            }

            return strMD5;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String getSHA1Hex(File file) {
        return getSHA1Hex(file, DEFAULT_BUFFERSIZE);
    }

    @Override
    public String getSHA256Hex(String text) {
        try
        {
            MessageDigest md = MessageDigest.getInstance(ALG_SHA256);
            byte[] messageDigest = md.digest(text.getBytes());
            String strMD5 = new BigInteger(1, messageDigest).toString(16);
            while(strMD5.length() < 32)
            {
                strMD5 = "0" + strMD5;
            }
            return strMD5;
        }
        catch(NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getSHA256Hex(byte[] b, int bufferSize) {
        if(b == null)
            return null;

        try{
            MessageDigest md = MessageDigest.getInstance(ALG_SHA256);
            ByteArrayInputStream bais = new ByteArrayInputStream(b);
            byte[] buf = new byte[bufferSize];
            int nReadCnt = 0;

            while((nReadCnt = bais.read(buf, 0, buf.length))>0){
                md.update(buf, 0, nReadCnt);
            }

            byte[] messageDigest = md.digest();
            String strMD5 = new BigInteger(1, messageDigest).toString(16);

            while(strMD5.length() < 32)
            {
                strMD5 = "0" + strMD5;
            }

            return strMD5;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String getSHA256Hex(byte[] b) {
        return getSHA256Hex(b, DEFAULT_BUFFERSIZE);
    }

    @Override
    public String getSHA256Hex(File file, int bufferSize) {
        if(!file.exists())
            return null;

        try{
            MessageDigest md = MessageDigest.getInstance(ALG_SHA256);

            FileInputStream fis = new FileInputStream(file);
            byte[] buf = new byte[bufferSize];
            int nReadCnt = 0;

            while((nReadCnt = fis.read(buf, 0, buf.length))>0){
                md.update(buf, 0, nReadCnt);
            }

            byte[] messageDigest = md.digest();
            String strMD5 = new BigInteger(1, messageDigest).toString(16);

            while(strMD5.length() < 32)
            {
                strMD5 = "0" + strMD5;
            }

            return strMD5;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String getSHA256Hex(File file) {
        return getSHA256Hex(file, DEFAULT_BUFFERSIZE);
    }
}
