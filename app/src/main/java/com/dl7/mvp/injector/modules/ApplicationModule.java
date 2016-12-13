package com.dl7.mvp.injector.modules;

import android.content.Context;

import com.dl7.mvp.AndroidApplication;
import com.dl7.mvp.local.table.DaoSession;
import com.dl7.mvp.rxbus.RxBus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by long on 2016/8/19.
 * Application Module
 */
@Module
public class ApplicationModule {

    private final AndroidApplication mApplication;
    private final DaoSession mDaoSession;

    public ApplicationModule(AndroidApplication application, DaoSession daoSession) {
        mApplication = application;
        mDaoSession = daoSession;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    RxBus provideRxBus() {
        return new RxBus();
    }

    @Provides
    @Singleton
    DaoSession provideDaoSession() {
        return mDaoSession;
    }
}