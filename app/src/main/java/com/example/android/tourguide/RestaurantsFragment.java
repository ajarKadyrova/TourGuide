package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Information> info = new ArrayList<Information>();
        info.add(new Information("Adriano Coffee", "Coffee Shop", "American, European",
                "8:00am - 12.00am", "171/1 Yunusaliev Ave, Bishkek",
                "(312)42-46-80", R.drawable.adriano));
        info.add(new Information("Barashek", "Restaurant", "Eastern, European, Kyrgyz",
                "10.00am - 11.00pm", "78б Aaly Tokombaev St, Bishkek",
                "(312)52-11-11", R.drawable.barashek));
        info.add(new Information("Bellagio Coffee", "Coffee Shop", "Italian",
                "8.00am - 1.00am", "Erkindik 9, cross. Bokonbaeva, Bishkek",
                "770-58-77-77", R.drawable.bellagio));
        info.add(new Information("Booblik", "Coffee Shop", "European",
                "8.00am - 12.00am", "103 Bokonbayev St, Bishkek",
                "500-78-87-88", R.drawable.bublik));
        info.add(new Information("Cooksoo", "Noodle House", "Korean",
                "11.00am - 10.00pm", "43 Baitik Baatyra St, Bishkek",
                "556-86-55-66", R.drawable.coksoo));
        info.add(new Information("Frunze", "Restaurant", "Asian, European, Japanese, Eastern",
                "10.00am - 11.00pm", "220a Abdumomunov St, Bishkek",
                "(312)66-44-66", R.drawable.frunze));
        info.add(new Information("Imperiya Pitsy", "Pizzeria", "European, Italian, Japanese",
                "24/7", "40 Samanchin St, Bishkek",
                "(312)51-07-07", R.drawable.imperiya_pizzy));
        info.add(new Information("KFC", "Fast Food", "American",
                "10.00am - 10.00pm", "90 Moskovskaya Street, Bishkek",
                "550-88-08-29", R.drawable.kfs));
        info.add(new Information("Navat", "Teahouse", "European, Kyrgyz, Eastern",
                "10.00am - 12.00am", "55 Baitik Baatyr St, Bishkek",
                "551-64-11-11", R.drawable.navat));
        info.add(new Information("Papa Johns", "Pizzeria", "American",
                "10.00am - 12.00am", "127 Chuy Ave, Bishkek",
                "(312)39-11-11", R.drawable.papa_johns));
        info.add(new Information("Pervyi Syrnyi", "Restaurant", "Italian, European, Pan-asian",
                "10.00am - 12.00am", "53 Akhunbayev St, Bishkek",
                "704-53-70-00", R.drawable.pervyi_syrnyi));
        info.add(new Information("Skyberry", "Coffee Shop", "European, Italian",
                "9.00am - 1.00am", "146 Toktogul Street, Bishkek",
                "772-00-03-89", R.drawable.skyberry));
        info.add(new Information("Social Coffee", "Coffee Shop", "European",
                "10.00am - 11.00am", "62 Razzakov St, Bishkek",
                "701-50-40-40", R.drawable.social_coffee));

        InformationAdapter adapter = new InformationAdapter(getActivity(), info);
        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}