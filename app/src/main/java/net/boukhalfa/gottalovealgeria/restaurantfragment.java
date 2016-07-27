package net.boukhalfa.gottalovealgeria;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class restaurantfragment extends Fragment {

ListView RestoList;
    public restaurantfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_restaurantfragment, container, false);
        RestoList = (ListView) view.findViewById(R.id.RestoList);
        ArrayList<Hotel> taxi_data= new ArrayList<Hotel>();
        RestoData RestoInfo= new RestoData();
        for (int i =0;i<RestoInfo.getTotalRestoCount();i++){
            taxi_data.add(new Hotel(R.drawable.ic_pizza,RestoInfo.getRestoName(i).toUpperCase(),RestoInfo.getRestoPhone(i), RestoInfo.getRestoCity(i).toUpperCase()));
            HotelAdapter adapter = new HotelAdapter(getActivity(), R.layout.hotelrow,taxi_data);
            RestoList.setAdapter(adapter);



    }
        return view;
}

}
