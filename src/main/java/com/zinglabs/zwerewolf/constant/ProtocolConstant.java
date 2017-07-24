package com.zinglabs.zwerewolf.constant;

/**
 * author: vector.huang
 * date：2016/4/18 19:31
 */
public interface ProtocolConstant {

    short VERSION = 1; //版本号
    short RESERVED = 0;//保留字段

    /**
     * 用户服务
     */
    //服务号，表示消息服务
    short SID_USER = 1;

    //用户登录请求
    short CID_USER_LOGIN_REQ = 1;

    //用户登录响应
    short CID_USER_LOGIN_RESP = 2;

    //用户上线请求（登录app）
    short CID_USER_ONLINE_REQ = 3;

    ////用户上线响应（登录app）
    short CID_USER_ONLINE_RESP = 4;


    /**
     * 消息服务
     */
    //服务号，表示消息服务
    short SID_MSG = 2;

    //群聊文字消息请求
    short CID_MSG_TEXT_REQ = 1;

    //群聊文字消息响应
    short CID_MSG_TEXT_RESP = 2;

    //群聊语音消息请求
    short CID_MSG_VOICE_REQ = 3;

    //群聊语音中断请求
    short CID_MSG_VOICE_INTERRUPT_REQ = 4;

    //群聊语音结束请求
    short CID_MSG_VOICE_END_REQ = 5;

    //群聊语音响应
    short CID_MSG_VOICE_RESP = 6;

    //群聊语音结束响应
    short CID_MSG_VOICE_END_RESP = 7;

    /**
     *业务(business)服务
     */
    short SID_BNS=3;

    //创建房间请求
    short CID_BNS_CRE_ROOM_REQ=1;

    //创建房间响应
    short CID_BNS_CRE_ROOM_RESP=2;

    //随机进入房间请求
    short CID_BNS_ENTER_ROOM_REQ =3;

    //随机进入房间响应
    short CID_BNS_ENTER_ROOM_RESP =4;

    //搜索房间请求
    short CID_BNS_FIND_ROOM_REQ=5;

    //搜索房间响应
    short CID_BNS_FIND_ROOM_RESP=6;


    /**
     * 游戏流程服务
     */
    //服务号，表示游戏流程
    short SID_GAME = 4;

    //准备游戏
    short CID_GAME_READY_REQ=1;

    //准备游戏确认
    short CID_GAME_READY_RESP=2;

    //进入天黑（开始游戏）
    short CID_GAME_DARK=3;

    //天亮
    short CID_GAME_DAWN=4;

    //狼人杀人请求
    short CID_GAME_KILL_REQ=5;

    //狼人杀人响应
    short CID_GAME_KILL_RESP=6;

    //狼人杀人结果响应
    short CID_GAME_KILL_RES_RESP=7;

    //略


}