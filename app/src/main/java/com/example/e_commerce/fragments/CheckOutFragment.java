package com.example.e_commerce.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.e_commerce.R;
import com.kofigyan.stateprogressbar.StateProgressBar;
public class CheckOutFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_check_out, container, false);
        String[] descriptionData = {"Address", "Payment", "Summary"};
        StateProgressBar stateProgressBar = view.findViewById(R.id.your_state_progress_bar_id);
        stateProgressBar.setStateDescriptionData(descriptionData);
        stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.ONE);
        TextView tvnext=view.findViewById(R.id.tvnext);
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.containerCheckOut,new AddressFragment()).commit();
        tvnext.setText("NEXT");
        LinearLayout back=view.findViewById(R.id.backBtn);
        LinearLayout next = view.findViewById(R.id.nextBtn);
//        boolean[] isChecked = {false};
        int[] count ={1};
        next.setOnClickListener(v -> {
            if (count[0]==1){
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.containerCheckOut,new PaymentFragment()).commit();
                stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.TWO);
//              stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.THREE);
                tvnext.setText("NEXT");
                count[0]=2;
            }else if(count[0]==2) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.containerCheckOut,new SummaryFragment()).commit();
                stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.THREE);
                tvnext.setText("PAY");
                count[0]=3;
            }else if(count[0]==3){
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,new OrderAcceptedFragment()).commit();
                count[0]=1;
            }
        });
//        boolean[] isCheckedBack = {false};

        back.setOnClickListener(v -> {
               if (count[0]==3){
                   getActivity().getSupportFragmentManager().beginTransaction().remove(new SummaryFragment()).commit();
                   stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.TWO);
                   getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.containerCheckOut,new PaymentFragment()).commit();
                   tvnext.setText("NEXT");
                   count[0]=2;
               }else if(count[0]==2){
                   getActivity().getSupportFragmentManager().beginTransaction().remove(new PaymentFragment()).commit();
                   stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.ONE);
                   tvnext.setText("NEXT");
                   getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.containerCheckOut,new AddressFragment()).commit();
                   count[0]=1;
               }

        });

        return view;
    }
}