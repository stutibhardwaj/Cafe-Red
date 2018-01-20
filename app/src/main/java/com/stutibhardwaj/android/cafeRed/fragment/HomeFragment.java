package com.stutibhardwaj.android.cafeRed.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stutibhardwaj.android.cafeRed.R;
import com.stutibhardwaj.android.cafeRed.adapters.ListAdapter;
import com.stutibhardwaj.android.cafeRed.models.Menu;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;
    private List<Menu> menuItems = new ArrayList<>();




    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        mRecyclerView = (RecyclerView) root.findViewById(R.id.menu_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new ListAdapter(menuItems,getActivity().getApplicationContext());
        mRecyclerView.setAdapter(mAdapter);
        prepareData();

        return root;
    }

    public void prepareData()

    {
        Menu menu = new Menu("https://bloximages.chicago2.vip.townnews.com/journalstar.com/content/tncms/assets/v3/editorial/5/3d/53d243fb-dd2b-5b1b-96d7-36dc51590a06/5a036a3fb2c9e.image.jpg?resize=1200%2C821","Burger");
        menuItems.add(menu);
        menu = new Menu("https://media2.s-nbcnews.com/j/newscms/2017_10/1200234/10-healthy-fast-food-meals-008-subway-inline-today-170309_89a32509f1b93e969a831a913cc2a2d1.today-inline-large.jpg","Footlong");
        menuItems.add(menu);
        menu = new Menu("https://www.thelocal.it/userdata/images/article/69523836b0191608c41d640feead8da2be5462038d3409e1e3900fad039c7fc8.jpg","Spaghetti");
        menuItems.add(menu);
        menu = new Menu("https://i.ytimg.com/vi/mEBFswpYms4/maxresdefault.jpg","Tacos");
        menuItems.add(menu);
        menu = new Menu("https://los-angeles.eat24hours.com/files/cuisines/v4/thai.jpg","Spring Rolls");
        menuItems.add(menu);

        mAdapter.notifyDataSetChanged();

    }
}
