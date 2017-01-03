package com.project.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by lkimura on 03/01/17.
 */

public class FragmentFoo extends android.support.v4.app.Fragment{

    private Button btnSubmit;
    private TextView textView;
    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        return inflater.inflate(R.layout.fragment_foo, parent, false);
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        textView = (TextView) view.findViewById(R.id.textView);
        btnSubmit = (Button) view.findViewById(R.id.button);
        textView.setText("ola fragment!");

        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
    }
}
