package app.owner.saloon.craftystudio.saloonowner;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import utils.FireBaseHandler;
import utils.Order;

/**
 * Created by Aisha on 6/16/2017.
 */

public class TabbedService extends Fragment {

    TextView mfragmentServiceName, mfragmentServicePrice ,mFragmentServiceTypeName;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tabbed_service, container, false);
        View tempView=rootView;

        mfragmentServiceName=(TextView) tempView.findViewById(R.id.fragment_service_name_textview);
        mfragmentServicePrice=(TextView) tempView.findViewById(R.id.fragment_service_price_textview);
        mFragmentServiceTypeName=(TextView) tempView.findViewById(R.id.fragment_service_serviceTypeName_textview);





        mfragmentServiceName.setText(mfragmentServiceName.getText().toString()+"  "+FullDetailActivity.SERVICE.getServiceName());
        mfragmentServicePrice.setText(mfragmentServicePrice.getText().toString()+"  "+FullDetailActivity.SERVICE.getServicePrice());
        mFragmentServiceTypeName.setText(mFragmentServiceTypeName.getText().toString()+"  "+FullDetailActivity.SERVICE.getServiceTypeName());


        return tempView;
    }
}
