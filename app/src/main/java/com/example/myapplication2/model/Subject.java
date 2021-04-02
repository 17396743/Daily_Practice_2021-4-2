package com.example.myapplication2.model;

import com.example.myapplication2.interfaces.IView;
import com.example.myapplication2.interfaces.data.ISubjectData;
import com.example.myapplication2.utils.SubjectRetrofitUtils;
import com.example.myapplication2.utils.interfaces.INetWorkCollBack;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.model
 * 文件名： Subject
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/2 8:58
 * 描述：TODO
 */
public class Subject implements IView.Icontent.ISubject {
    @Override
    public void setData(ISubjectData data, com.example.myapplication2.interfaces.INetWorkCollBack.Subject view) {
        SubjectRetrofitUtils.getInstance().getSubject(data.url(), data.app_channel(), data.terminal_model(), data.channel(), data._debug(), data.imei(), data.version(), data.mac(), data.androidId(), data.timestamp(), new INetWorkCollBack.Subject() {
            @Override
            public <B> void setSubject(B b) {
                view.setSubject(b);
            }

            @Override
            public void setError(String error) {
                view.setError(error);
            }
        });
    }
}
