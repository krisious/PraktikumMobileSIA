package com.example.myflexiblefragment;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OptionDialogFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OptionDialogFragment extends DialogFragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Button btnChoose, btnClose;
    private RadioGroup rgOptions;
    private RadioButton rbAwr, rbUnai, rbGeor, rbArteta;
    private OnOptionDialogListener onOptionDialogListener;

    public OptionDialogFragment() {
        // Required empty public constructor
    }

    public OnOptionDialogListener getOnOptionDialogListener() {
        return onOptionDialogListener;
    }

    public void setOnOptionDialogListener(OnOptionDialogListener onOptionDialogListener) {
        this.onOptionDialogListener = onOptionDialogListener;
    }


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OptionDialogFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OptionDialogFragment newInstance(String param1, String param2) {
        OptionDialogFragment fragment = new OptionDialogFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_option_dialog, container, false);
        btnChoose = (Button)view.findViewById(R.id.btn_choose);
        btnChoose.setOnClickListener(this);
        btnClose = (Button)view.findViewById(R.id.btn_close);
        btnClose.setOnClickListener(this);
        rgOptions = (RadioGroup)view.findViewById(R.id.rg_options);
        rbAwr = (RadioButton)view.findViewById(R.id.rb_awr);
        rbUnai = (RadioButton)view.findViewById(R.id.rb_unai);
        rbGeor = (RadioButton)view.findViewById(R.id.rb_geor);
        rbArteta = (RadioButton)view.findViewById(R.id.rb_arteta);
        return view;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_close) {
            getDialog().cancel();
        } else if (id == R.id.btn_choose) {
            int checkedRadioButtonId = rgOptions.getCheckedRadioButtonId();
            if (checkedRadioButtonId != -1) {
                String coach = null;
                if (checkedRadioButtonId == R.id.rb_awr) {
                    coach = rbAwr.getText().toString().trim();
                } else if (checkedRadioButtonId == R.id.rb_unai) {
                    coach = rbUnai.getText().toString().trim();
                } else if (checkedRadioButtonId == R.id.rb_geor) {
                    coach = rbGeor.getText().toString().trim();
                } else if (checkedRadioButtonId == R.id.rb_arteta) {
                    coach = rbArteta.getText().toString().trim();
                }
                getOnOptionDialogListener().onOptionChoosen(coach);
                getDialog().cancel();
            }
        }
    }

    public interface OnOptionDialogListener{
        void onOptionChoosen(String text);
    }
}