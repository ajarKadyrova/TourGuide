package com.example.android.tourguide;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Information> info = new ArrayList<Information>();
        info.add(new Information("Ala Archa National Park", "Ala Archa National Park " +
                "is located around the Ala-Archa river gorge in the Tian Shan mountains of Kyrgyzstan. " +
                "The park’s altitude ranges from 1,500 meters to 4,895 meters, making it a suitable " +
                "destination for both casual walkers and serious mountaineers. Situated only 40 km south of Bishkek.",
                "24/7", "Ala-Archa, Bishkek", R.drawable.ala_archa));
        info.add(new Information("Ata Turk Park", "The beloved city park from the " +
                "very beginning had a long and difficult to remember name: a culture and recreation park named " +
                "after the 50th anniversary of the USSR. It was laid in 1957-1958 as the arboretum of the " +
                "Botanical Garden of the Academy of Sciences of the Kyrgyz SSR.\nAbout 40 species of trees" +
                " (including 5 conifers) and 35 species of shrubs grow there. Among the deciduous trees " +
                "that make up the park are eastern biota, Scots pine, Bolle poplar and others.",
                "24/7", "133 Akhunbayev St, Bishkek", R.drawable.ataturk));
        info.add(new Information("Erkindik Boulevard", "Erkindik Boulevard (formerly " +
                "F.E Dzerzhinsky Boulevard, also Dzerzhinka Boulevard) is one of the most popular places in Bishkek. " +
                "This long and wide street densely planted with trees is loved by the townspeople for their peace," +
                " tranquility and fresh air.\n" + "The first planted trees on this street, which before the revolution" +
                " was called Boulevard, appeared in the 19th century. The street housed many important buildings for " +
                "the young city: a bookshop, a bank, an agricultural school, which can be seen to this day.",
                "24/7", "Erkindik Boulevard, Bishkek",R.drawable.erkindik));
        info.add(new Information("Park of Health", "Park \"Health\" with an area of " +
                "11 hectares is another favorite place of local residents.\n" + "The park is located on " +
                "Chingiz Aitmatov Avenue on the way to the Ala-Archa state residence. The brought exclusive" +
                " trees grow in it. Also in the park there is a lake where you can see ducks.",
                "24/7", "90 Mir Ave, Bishkek", R.drawable.health_park));
        info.add(new Information("Oak Park", "The Dubovyi (Oak) Park is the central " +
                "and the oldest park in Bishkek, with the ancient history, that was founded in 1890. " +
                "The first trees werе planted in thе аrea of 2.3 hectares by the students of thе agricultural" +
                " school directed by the plant scientist A Fetisov. In 2010 the oak park was renamed to the park " +
                "of Chinghiz Aitmatov. The oak park is conditionally divided into two parts: the first-garden part," +
                " for walking among the huge oaks, the second one is the cultural part, where the monuments, statues " +
                "and the historical building are allоcated. There are a lot of sightseeing such as fountain" +
                " called \"Twelve cups\", eleven-meter granite obelisk nearby the graves of Red Army men, " +
                "the avenue of Kyrgyz outstanding people and the open air Museum of sculptures.",
                "11.00am - 11.00pm", "42.877851, 74.607006", R.drawable.oak_park));
        info.add(new Information("Park named after Julius Fuchik", "The history of " +
                "the Julius Fucik Park dates back to 1935. The spark zone, territorially related to the" +
                " Leninsky district of the capital, spreads over seven hectares of land. This islet is " +
                "a recreation area where the townspeople loved and love to relax",
                "24/7", "Oak Park, Bishkek", R.drawable.park_fuchika));
        info.add(new Information("Victory Park named after Dair Asanov",  "Victory Park " +
                "named after Dair Asanov (also the South Gate Park) is a large and green park in the southern part" +
                " of the city, one of the most quiet and peaceful places in Bishkek.\n" + "Victory Park was founded" +
                " in 1981 and bears the name of the hero of the Great Patriotic War, artilleryman Dair Asanov. " +
                "The park is notable for its large territory - more than 35 hectares, planted with a large number " +
                "of trees: ash, poplar, spruce, pine, etc. The park has benches for rest, and a bike path is also laid.\n" +
                "There are several interesting sights in the park, the most important of which is a high monument" +
                " dedicated to the military glory of the heroes of Batken events\n" + "Also in the park is a linden " +
                "alley dedicated to the Kyrgyz border guards and the Ministry of Emergencies, as well as a monument " +
                "to the blockades of Leningrad.",
                "24/7", "32/4 Aaly Tokombaev St, Bishkek", R.drawable.victory_park));
        info.add(new Information("Victory Square", "Victory Square (is a public square " +
                "in the city of Bishkek, the capital of Kyrgyzstan. It is dedicated to the Victory in the " +
                "Victory over Nazi Germany. It was created in 1984, on the occasion of the 40th anniversary " +
                "of the Liberation of the USSR. The square features a statue of a woman, waiting for her husband" +
                " to return home from the war. The central area is filled with an eternal fire, The square is held" +
                " together by three ribs of red granite representing a yurt. A Guard of Honour company from the" +
                " National Guard of Kyrgyzstan guards the eternal flame, with the Changing of the Guard Ceremony " +
                "taking place every hour.",
                "24/7", "Victory Square, Bishkek",R.drawable.victory_square));

        InformationAdapter adapter = new InformationAdapter(getActivity(), info);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}