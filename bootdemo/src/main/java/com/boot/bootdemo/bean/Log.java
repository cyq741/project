package com.boot.bootdemo.bean;

import javax.persistence.*;

@Table(name = "recharge_log")
public class Log {
    /**
     * 日志ID
     */
    @Id
    @Column(name = "LogId")
    private String logid;

    /**
     * 转出方 游戏ID+换行+昵称，平台购买时为空
     */
    @Column(name = "PayUserInfo")
    private String payuserinfo;

    /**
     * 转入方 游戏ID+换行+昵称，自己消费时为空
     */
    @Column(name = "IncomeUserInfo")
    private String incomeuserinfo;

    /**
     * 转入资产的类型（RoomCard、Coin）
     */
    @Column(name = "RechargeType")
    private String rechargetype;

    /**
     * 转入资产的数量
     */
    @Column(name = "RechargeNumber")
    private String rechargenumber;

    /**
     * 转出方资产变化后的数量
     */
    @Column(name = "PayResultNumber")
    private String payresultnumber;

    /**
     * 转入方资产变化后的数量
     */
    @Column(name = "IncomeResultNumber")
    private String incomeresultnumber;

    /**
     * 充值时间
     */
    @Column(name = "RechargeTime")
    private String rechargetime;

    /**
     * 获取日志ID
     *
     * @return LogId - 日志ID
     */
    public String getLogid() {
        return logid;
    }

    /**
     * 设置日志ID
     *
     * @param logid 日志ID
     */
    public void setLogid(String logid) {
        this.logid = logid;
    }

    /**
     * 获取转出方 游戏ID+换行+昵称，平台购买时为空
     *
     * @return PayUserInfo - 转出方 游戏ID+换行+昵称，平台购买时为空
     */
    public String getPayuserinfo() {
        return payuserinfo;
    }

    /**
     * 设置转出方 游戏ID+换行+昵称，平台购买时为空
     *
     * @param payuserinfo 转出方 游戏ID+换行+昵称，平台购买时为空
     */
    public void setPayuserinfo(String payuserinfo) {
        this.payuserinfo = payuserinfo;
    }

    /**
     * 获取转入方 游戏ID+换行+昵称，自己消费时为空
     *
     * @return IncomeUserInfo - 转入方 游戏ID+换行+昵称，自己消费时为空
     */
    public String getIncomeuserinfo() {
        return incomeuserinfo;
    }

    /**
     * 设置转入方 游戏ID+换行+昵称，自己消费时为空
     *
     * @param incomeuserinfo 转入方 游戏ID+换行+昵称，自己消费时为空
     */
    public void setIncomeuserinfo(String incomeuserinfo) {
        this.incomeuserinfo = incomeuserinfo;
    }

    /**
     * 获取转入资产的类型（RoomCard、Coin）
     *
     * @return RechargeType - 转入资产的类型（RoomCard、Coin）
     */
    public String getRechargetype() {
        return rechargetype;
    }

    /**
     * 设置转入资产的类型（RoomCard、Coin）
     *
     * @param rechargetype 转入资产的类型（RoomCard、Coin）
     */
    public void setRechargetype(String rechargetype) {
        this.rechargetype = rechargetype;
    }

    /**
     * 获取转入资产的数量
     *
     * @return RechargeNumber - 转入资产的数量
     */
    public String getRechargenumber() {
        return rechargenumber;
    }

    /**
     * 设置转入资产的数量
     *
     * @param rechargenumber 转入资产的数量
     */
    public void setRechargenumber(String rechargenumber) {
        this.rechargenumber = rechargenumber;
    }

    /**
     * 获取转出方资产变化后的数量
     *
     * @return PayResultNumber - 转出方资产变化后的数量
     */
    public String getPayresultnumber() {
        return payresultnumber;
    }

    /**
     * 设置转出方资产变化后的数量
     *
     * @param payresultnumber 转出方资产变化后的数量
     */
    public void setPayresultnumber(String payresultnumber) {
        this.payresultnumber = payresultnumber;
    }

    /**
     * 获取转入方资产变化后的数量
     *
     * @return IncomeResultNumber - 转入方资产变化后的数量
     */
    public String getIncomeresultnumber() {
        return incomeresultnumber;
    }

    /**
     * 设置转入方资产变化后的数量
     *
     * @param incomeresultnumber 转入方资产变化后的数量
     */
    public void setIncomeresultnumber(String incomeresultnumber) {
        this.incomeresultnumber = incomeresultnumber;
    }

    /**
     * 获取充值时间
     *
     * @return RechargeTime - 充值时间
     */
    public String getRechargetime() {
        return rechargetime;
    }

    /**
     * 设置充值时间
     *
     * @param rechargetime 充值时间
     */
    public void setRechargetime(String rechargetime) {
        this.rechargetime = rechargetime;
    }
}