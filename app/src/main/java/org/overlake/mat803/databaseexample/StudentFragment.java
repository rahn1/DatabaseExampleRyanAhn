package org.overlake.mat803.databaseexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import org.overlake.mat803.databaseexample.databinding.FragmentStudentBinding;

public class StudentFragment extends Fragment {

    private FragmentStudentBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentStudentBinding.inflate(inflater, container, false);
//        for (int i = 0; i < 100; i++) {
//            TextView text = new TextView(getContext());
//            text.setText("Student " + i);
//            text.setHeight(500);
//            text.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Toast.makeText(getContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
//                }
//            });
//            binding.scroller.addView(text);
//        }

        binding.recycler.setAdapter(null);
        return binding.getRoot();

    }


}