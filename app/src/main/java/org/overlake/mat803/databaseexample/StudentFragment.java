package org.overlake.mat803.databaseexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.room.Room;

import org.overlake.mat803.databaseexample.database.SisDatabase;
import org.overlake.mat803.databaseexample.database.SisDatabaseDao;
import org.overlake.mat803.databaseexample.databinding.FragmentStudentBinding;

public class StudentFragment extends Fragment {

    private FragmentStudentBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentStudentBinding.inflate(inflater, container, false);

        SisDatabase database = Room.databaseBuilder(getContext(),SisDatabase.class,"SISDatabase").allowMainThreadQueries().build();
        SisDatabaseDao dao = database.getDao();

        binding.recycler.setAdapter(new StudentAdapter(dao));

       // binding.recycler.notifyDataSetChanged();

        StudentAddDialogFragment addStudentFragment = new StudentAddDialogFragment();

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addStudentFragment.show(getParentFragmentManager(), null);
            }
        });

        return binding.getRoot();

    }


}