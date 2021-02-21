package com.example.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Locale;

public class PlaceAdapter extends ArrayAdapter<Place> {

    private static final String LOG_TAG = PlaceAdapter.class.getSimpleName();

    private boolean visibility = true;

    public PlaceAdapter(Activity context, ArrayList<Place> placeAdapter) {
        super(context, 0, placeAdapter);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View itemListView = convertView;
        if (itemListView == null) {
            itemListView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false
            );
        }


        LinearLayout informationLinearLayout = (LinearLayout) itemListView.findViewById(R.id.infoLinearLayout);
        informationLinearLayout.setVisibility(View.GONE);

        itemListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (visibility) {
                    informationLinearLayout.setVisibility(View.VISIBLE);
                    visibility = false;
                } else {
                    informationLinearLayout.setVisibility(View.GONE);
                    visibility = true;
                }
            }
        });
        Place place = getItem(position);

        ImageView imageView = (ImageView) itemListView.findViewById(R.id.image_view);
        imageView.setImageResource(place.getImageId());

        TextView title = (TextView) itemListView.findViewById(R.id.title_text);
        title.setText(place.getTitle());

        TextView information = (TextView) itemListView.findViewById(R.id.information);
        information.setText(place.getInformation());

        TextView address = (TextView) itemListView.findViewById(R.id.address);
        address.setText(place.getAddress());

        SpannableString spannableString = new SpannableString("Location: " + place.getAddress());
        spannableString.setSpan(new UnderlineSpan(), 10, spannableString.length(), 0);
        address.setText(spannableString);

        address.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:" + place.getAddress() + "?20"));
                getContext().startActivity(mapIntent);
            }
        });

        TextView phone = (TextView) itemListView.findViewById(R.id.phone);
        phone.setText(place.getPhone());

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:" + place.getPhone());
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                getContext().startActivity(intent);
            }
        });

        return itemListView;
    }
}
