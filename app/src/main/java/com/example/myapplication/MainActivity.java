package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//下面是wuji的import
 import java.util.HashMap;
 import java.util.Map;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
//import com.company.altarball.R;
import java.util.HashMap;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      //  playSound(1);

    }

    //初始化SoundPool



    /*
    HashMap<Integer, Integer> soundMap = new HashMap<Integer, Integer>();
    private SoundPool soundPool;
    private float volumnRatio;
    private AudioManager am;
    private void initSound(){
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 5);
        soundMap.put(1, soundPool.load(this, R.raw.barcodebeep, 1)); //播放的声音文件
        soundMap.put(2, soundPool.load(this, R.raw.serror, 1)); //播放的声音文件
        am = (AudioManager) this.getSystemService(AUDIO_SERVICE);// 实例化AudioManager对象
    }*/

    /**
     * 播放提示音
     *
     * @param id 成功1，失败2
     */

    /*
    public void playSound(int id) {

        float audioMaxVolumn = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC); // 返回当前AudioManager对象的最大音量值
        float audioCurrentVolumn = am.getStreamVolume(AudioManager.STREAM_MUSIC);// 返回当前AudioManager对象的音量值
        volumnRatio = audioCurrentVolumn / audioMaxVolumn;
        try {
            soundPool.play(soundMap.get(id), volumnRatio, // 左声道音量
                    volumnRatio, // 右声道音量
                    1, // 优先级，0为最低
                    0, // 循环次数，0无不循环，-1无永远循环
                    1 // 回放速度 ，该值在0.5-2.0之间，1为正常速度
            );
        } catch (Exception e) {
            e.printStackTrace();

        }
    }*/
    public void wuji2() {
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.currentThread().sleep(1000);//毫秒
            } catch (Exception e) {
            }
            wuji1();
        }
    }

    public void wuji1(){


         SoundPool soundPool= new SoundPool(10,AudioManager.STREAM_SYSTEM,5);
        //加载deep 音频文件
        soundPool.load(this,R.raw.beep,1);
//播放deep
        soundPool.play(1,1, 1, 0, 0, 1);

    }

}
