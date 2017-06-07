package kr.co.hs.security.hash;

import java.io.File;

/**
 * 생성된 시간 2017-06-07, Bae 에 의해 생성됨
 * 프로젝트 이름 : HsHash
 * 패키지명 : kr.co.hs.security.hash
 */

public interface HsHashImpl {
    String getMD5Hex(String text);
    String getMD5Hex(byte[] b, int bufferSize);
    String getMD5Hex(byte[] b);
    String getMD5Hex(File file, int bufferSize);
    String getMD5Hex(File file);

    String getSHA1Hex(String text);
    String getSHA1Hex(byte[] b, int bufferSize);
    String getSHA1Hex(byte[] b);
    String getSHA1Hex(File file, int bufferSize);
    String getSHA1Hex(File file);

    String getSHA256Hex(String text);
    String getSHA256Hex(byte[] b, int bufferSize);
    String getSHA256Hex(byte[] b);
    String getSHA256Hex(File file, int bufferSize);
    String getSHA256Hex(File file);
}
