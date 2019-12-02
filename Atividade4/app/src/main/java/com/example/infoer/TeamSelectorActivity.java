package com.example.infoer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;

import java.util.ArrayList;

import butterknife.BindView;
import utilities.maps.NameMap;
import utilities.maps.PicMap;

public class TeamSelectorActivity extends AppCompatActivity {

    private ArrayList<ArrayList<String>> mLogos = new ArrayList<>();
    private ArrayList<ArrayList<String>> mNomes = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> mIds = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_selector);
        Intent intent = getIntent();
        initTeamInfos();


    }

    private void initTeamInfos(){
        SparseArray<String> picMap = PicMap.setPicMapRef();
        SparseArray<String> nameMap = NameMap.setNameRef();

        teamInfoMaker(picMap.get(1768), picMap.get(1766), nameMap.get(1768),
                nameMap.get(1766), 1768, 1766);

        teamInfoMaker(picMap.get(1775), picMap.get(1777), nameMap.get(1775),
                nameMap.get(1777), 1775, 1777);

        teamInfoMaker(picMap.get(1770), picMap.get(1837), nameMap.get(1770),
                nameMap.get(1837), 1770, 1837);

        teamInfoMaker(picMap.get(1772), picMap.get(1779), nameMap.get(1772),
                nameMap.get(1779), 1772, 1779);

        teamInfoMaker(picMap.get(1771), picMap.get(4244), nameMap.get(1771),
                nameMap.get(4244), 1771, 4244);

        teamInfoMaker(picMap.get(1783), picMap.get(1765), nameMap.get(1783),
                nameMap.get(1765), 1783, 1765);

        teamInfoMaker(picMap.get(3984), picMap.get(4250), nameMap.get(3984),
                nameMap.get(4250), 3984, 4250);

        teamInfoMaker(picMap.get(1767), picMap.get(6684), nameMap.get(1767),
                nameMap.get(6684), 1767, 6684);

        teamInfoMaker(picMap.get(1769), picMap.get(6685), nameMap.get(1769),
                nameMap.get(6685), 1769, 6685);

        teamInfoMaker(picMap.get(1776), picMap.get(1780), nameMap.get(1776),
                nameMap.get(1780), 1776, 1780);

        initRecyclerView();
    }

    private void teamInfoMaker(String link1, String link2, String time1, String time2, int id1, int id2){
        ArrayList<String> RowImg = new ArrayList<>();
        ArrayList<String> RowTxt = new ArrayList<>();
        ArrayList<Integer> RowId = new ArrayList<>();

        RowImg.add(link1);
        RowImg.add(link2);

        RowTxt.add(time1);
        RowTxt.add(time2);

        RowId.add(id1);
        RowId.add(id2);

        mLogos.add(RowImg);
        mNomes.add(RowTxt);
        mIds.add(RowId);
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view_football);
        RecyclerViewAdapterTeams adapter = new RecyclerViewAdapterTeams(mLogos, mNomes, mIds, this, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag", "funcionou");
    }
}