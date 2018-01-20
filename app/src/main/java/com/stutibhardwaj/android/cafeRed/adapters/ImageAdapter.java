package com.stutibhardwaj.android.cafeRed.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.stutibhardwaj.android.cafeRed.R;

/**
 * Created by prithviraj on 19/01/18.
 */
public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    LayoutInflater inflater;

    public ImageAdapter(Context c) {
        mContext = c;
        this.inflater = (LayoutInflater.from(c));
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.grid_item, null);
        //TextView fruitName = (TextView) view.findViewById(R.id.fruitName);
        ImageView Image = (ImageView) convertView.findViewById(R.id.image);
        Image.setScaleType(ImageView.ScaleType.CENTER_CROP);
        //fruitName.setText(fruitNames[position]);
        Image.setImageResource(mThumbIds[position]);
        return convertView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7
    };
}
