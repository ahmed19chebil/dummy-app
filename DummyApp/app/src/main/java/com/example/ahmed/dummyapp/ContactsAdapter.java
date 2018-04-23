package com.example.ahmed.dummyapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ahmed on 8/10/2017.
 */

public class ContactsAdapter extends ArrayAdapter<Contact> {

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.contact_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Contact currentContact = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.contact_name_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentContact.getName());





        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }

    /**
     * constructor
     * @param context
     * @param contact
     */

    public ContactsAdapter(Activity context, ArrayList<Contact> contact ) {
        super(context, 0 ,contact);


    }

}
