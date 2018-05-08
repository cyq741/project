package com.boot.bootdemo.bean;

import javax.persistence.*;

public class UserInfo {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "UserId")
    private String userid;

    /**
     * 游戏ID
     */
    @Id
    @Column(name = "GameId")
    private Integer gameid;

    /**
     * 手机号
     */
    @Column(name = "PhoneNumber")
    private String phonenumber;

    /**
     * 后台密码
     */
    @Column(name = "Password")
    private String password;

    /**
     * 用户昵称
     */
    @Column(name = "NickName")
    private String nickname;

    /**
     * 用户头像地址
     */
    @Column(name = "HeadImgUrl")
    private String headimgurl;

    /**
     * 性别（1：男，2：女）
     */
    @Column(name = "Sex")
    private Integer sex;

    /**
     * 个人签名
     */
    @Column(name = "Signature")
    private String signature;

    /**
     * 真实姓名
     */
    @Column(name = "RealName")
    private String realname;

    /**
     * 身份证号
     */
    @Column(name = "IDNumber")
    private String idnumber;

    /**
     * 微信账号
     */
    @Column(name = "WechatAccount")
    private String wechataccount;

    /**
     * 支付宝账号
     */
    @Column(name = "AlipayAccount")
    private String alipayaccount;

    /**
     * 用户权限（0:普通玩家，按级别高低依次递增）
     */
    @Column(name = "Permission")
    private Integer permission;

    /**
     * 管理者或者叫上级同时也做群ID使用
     */
    @Column(name = "Manager")
    private Integer manager;

    /**
     * 玩家公网IP
     */
    @Column(name = "InternetIp")
    private String internetip;

    /**
     * 用户Token
     */
    @Column(name = "Token")
    private String token;

    /**
     * 心跳同步时间
     */
    @Column(name = "HeartBeatTime")
    private String heartbeattime;

    /**
     * 最后分享时间（用于首次分享检测）
     */
    @Column(name = "LastShareTime")
    private String lastsharetime;

    /**
     * 房卡
     */
    @Column(name = "RoomCard")
    private Integer roomcard;

    /**
     * 钻石
     */
    @Column(name = "Diamond")
    private Integer diamond;

    /**
     * 金币
     */
    @Column(name = "Coin")
    private Integer coin;

    /**
     * 积分
     */
    @Column(name = "Score")
    private Integer score;

    /**
     * 玩家诈金花游戏中的最大积分
     */
    @Column(name = "ZJHMaxScore")
    private Integer zjhmaxscore;

    /**
     * 玩家诈金花游戏中玩过的大局数目
     */
    @Column(name = "ZJHRoomTimes")
    private Integer zjhroomtimes;

    /**
     * 玩家牛牛游戏中的最大积分
     */
    @Column(name = "NNMaxScore")
    private Integer nnmaxscore;

    /**
     * 玩家牛牛游戏中玩过的大局数目
     */
    @Column(name = "NNRoomTimes")
    private Integer nnroomtimes;

    /**
     * 是否是首次登陆
     */
    @Column(name = "First")
    private Boolean first;

    /**
     * 是否冻结（0，正常；1冻结）
     */
    @Column(name = "Frozen")
    private Boolean frozen;

    /**
     * 麻将战绩
     */
    @Column(name = "MJRecord")
    private String mjrecord;

    /**
     * 诈金花战绩
     */
    @Column(name = "ZJHRecord")
    private String zjhrecord;

    /**
     * 牛牛战绩
     */
    @Column(name = "NNRecord")
    private String nnrecord;

    /**
     * 获取用户ID
     *
     * @return UserId - 用户ID
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置用户ID
     *
     * @param userid 用户ID
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取游戏ID
     *
     * @return GameId - 游戏ID
     */
    public Integer getGameid() {
        return gameid;
    }

    /**
     * 设置游戏ID
     *
     * @param gameid 游戏ID
     */
    public void setGameid(Integer gameid) {
        this.gameid = gameid;
    }

    /**
     * 获取手机号
     *
     * @return PhoneNumber - 手机号
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * 设置手机号
     *
     * @param phonenumber 手机号
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     * 获取后台密码
     *
     * @return Password - 后台密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置后台密码
     *
     * @param password 后台密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户昵称
     *
     * @return NickName - 用户昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置用户昵称
     *
     * @param nickname 用户昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取用户头像地址
     *
     * @return HeadImgUrl - 用户头像地址
     */
    public String getHeadimgurl() {
        return headimgurl;
    }

    /**
     * 设置用户头像地址
     *
     * @param headimgurl 用户头像地址
     */
    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    /**
     * 获取性别（1：男，2：女）
     *
     * @return Sex - 性别（1：男，2：女）
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别（1：男，2：女）
     *
     * @param sex 性别（1：男，2：女）
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取个人签名
     *
     * @return Signature - 个人签名
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 设置个人签名
     *
     * @param signature 个人签名
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * 获取真实姓名
     *
     * @return RealName - 真实姓名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 设置真实姓名
     *
     * @param realname 真实姓名
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 获取身份证号
     *
     * @return IDNumber - 身份证号
     */
    public String getIdnumber() {
        return idnumber;
    }

    /**
     * 设置身份证号
     *
     * @param idnumber 身份证号
     */
    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    /**
     * 获取微信账号
     *
     * @return WechatAccount - 微信账号
     */
    public String getWechataccount() {
        return wechataccount;
    }

    /**
     * 设置微信账号
     *
     * @param wechataccount 微信账号
     */
    public void setWechataccount(String wechataccount) {
        this.wechataccount = wechataccount;
    }

    /**
     * 获取支付宝账号
     *
     * @return AlipayAccount - 支付宝账号
     */
    public String getAlipayaccount() {
        return alipayaccount;
    }

    /**
     * 设置支付宝账号
     *
     * @param alipayaccount 支付宝账号
     */
    public void setAlipayaccount(String alipayaccount) {
        this.alipayaccount = alipayaccount;
    }

    /**
     * 获取用户权限（0:普通玩家，按级别高低依次递增）
     *
     * @return Permission - 用户权限（0:普通玩家，按级别高低依次递增）
     */
    public Integer getPermission() {
        return permission;
    }

    /**
     * 设置用户权限（0:普通玩家，按级别高低依次递增）
     *
     * @param permission 用户权限（0:普通玩家，按级别高低依次递增）
     */
    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    /**
     * 获取管理者或者叫上级同时也做群ID使用
     *
     * @return Manager - 管理者或者叫上级同时也做群ID使用
     */
    public Integer getManager() {
        return manager;
    }

    /**
     * 设置管理者或者叫上级同时也做群ID使用
     *
     * @param manager 管理者或者叫上级同时也做群ID使用
     */
    public void setManager(Integer manager) {
        this.manager = manager;
    }

    /**
     * 获取玩家公网IP
     *
     * @return InternetIp - 玩家公网IP
     */
    public String getInternetip() {
        return internetip;
    }

    /**
     * 设置玩家公网IP
     *
     * @param internetip 玩家公网IP
     */
    public void setInternetip(String internetip) {
        this.internetip = internetip;
    }

    /**
     * 获取用户Token
     *
     * @return Token - 用户Token
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置用户Token
     *
     * @param token 用户Token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 获取心跳同步时间
     *
     * @return HeartBeatTime - 心跳同步时间
     */
    public String getHeartbeattime() {
        return heartbeattime;
    }

    /**
     * 设置心跳同步时间
     *
     * @param heartbeattime 心跳同步时间
     */
    public void setHeartbeattime(String heartbeattime) {
        this.heartbeattime = heartbeattime;
    }

    /**
     * 获取最后分享时间（用于首次分享检测）
     *
     * @return LastShareTime - 最后分享时间（用于首次分享检测）
     */
    public String getLastsharetime() {
        return lastsharetime;
    }

    /**
     * 设置最后分享时间（用于首次分享检测）
     *
     * @param lastsharetime 最后分享时间（用于首次分享检测）
     */
    public void setLastsharetime(String lastsharetime) {
        this.lastsharetime = lastsharetime;
    }

    /**
     * 获取房卡
     *
     * @return RoomCard - 房卡
     */
    public Integer getRoomcard() {
        return roomcard;
    }

    /**
     * 设置房卡
     *
     * @param roomcard 房卡
     */
    public void setRoomcard(Integer roomcard) {
        this.roomcard = roomcard;
    }

    /**
     * 获取钻石
     *
     * @return Diamond - 钻石
     */
    public Integer getDiamond() {
        return diamond;
    }

    /**
     * 设置钻石
     *
     * @param diamond 钻石
     */
    public void setDiamond(Integer diamond) {
        this.diamond = diamond;
    }

    /**
     * 获取金币
     *
     * @return Coin - 金币
     */
    public Integer getCoin() {
        return coin;
    }

    /**
     * 设置金币
     *
     * @param coin 金币
     */
    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    /**
     * 获取积分
     *
     * @return Score - 积分
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置积分
     *
     * @param score 积分
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取玩家诈金花游戏中的最大积分
     *
     * @return ZJHMaxScore - 玩家诈金花游戏中的最大积分
     */
    public Integer getZjhmaxscore() {
        return zjhmaxscore;
    }

    /**
     * 设置玩家诈金花游戏中的最大积分
     *
     * @param zjhmaxscore 玩家诈金花游戏中的最大积分
     */
    public void setZjhmaxscore(Integer zjhmaxscore) {
        this.zjhmaxscore = zjhmaxscore;
    }

    /**
     * 获取玩家诈金花游戏中玩过的大局数目
     *
     * @return ZJHRoomTimes - 玩家诈金花游戏中玩过的大局数目
     */
    public Integer getZjhroomtimes() {
        return zjhroomtimes;
    }

    /**
     * 设置玩家诈金花游戏中玩过的大局数目
     *
     * @param zjhroomtimes 玩家诈金花游戏中玩过的大局数目
     */
    public void setZjhroomtimes(Integer zjhroomtimes) {
        this.zjhroomtimes = zjhroomtimes;
    }

    /**
     * 获取玩家牛牛游戏中的最大积分
     *
     * @return NNMaxScore - 玩家牛牛游戏中的最大积分
     */
    public Integer getNnmaxscore() {
        return nnmaxscore;
    }

    /**
     * 设置玩家牛牛游戏中的最大积分
     *
     * @param nnmaxscore 玩家牛牛游戏中的最大积分
     */
    public void setNnmaxscore(Integer nnmaxscore) {
        this.nnmaxscore = nnmaxscore;
    }

    /**
     * 获取玩家牛牛游戏中玩过的大局数目
     *
     * @return NNRoomTimes - 玩家牛牛游戏中玩过的大局数目
     */
    public Integer getNnroomtimes() {
        return nnroomtimes;
    }

    /**
     * 设置玩家牛牛游戏中玩过的大局数目
     *
     * @param nnroomtimes 玩家牛牛游戏中玩过的大局数目
     */
    public void setNnroomtimes(Integer nnroomtimes) {
        this.nnroomtimes = nnroomtimes;
    }

    /**
     * 获取是否是首次登陆
     *
     * @return First - 是否是首次登陆
     */
    public Boolean getFirst() {
        return first;
    }

    /**
     * 设置是否是首次登陆
     *
     * @param first 是否是首次登陆
     */
    public void setFirst(Boolean first) {
        this.first = first;
    }

    /**
     * 获取是否冻结（0，正常；1冻结）
     *
     * @return Frozen - 是否冻结（0，正常；1冻结）
     */
    public Boolean getFrozen() {
        return frozen;
    }

    /**
     * 设置是否冻结（0，正常；1冻结）
     *
     * @param frozen 是否冻结（0，正常；1冻结）
     */
    public void setFrozen(Boolean frozen) {
        this.frozen = frozen;
    }

    /**
     * 获取麻将战绩
     *
     * @return MJRecord - 麻将战绩
     */
    public String getMjrecord() {
        return mjrecord;
    }

    /**
     * 设置麻将战绩
     *
     * @param mjrecord 麻将战绩
     */
    public void setMjrecord(String mjrecord) {
        this.mjrecord = mjrecord;
    }

    /**
     * 获取诈金花战绩
     *
     * @return ZJHRecord - 诈金花战绩
     */
    public String getZjhrecord() {
        return zjhrecord;
    }

    /**
     * 设置诈金花战绩
     *
     * @param zjhrecord 诈金花战绩
     */
    public void setZjhrecord(String zjhrecord) {
        this.zjhrecord = zjhrecord;
    }

    /**
     * 获取牛牛战绩
     *
     * @return NNRecord - 牛牛战绩
     */
    public String getNnrecord() {
        return nnrecord;
    }

    /**
     * 设置牛牛战绩
     *
     * @param nnrecord 牛牛战绩
     */
    public void setNnrecord(String nnrecord) {
        this.nnrecord = nnrecord;
    }
}