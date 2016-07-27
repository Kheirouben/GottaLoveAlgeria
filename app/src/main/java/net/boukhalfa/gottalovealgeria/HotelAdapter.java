package net.boukhalfa.gottalovealgeria;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hamza on 22/07/2016.
 */
public class HotelAdapter extends ArrayAdapter<Hotel> {
    Context context;
    int layoutResourceId;
    ArrayList<Hotel> data =  null;

    public HotelAdapter(Context context, int layoutResourceId, ArrayList<Hotel> data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        HotelHolder HotelListholder = null;

        if(row == null)
        {

            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            HotelListholder = new HotelHolder();
            HotelListholder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
            HotelListholder.txtHotelTitle = (TextView)row.findViewById(R.id.txtHotelTitle);
            HotelListholder.txthotelphone = (TextView)row.findViewById(R.id.txthotelphone);
            HotelListholder.txtHotelAdress = (TextView)row.findViewById(R.id.txtHotelAddress);
            HotelListholder.callicon= (ImageButton)row.findViewById(R.id.callicon);
            row.setTag(HotelListholder);
        }
        else
        {
            HotelListholder = (HotelHolder)row.getTag();
        }

        final Hotel hotel = data.get(position);
        HotelListholder.imgIcon.setImageResource(hotel.icon);
        HotelListholder.txtHotelTitle.setText(hotel.HotelTitle);
        HotelListholder.txthotelphone.setText(hotel.HotelPhone);
        HotelListholder.txtHotelAdress.setText(hotel.HotelAdress);


        HotelListholder.callicon.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        String phone = hotel.getHotelPhone().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
       // Toast.makeText(getContext(), "Calling :" + hotel.getHotelPhone(), Toast.LENGTH_SHORT).show();

    }
});
        return row;
    }




    static class HotelHolder
    {
        ImageView imgIcon;
      TextView txtHotelTitle;
        TextView txthotelphone;
        TextView txtHotelAdress;
        ImageButton callicon;


    }


}


