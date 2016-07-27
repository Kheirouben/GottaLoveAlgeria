package net.boukhalfa.gottalovealgeria;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends Fragment {
    ListView HotelList;
    EditText SearchET;
    HotelAdapter adapter;


    public HotelFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hotel, container, false);
        HotelList = (ListView) view.findViewById(R.id.HotelList);
        SearchET = (EditText) view.findViewById(R.id.SearchET);
         ArrayList<Hotel> hotel_data = new ArrayList<>();
        HotelData HotelsInfo = new HotelData();
        for (int i = 0; i < HotelsInfo.getTotalHotelCount(); i++) {
            hotel_data.add(new Hotel(R.drawable.ic_hotels, HotelsInfo.getHotelName(i).toUpperCase(), HotelsInfo.getHotelPhone(i), HotelsInfo.getHotelAdress(i).toUpperCase()));
        }

        adapter = new HotelAdapter(getActivity(), R.layout.hotelrow, hotel_data);

        HotelList.setAdapter(adapter);


        SearchET.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        return view;


    }


}
