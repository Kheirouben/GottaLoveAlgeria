package net.boukhalfa.gottalovealgeria;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Hamza on 20/07/2016.
 */
    public class MenuAdapter extends ArrayAdapter<Menu> {

        Context context;
        int layoutResourceId;
        Menu data[] = null;

        public MenuAdapter(Context context, int layoutResourceId, Menu[] data) {
            super(context, layoutResourceId, data);
            this.layoutResourceId = layoutResourceId;
            this.context = context;
            this.data = data;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = convertView;
            MenuHolder holder = null;

            if(row == null)
            {

                LayoutInflater inflater = ((Activity)context).getLayoutInflater();
                row = inflater.inflate(layoutResourceId, parent, false);

                holder = new MenuHolder();
                holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
                holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);
                holder.txtDesc = (TextView)row.findViewById(R.id.txtDesc);

                row.setTag(holder);
            }
            else
            {
                holder = (MenuHolder)row.getTag();
            }

            Menu menu = data[position];
            holder.txtTitle.setText(menu.title);
            holder.txtDesc.setText(menu.Desc);
            holder.imgIcon.setImageResource(menu.icon);

            return row;
        }



        static class MenuHolder
        {
            ImageView imgIcon;
            TextView txtTitle;
            TextView txtDesc;
        }
    }

