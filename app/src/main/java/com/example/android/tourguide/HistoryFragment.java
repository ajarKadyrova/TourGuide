package com.example.android.tourguide;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class HistoryFragment extends Fragment {

    public HistoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Information> info = new ArrayList<Information>();
        info.add(new Information("Ala Too Square","Ala-Too Square is Kyrgyzstan’s main square," +
                " located in the center of Bishkek. Ala-Too in Kyrgyz means “great mountain”, symbolizing the mountainous" +
                " terrain and nature of the country. Ala-Too is a popular place for festivals, celebrations, and holidays. " +
                "Ala-Too is usually decorated with lights for Independence Day and New Years.",
                "24/7","Chuy Ave, Bishkek", R.drawable.square_ala_too));
        info.add(new Information("Opera and Balley Theater", "The venue hosts" +
                " local and international opera and ballet presentations as well as occasional classical concerts" +
                " and other musical and artistic events. There are permanent opera and ballet groups in the theatre, " +
                "and also established cooperation with the visiting teams. The season usually lasts from fall " +
                "to late spring, but there are performances at other times of the year.",
                "10.00am - 6.00pm", "167 Usup Abdrahmanov St, Bishkek",R.drawable.balley_theater));
        info.add(new Information("Bishkek Central Mosque", "The largest mosque in Central Asia" +
                " and Kyrgyzstan, one of the main attractions of Bishkek. Located in the area " +
                "of the former Issyk-Kul cinema east of the historic city center on Zhibek Zholu Avenue (Silk Road). " +
                "It opened on September 2, 2018.", "24/7", "53 Gogol St, Bishkek", R.drawable.central_mosque));
        info.add(new Information("Museum named after Mikhail Frunze", "The Museum of Mikhail Frunze " +
                "in Bishkek was founded by the Soviets as part of their tribute to Mikhail Frunze. The majority " +
                "of the museum – the top floor and the bottom floor – focus on the military and personal life " +
                "of Mikhail Frunze. However, the middle floor is a tribute to Kyrgyzstan’s accomplishments, " +
                "both before and after independence from the Soviet Union.", "9.30am - 5.30pm",
                "364 Frunze St, Bishkek",R.drawable.museum_frunze));
        info.add(new Information("National Museum of Fine Arts Named after Gapar Aitiev",
                "The Kyrgyz National Museum of Fine Arts named after Gapar Aitiev is the main " +
                        "artistic treasury of Kyrgyzstan. The Gallery, later renamed the Kyrgyz State Museum of Fine Arts," +
                        " was opened on January 1, 1935 and hosts several Soviet classics.", "10.00am - 6.00pm",
                "196 Usup Abdrahmanov St, Bishkek",R.drawable.museum_aitiev));
        info.add(new Information("Philarmonic Hall named after Toktogul Satylganov",
                "The snow-white building of the Kyrgyz National Philharmonic is located in the heart of Bishkek, " +
                        "on Prospect Chuy.The Kyrgyz National Philharmonic is named in honor of the composer " +
                        "and virtuoso musician Toktogul Satylganov. Toktogul was an akyn, an improviser and poet " +
                        "who set his words to music. He was one of the most influential figures in traditional Kyrgyz arts, " +
                        "and is considered one of the founders of modern Kyrgyz literature.","9.00am - 6.00pm",
                "253 Chuy Ave, Bishkek",R.drawable.philharmonic));
        info.add(new Information("Kozhomkul Sport Palace", "The Palace of Sports named " +
                "after Kozhomkul is considered an architectural monument of republican significance, as it is a " +
                "potential object of restoration of historical, scientific, architectural, artistic and memorial value. " +
                "The palace is of particular importance for the history and culture of the whole country.",
                "9.00am - 6.00pm", "40 Togolok Moldo St, Bishkek", R.drawable.sport_palace));
        info.add(new Information("Zoological Museum", "The Zoological Museum is a small " +
                "museum housed in the Science Academy, which is located in the center of the city. " +
                "There are reptiles, birds, mammals, and other animals native to Kyrgyzstan on display. " +
                "You can also see exotic species and even live reptiles here.", "9.00am - 5.00pm",
                "265 Chuy Ave, Bishkek",R.drawable.zoological_museum));

        InformationAdapter adapter = new InformationAdapter(getActivity(), info);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}