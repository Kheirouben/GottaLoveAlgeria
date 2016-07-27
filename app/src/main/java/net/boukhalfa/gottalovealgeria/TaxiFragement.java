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
public class TaxiFragement extends Fragment {

ListView taxiList;
    public TaxiFragement() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view=   inflater.inflate(R.layout.fragment_taxi_fragement, container, false);

        taxiList = (ListView) view.findViewById(R.id.taxilList);
        ArrayList<Hotel> taxi_data= new ArrayList<Hotel>();
        TaxiData TaxiInfo= new TaxiData();
        for (int i =0;i<TaxiInfo.getTotalTaxiCount();i++){
            taxi_data.add(new Hotel(R.drawable.ic_driver,TaxiInfo.getTaxiName(i),TaxiInfo.getTaxiPhone(i), TaxiInfo.getTaxICity(i).toUpperCase()));
            HotelAdapter adapter = new HotelAdapter(getActivity(), R.layout.hotelrow,taxi_data);
        taxiList.setAdapter(adapter);


    }
        return view;
}
}