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
import com.borisovskiy.daggermvpapp.adapters.RecViewAdapterIntegers;
import com.borisovskiy.daggermvpapp.ui.ContractIntegers;
import com.borisovskiy.daggermvpapp.ui.ContractIntegers.IPresenter;
import com.borisovskiy.daggermvpapp.ui.ModelIntegers;
import com.borisovskiy.daggermvpapp.ui.PresenterIntegers;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.support.AndroidSupportInjection;

public class FragmentIntegers extends Fragment implements ContractIntegers.IView {

    private final RecViewAdapterIntegers adapter = new RecViewAdapterIntegers();
    @BindView(R.id.recview_integers)
    RecyclerView recyclerView;
    @Inject
    IPresenter presenter;
    private Unbinder unbinder;

    public static FragmentIntegers newInstance() {
        return new FragmentIntegers();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidSupportInjection.inject(this);
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
//        presenter = new PresenterIntegers(this, new ModelIntegers());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_integers, container, false);
        unbinder = ButterKnife.bind(this, view);
        initialiseRecView();
        return view;
    }

    private void initialiseRecView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onStart() {
        super.onStart();
        presenter.onAttachUI();
    }

    @Override
    public void setData(List<Integer> items) {
        adapter.setItems(items);
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