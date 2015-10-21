package com.example.llw.demo_fargment2;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class NbkFragment extends Fragment {
    private Button nbkbutton;
    private Button nbkbutton1;
    private View v;


    public NbkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      /*  View view1 = inflater.inflate(R.layout.fragment_nbk, container, false);
        nbkbutton = (Button) view1.findViewById(R.id.button_1);
        nbkbutton1 = (Button) view1.findViewById(R.id.button_2);

      */

        return inflater.inflate(R.layout.fragment_nbk, container, false);
    }


}
