package com.android.educonnect;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SonsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SonsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SonsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SonsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SonsFragment newInstance(String param1, String param2) {
        SonsFragment fragment = new SonsFragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_sons, container, false);


        LinearLayout gradesCard, remarkCard, summonCard, absenceCard;

        gradesCard  = rootView.findViewById(R.id.grades_card);
        remarkCard  = rootView.findViewById(R.id.remark_card);
        summonCard  = rootView.findViewById(R.id.summon_card);
        absenceCard = rootView.findViewById(R.id.absence_card);

        gradesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), GradesActivity.class);
                startActivity(intent);
            }
        });

        remarkCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), RemarkActivity.class);
                startActivity(intent);
            }
        });

        summonCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), SummonActivity.class);
                startActivity(intent);
            }
        });

        absenceCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), AbsenceActivity.class);
                startActivity(intent);
            }
        });



        return rootView;
    }


}