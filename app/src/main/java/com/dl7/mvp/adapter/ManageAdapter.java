package com.dl7.mvp.adapter;

import android.content.Context;

import com.dl7.mvp.R;
import com.dl7.mvp.local.table.NewsTypeBean;
import com.dl7.recycler.adapter.BaseQuickAdapter;
import com.dl7.recycler.adapter.BaseViewHolder;

import java.util.List;

/**
 * Created by long on 2016/8/31.
 * 管理界面适配器
 */
public class ManageAdapter extends BaseQuickAdapter<NewsTypeBean> {

    public ManageAdapter(Context context) {
        super(context);
    }

    public ManageAdapter(Context context, List<NewsTypeBean> data) {
        super(context, data);
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.adapter_manage;
    }

    @Override
    protected void convert(BaseViewHolder holder, NewsTypeBean item) {
        holder.setText(R.id.tv_channel_name, item.getName());
    }
}