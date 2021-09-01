package com.tencent.qcloud.ugckit.module.record;

import androidx.annotation.NonNull;

import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.demo.beauty.BeautyParams;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.ugc.TXRecordCommon;

/**
 * 录制的配置
 */
public class UGCKitRecordConfig {
    @NonNull
    private static UGCKitRecordConfig sInstance = new UGCKitRecordConfig();

    protected UGCKitRecordConfig() {

    }

    @NonNull
    public static UGCKitRecordConfig getInstance() {
        return sInstance;
    }

    public int     mQuality         = TXRecordCommon.VIDEO_QUALITY_HIGH;
    public int     mVideoBitrate    = 9600;
    public int     mResolution      = TXRecordCommon.VIDEO_RESOLUTION_720_1280;
    public int     mGOP             = 3;
    public int     mFPS             = 20;
    public boolean mIsMute          = false;
    public boolean mIsNeedEdit      = true;
    /**
     * 录制暂留图片透明度，为0的时候，代表取消暂留图片
     *
     * 暂时关闭暂留画面，等IOS上线该功能后再一起打开 kongdywang 2021/08/31/
     */
    public float mPauseSnapOpacity = 0f;
    /**
     * 录制最短时间（以毫秒为单位）
     */
    public int     mMinDuration     = 2 * 1000;
    /**
     * 录制最长时间（以毫秒为单位）
     */
    public int     mMaxDuration     = 16 * 1000;
    /**
     * 录制方向
     */
    public int     mHomeOrientation = TXLiveConstants.VIDEO_ANGLE_HOME_DOWN;

    /**
     * 渲染方向
     */
    public int mRenderRotation = TXLiveConstants.RENDER_ROTATION_PORTRAIT;

    /**
     * 录制速度
     */
    public int mRecordSpeed = TXRecordCommon.RECORD_SPEED_NORMAL;

    /**
     * 是否前置摄像头
     */
    public boolean mFrontCamera = true;

    /**
     * 开启手动聚焦；自动聚焦设置为false
     */
    public boolean mTouchFocus = false;

    /**
     * 当前屏比
     */
    public int mAspectRatio = TXRecordCommon.VIDEO_ASPECT_RATIO_9_16;

    /**
     * 录制模式
     */
    public int mRecordMode = RecordModeView.RECORD_MODE_CLICK;

    /**
     * 美颜参数
     */
    @NonNull
    public BeautyParams mBeautyParams;

    /**
     * 背景音乐信息
     */
    @NonNull
    public MusicInfo musicInfo = new MusicInfo();


    /**
     * 视频合唱时AEC 类型
     */
    public int mAECType = TXEAudioDef.TXE_AEC_NONE;

    /**
     * ugc 合唱场景，开启外放场景下，音量设置为系统的60%
     */
    public float mPlayoutVolumePercentForUGC = 0.6F;


    /**
     * 清空配置
     */
    public void clear() {
        mQuality = TXRecordCommon.VIDEO_QUALITY_HIGH;
        mVideoBitrate = 9600;
        mResolution = TXRecordCommon.VIDEO_RESOLUTION_720_1280;
        mGOP = 3;
        mFPS = 20;
        mMinDuration = 2 * 1000;
        mMaxDuration = 16 * 1000;
        mHomeOrientation = TXLiveConstants.VIDEO_ANGLE_HOME_DOWN;
        mRenderRotation = TXLiveConstants.RENDER_ROTATION_PORTRAIT;
        mRecordSpeed = TXRecordCommon.RECORD_SPEED_NORMAL;
        mFrontCamera = true;
        mTouchFocus = false;
        mAspectRatio = TXRecordCommon.VIDEO_ASPECT_RATIO_9_16;
        mRecordMode = RecordModeView.RECORD_MODE_CLICK;
        mBeautyParams = null;
        musicInfo = new MusicInfo();
        mAECType = TXEAudioDef.TXE_AEC_NONE;
        mPauseSnapOpacity = 0.7f;
    }
}
