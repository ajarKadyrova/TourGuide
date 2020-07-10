package com.example.android.tourguide;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class MallsFragment extends Fragment {

    public MallsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Information> info = new ArrayList<Information>();
        info.add(new Information("Asia Mall",  "3 floors","10.00am - 10.00pm",
                "3 Chingiz Aitmatov Ave", R.drawable.asiamall));
        info.add(new Information("Beta Stores", "4 floors","8.00am - 9.00pm",
                "177/2, Yunusaliev Ave, Bishkek",R.drawable.beta_stores));
        info.add(new Information("BishkekPark", "23 floors", "10.00am - 10.00pm",
                "148 Kiev St", R.drawable.bishkekpark));
        info.add(new Information("CosmoPark", "3 floors","10.00am - 1.00am",
                "40a Yunusaliev Ave, Bishkek", R.drawable.cosmopark));
        info.add(new Information("ZUM \"Aichurek\" ", "8 floors", "10.00am - 8.00pm",
                "155 Chui Ave, Bishkek", R.drawable.cum));
        info.add(new Information("Dordoi Plaza", "4 floors","10.00am - 10.00pm",
                "115 Sultan Ibraimov St, Bishkek", R.drawable.dordoiplaza));
        info.add(new Information("Eurasia", "5 floors", "10.00am - 9.00pm",
                "62 Kiev St, Bishkek", R.drawable.eurasia));
        info.add(new Information("TashRabat", "3 floors", "10.00am - 10.00pm",
                "1 Г, Gorky St, Bishkek", R.drawable.tashrabat));
        info.add(new Information("Vefa", "3 floors", "9.00am - 11.00pm",
                "27/1 Gorky St, Bishkek", R.drawable.vefa));
        info.add(new Information("Vesna",  "4 floors","9.00am - 8.00pm",
                "66 Kalyk Akiev St", R.drawable.vesna));

        InformationAdapter adapter = new InformationAdapter(getActivity(), info);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}