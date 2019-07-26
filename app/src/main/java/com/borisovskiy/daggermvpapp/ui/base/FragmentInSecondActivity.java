package com.borisovskiy.daggermvpapp.ui.base;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.borisovskiy.daggermvpapp.R;
import com.borisovskiy.daggermvpapp.adapters.RecViewAdapter;
import com.borisovskiy.daggermvpapp.ui.Contract;
import com.borisovskiy.daggermvpapp.ui.Contract.IPresenter;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.support.AndroidSupportInjection;

public class FragmentInSecondActivity extends Fragment implements Contract.IView {

    private final RecViewAdapter recViewAdapter = new RecViewAdapter();
    @BindView(R.id.recview)
    RecyclerView recyclerView;
    @Inject
    IPresenter presenter;

    private Unbinder unbinder;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidSupportInjection.inject(this);
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
//        presenter = new Presenter(this, new Model());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sec_activity, container, false);
        unbinder = ButterKnife.bind(this, view);
        initialiseRecView();
        return view;
    }

    private void initialiseRecView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(recViewAdapter);
    }

    @Override
    public void onStart() {
        super.onStart();
        presenter.onAttachUI();
    }


    @Override
    public void setData(List<String> items) {
        recViewAdapter.setItems(items);
    }

    @Override
    public void onStop() {
        presenter.onDetachUI();
        super.onStop();

    }

    @Override
    public void onDestroyView() {
        unbinder.unbind();
        super.onDestroyView();
    }
}
