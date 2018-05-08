package com.boot.bootdemo.bean;

import javax.persistence.*;

public class DbInfo {
    /**
     * 主键
     */
    @Id
    @Column(name = "Id")
    private Integer id;

    /**
     * 最新版本号
     */
    @Column(name = "Version")
    private String version;

    /**
     * 用户的初始房卡
     */
    @Column(name = "InitialRoomCard")
    private Integer initialroomcard;

    /**
     * 用户的初始钻石
     */
    @Column(name = "InitialDiamond")
    private Integer initialdiamond;

    /**
     * 用户的初始金币
     */
    @Column(name = "InitialCoin")
    private Integer initialcoin;

    /**
     * 用户的初始积分
     */
    @Column(name = "InitialScore")
    private Integer initialscore;

    /**
     * 每日首次分享所得到的房卡
     */
    @Column(name = "ShareCard")
    private Integer sharecard;

    /**
     * 绑定群ID所得到的房卡
     */
    @Column(name = "BindCard")
    private Integer bindcard;

    /**
     * 游戏局数
     */
    @Column(name = "RoundNumber")
    private String roundnumber;

    /**
     * 房卡消耗（与游戏局数对应）
     */
    @Column(name = "NeedRoomCard")
    private String needroomcard;

    /**
     * 筹码档位配置
     */
    @Column(name = "ChipGear")
    private String chipgear;

    /**
     * 下载地址
     */
    @Column(name = "DownLoadPath")
    private String downloadpath;

    /**
     * 用于获取公网IP的第三方接口地址
     */
    @Column(name = "GetIpPath")
    private String getippath;

    /**
     * 平台手机号
     */
    @Column(name = "PhoneNumber")
    private String phonenumber;

    /**
     * 平台微信账号
     */
    @Column(name = "WechatAccount")
    private String wechataccount;

    /**
     * 平台QQ账号
     */
    @Column(name = "QQNumber")
    private String qqnumber;

    /**
     * 公告
     */
    @Column(name = "Notice")
    private String notice;

    /**
     * 新版本更新信息
     */
    @Column(name = "VersionMessage")
    private String versionmessage;

    /**
     * 允许开启调试模式的游戏ID列表
     */
    @Column(name = "DebugList")
    private String debuglist;

    /**
     * 获取主键
     *
     * @return Id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取最新版本号
     *
     * @return Version - 最新版本号
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置最新版本号
     *
     * @param version 最新版本号
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取用户的初始房卡
     *
     * @return InitialRoomCard - 用户的初始房卡
     */
    public Integer getInitialroomcard() {
        return initialroomcard;
    }

    /**
     * 设置用户的初始房卡
     *
     * @param initialroomcard 用户的初始房卡
     */
    public void setInitialroomcard(Integer initialroomcard) {
        this.initialroomcard = initialroomcard;
    }

    /**
     * 获取用户的初始钻石
     *
     * @return InitialDiamond - 用户的初始钻石
     */
    public Integer getInitialdiamond() {
        return initialdiamond;
    }

    /**
     * 设置用户的初始钻石
     *
     * @param initialdiamond 用户的初始钻石
     */
    public void setInitialdiamond(Integer initialdiamond) {
        this.initialdiamond = initialdiamond;
    }

    /**
     * 获取用户的初始金币
     *
     * @return InitialCoin - 用户的初始金币
     */
    public Integer getInitialcoin() {
        return initialcoin;
    }

    /**
     * 设置用户的初始金币
     *
     * @param initialcoin 用户的初始金币
     */
    public void setInitialcoin(Integer initialcoin) {
        this.initialcoin = initialcoin;
    }

    /**
     * 获取用户的初始积分
     *
     * @return InitialScore - 用户的初始积分
     */
    public Integer getInitialscore() {
        return initialscore;
    }

    /**
     * 设置用户的初始积分
     *
     * @param initialscore 用户的初始积分
     */
    public void setInitialscore(Integer initialscore) {
        this.initialscore = initialscore;
    }

    /**
     * 获取每日首次分享所得到的房卡
     *
     * @return ShareCard - 每日首次分享所得到的房卡
     */
    public Integer getSharecard() {
        return sharecard;
    }

    /**
     * 设置每日首次分享所得到的房卡
     *
     * @param sharecard 每日首次分享所得到的房卡
     */
    public void setSharecard(Integer sharecard) {
        this.sharecard = sharecard;
    }

