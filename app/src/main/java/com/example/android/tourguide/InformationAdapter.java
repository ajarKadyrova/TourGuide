package com.example.android.tourguide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.text.util.Linkify;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class InformationAdapter extends ArrayAdapter<Information> {

    private Context context;
    private static final String LOG_TAG = Adapter.class.getSimpleName();

    public InformationAdapter(Activity context, ArrayList<Information> words) {
        super(context, 0, words);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        final Information currentInfo = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.nameOfPlace);
        nameTextView.setText(currentInfo.getPlaceName());

        TextView informationTextView = (TextView) listItemView.findViewById(R.id.placeInformation);
        informationTextView.setText(currentInfo.getPlaceInformation());

        TextView cuisineTextView = (TextView) listItemView.findViewById(R.id.cuisines);
        cuisineTextView.setText(currentInfo.getCuisineTypes());
        if(currentInfo.hasCuisineTypes() == true){
            cuisineTextView.setVisibility(View.VISIBLE);
        }else {
            cuisineTextView.setVisibility(View.GONE);
        }

        TextView workTimeTextView = (TextView) listItemView.findViewById(R.id.workingTime);
        workTimeTextView.setText(currentInfo.getWorkingTime());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.placeAddress);
        addressTextView.setText(currentInfo.getAddress());
        SpannableString content = new SpannableString(currentInfo.getAddress());
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        addressTextView.setTextColor(context.getResources().getColor(R.color.colorAccent));
        addressTextView.setText(content);
        addressTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + currentInfo.getAddress());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                if (mapIntent.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(mapIntent);
                }
            }
        });

        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phoneNumber_textView);
        ImageView phoneImageView = (ImageView) listItemView.findViewById(R.id.phone_icon);
        if(currentInfo.hasPhoneNumber() == true){
            phoneTextView.setText(currentInfo.getTelephoneNumber());
            phoneTextView.setVisibility(View.VISIBLE);
            phoneImageView.setVisibility(View.VISIBLE);
            Linkify.addLinks(phoneTextView, Linkify.ALL);
        } else {
            phoneTextView.setVisibility(View.GONE);
            phoneImageView.setVisibility(View.GONE);
        }
        phoneTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + currentInfo.getTelephoneNumber()));
                context.startActivity(callIntent);
            }
        });

        ImageView pictureImageView = (ImageView) listItemView.findViewById(R.id.picture_place);
        Glide
                .with(getContext())
                .load(currentInfo.getPictureId())
                .into(pictureImageView);

        final LinearLayout expandLayout = (LinearLayout) listItemView.findViewById(R.id.container);
        final RelativeLayout cardView = (RelativeLayout) listItemView.findViewById(R.id.cardView);
        final Button arrowBtn = (Button) listItemView.findViewById(R.id.arrowBtn);
        arrowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(expandLayout.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expandLayout.setVisibility(View.VISIBLE);
                    arrowBtn.setBackgroundResource(R.drawable.arrow_up_icon);
                } else {
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expandLayout.setVisibility(View.GONE);
                    arrowBtn.setBackgroundResource(R.drawable.arrow_down_icon);
                }
            }
        });
        return listItemView;
    }
}
