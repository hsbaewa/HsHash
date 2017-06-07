package kr.co.hs.security.hash.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import kr.co.hs.security.hash.HsHash;

/**
 * 생성된 시간 2017-06-07, Bae 에 의해 생성됨
 * 프로젝트 이름 : HsHash
 * 패키지명 : kr.co.hs.security.hash.sample
 */

public class SampleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String md5 = HsHash.getInstance().getMD5Hex("a");
        String sha1 = HsHash.getInstance().getSHA1Hex("a");
        String sha256 = HsHash.getInstance().getSHA256Hex("a");

        Log.d("a","a");
    }
}
