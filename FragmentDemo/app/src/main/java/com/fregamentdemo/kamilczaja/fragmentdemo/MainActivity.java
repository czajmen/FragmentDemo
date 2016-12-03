package com.fregamentdemo.kamilczaja.fragmentdemo;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    android.app.FragmentManager manager ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//////////////////////
//        FragmentA hello = new FragmentA();
         manager = getFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        transaction.add(R.id.container, hello , "helloFragment");
//
//        transaction.commit();
//dodanie framgnetu   | onAttach -> onCreate -> onCreateView -> onActivityCreated -> onStart (pojawia sie fragment)-> onResume -> Running ->onPause -> onStop-> onDestroyView -> onDestroy -> onDetach
    }

    public void addFragmentA(View view) {
        FragmentA fraga = new FragmentA();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, fraga , "FragA");
        transaction.commit();
    }

    public void remFragmentA(View view) {

      FragmentA frag = (FragmentA)  manager.findFragmentByTag("FragA");
        FragmentTransaction transaction = manager.beginTransaction();
        if(frag!=null)
        {
            transaction.remove(frag);
            transaction.commit();
        }
    }

    public void addFragmentB(View view) {
        FragmentB fragb = new FragmentB();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, fragb , "FragB");
        transaction.commit();
    }

    public void remFragmentB(View view) {

        FragmentB frag = (FragmentB)  manager.findFragmentByTag("FragB");
        FragmentTransaction transaction = manager.beginTransaction();
        if(frag!=null)
        {
            transaction.remove(frag);
            transaction.commit();
        }

    }
}
