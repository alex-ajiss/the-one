package com.example.lenovo.theone;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.ListViewCompat;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Talker> talkerList = new ArrayList<>();
    private DrawerLayout mDrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.talk);
        //toolbar设定
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //设置导航按钮
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_topmenu);
        }

        initTalkers();
        TalkerAdapter adapter = new TalkerAdapter(MainActivity.this, R.layout.talker_item, talkerList);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Talker talker = talkerList.get(position);
                Intent talkerIntent = new Intent(MainActivity.this,Chat.class);
                startActivity(talkerIntent);

            }
        });
        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab_add);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addIntent = new Intent(MainActivity.this,AddFriend.class);
                startActivity(addIntent);
            }
        });



    }
    //在导航栏添加导航图标
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==android.R.id.home){
            mDrawerLayout.openDrawer(GravityCompat.START);
        }
        return true;
    }
    private void initTalkers() {
        for (int i = 0; i<2 ; i++){
            Talker alex = new Talker("Alex",R.mipmap.a);
            talkerList.add(alex);
            Talker beck = new Talker("Beck",R.mipmap.b);
            talkerList.add(beck);
            Talker cady = new Talker("Cady",R.mipmap.c);
            talkerList.add(cady);
            Talker dahila = new Talker("Dahila",R.mipmap.d);
            talkerList.add(dahila);
            Talker earl = new Talker("Earl",R.mipmap.e);
            talkerList.add(earl);
            Talker faith = new Talker("Faith",R.mipmap.f);
            talkerList.add(faith);
            Talker gabriel = new Talker("Gabriel",R.mipmap.g);
            talkerList.add(gabriel);
            Talker hal = new Talker("Hal",R.mipmap.h);
            talkerList.add(hal);
            Talker ian = new Talker("Ian",R.mipmap.i);
            talkerList.add(ian);
            Talker jack = new Talker("Jack",R.mipmap.j);
            talkerList.add(jack);
            Talker kailey = new Talker("Kailey",R.mipmap.k);
            talkerList.add(kailey);
            Talker laRue = new Talker("LaRue",R.mipmap.l);
            talkerList.add(laRue);
            Talker mabel = new Talker("Mabel",R.mipmap.m);
            talkerList.add(mabel);
            Talker nada = new Talker("Nada",R.mipmap.n);
            talkerList.add(nada);
            Talker oafa = new Talker("Oafa",R.mipmap.o);
            talkerList.add(oafa);
            Talker pablo = new Talker("Pablo",R.mipmap.p);
            talkerList.add(pablo);
            Talker rachel = new Talker("Rachel",R.mipmap.r);
            talkerList.add(rachel);
            Talker sabina = new Talker("Sabina",R.mipmap.s);
            talkerList.add(sabina);
            Talker taban = new Talker("Taban",R.mipmap.t);
            talkerList.add(taban);
            Talker udell = new Talker("Udell",R.mipmap.u);
            talkerList.add(udell);
            Talker vail = new Talker("Vail",R.mipmap.v);
            talkerList.add(vail);
            Talker wade = new Talker("Wade",R.mipmap.w);
            talkerList.add(wade);
            Talker xenos = new Talker("Xenos",R.mipmap.x);
            talkerList.add(xenos);
            Talker yancy = new Talker("Yancy",R.mipmap.y);
            talkerList.add(yancy);
            Talker zachary = new Talker("Zachary",R.mipmap.z);
            talkerList.add(zachary);
    }
    }

}
