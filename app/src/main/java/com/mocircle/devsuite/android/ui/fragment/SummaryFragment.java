package com.mocircle.devsuite.android.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mocircle.devsuite.android.MyApp;
import com.mocircle.devsuite.android.R;
import com.mocircle.devsuite.android.ui.fragment.base.BaseSecondaryFragment;
import com.mocircle.devsuite.android.ui.presenter.SummaryPresenter;
import com.mocircle.devsuite.android.ui.view.SummaryView;

public class SummaryFragment extends BaseSecondaryFragment<SummaryPresenter> implements SummaryView {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_summary, container, false);
        return view;
    }

    @Override
    protected void setupInjections() {
        MyApp.getApp().getUiComponent().inject(this);
    }

    @Override
    protected void setupToolbar(Toolbar toolbar) {
        super.setupToolbar(toolbar);
        getActivity().setTitle(R.string.summary_title);
    }

}
