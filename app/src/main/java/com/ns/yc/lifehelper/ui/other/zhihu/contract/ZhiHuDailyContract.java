package com.ns.yc.lifehelper.ui.other.zhihu.contract;


import com.ns.yc.lifehelper.base.mvp1.BasePresenter;
import com.ns.yc.lifehelper.base.mvp1.BaseView;
import com.ns.yc.lifehelper.ui.other.zhihu.model.bean.ZhiHuDailyListBean;
import com.ns.yc.lifehelper.ui.other.zhihu.model.bean.ZhiHuDailyBeforeListBean;

/**
 * ================================================
 * 作    者：杨充
 * 版    本：1.0
 * 创建日期：2017/11/29
 * 描    述：知乎日报模块        日报
 * 修订历史：
 * ================================================
 */
public interface ZhiHuDailyContract {


    //View(activity/fragment)继承，需要实现的方法
    interface View extends BaseView {
        void setView(ZhiHuDailyListBean zhiHuDailyBean);
        void setEmptyView();
        void setNetworkErrorView();
        void setErrorView();
        void doInterval(int i);
        void showMoreContent(String format, ZhiHuDailyBeforeListBean zhiHuDailyBeforeListBean);
    }


    //Presenter控制器
    interface Presenter extends BasePresenter {
        void getData();
        void insertReadToDB(int id);
        void stopInterval();
        void startInterval();
    }


}