    /**
     * 获取绑定群ID所得到的房卡
     *
     * @return BindCard - 绑定群ID所得到的房卡
     */
    public Integer getBindcard() {
        return bindcard;
    }

    /**
     * 设置绑定群ID所得到的房卡
     *
     * @param bindcard 绑定群ID所得到的房卡
     */
    public void setBindcard(Integer bindcard) {
        this.bindcard = bindcard;
    }

    /**
     * 获取游戏局数
     *
     * @return RoundNumber - 游戏局数
     */
    public String getRoundnumber() {
        return roundnumber;
    }

    /**
     * 设置游戏局数
     *
     * @param roundnumber 游戏局数
     */
    public void setRoundnumber(String roundnumber) {
        this.roundnumber = roundnumber;
    }

    /**
     * 获取房卡消耗（与游戏局数对应）
     *
     * @return NeedRoomCard - 房卡消耗（与游戏局数对应）
     */
    public String getNeedroomcard() {
        return needroomcard;
    }

    /**
     * 设置房卡消耗（与游戏局数对应）
     *
     * @param needroomcard 房卡消耗（与游戏局数对应）
     */
    public void setNeedroomcard(String needroomcard) {
        this.needroomcard = needroomcard;
    }

    /**
     * 获取筹码档位配置
     *
     * @return ChipGear - 筹码档位配置
     */
    public String getChipgear() {
        return chipgear;
    }

    /**
     * 设置筹码档位配置
     *
     * @param chipgear 筹码档位配置
     */
    public void setChipgear(String chipgear) {
        this.chipgear = chipgear;
    }

    /**
     * 获取下载地址
     *
     * @return DownLoadPath - 下载地址
     */
    public String getDownloadpath() {
        return downloadpath;
    }

    /**
     * 设置下载地址
     *
     * @param downloadpath 下载地址
     */
    public void setDownloadpath(String downloadpath) {
        this.downloadpath = downloadpath;
    }

    /**
     * 获取用于获取公网IP的第三方接口地址
     *
     * @return GetIpPath - 用于获取公网IP的第三方接口地址
     */
    public String getGetippath() {
        return getippath;
    }

    /**
     * 设置用于获取公网IP的第三方接口地址
     *
     * @param getippath 用于获取公网IP的第三方接口地址
     */
    public void setGetippath(String getippath) {
        this.getippath = getippath;
    }

    /**
     * 获取平台手机号
     *
     * @return PhoneNumber - 平台手机号
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * 设置平台手机号
     *
     * @param phonenumber 平台手机号
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     * 获取平台微信账号
     *
     * @return WechatAccount - 平台微信账号
     */
    public String getWechataccount() {
        return wechataccount;
    }

    /**
     * 设置平台微信账号
     *
     * @param wechataccount 平台微信账号
     */
    public void setWechataccount(String wechataccount) {
        this.wechataccount = wechataccount;
    }

    /**
     * 获取平台QQ账号
     *
     * @return QQNumber - 平台QQ账号
     */
    public String getQqnumber() {
        return qqnumber;
    }

    /**
     * 设置平台QQ账号
     *
     * @param qqnumber 平台QQ账号
     */
    public void setQqnumber(String qqnumber) {
        this.qqnumber = qqnumber;
    }

    /**
     * 获取公告
     *
     * @return Notice - 公告
     */
    public String getNotice() {
        return notice;
    }

    /**
     * 设置公告
     *
     * @param notice 公告
     */
    public void setNotice(String notice) {
        this.notice = notice;
    }

    /**
     * 获取新版本更新信息
     *
     * @return VersionMessage - 新版本更新信息
     */
    public String getVersionmessage() {
        return versionmessage;
    }

    /**
     * 设置新版本更新信息
     *
     * @param versionmessage 新版本更新信息
     */
    public void setVersionmessage(String versionmessage) {
        this.versionmessage = versionmessage;
    }

    /**
     * 获取允许开启调试模式的游戏ID列表
     *
     * @return DebugList - 允许开启调试模式的游戏ID列表
     */
    public String getDebuglist() {
        return debuglist;
    }

    /**
     * 设置允许开启调试模式的游戏ID列表
     *
     * @param debuglist 允许开启调试模式的游戏ID列表
     */
    public void setDebuglist(String debuglist) {
        this.debuglist = debuglist;
    }
}