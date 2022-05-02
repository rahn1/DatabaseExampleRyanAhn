package org.overlake.mat803.databaseexample;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.room.Room;

import org.overlake.mat803.databaseexample.database.SisDatabase;
import org.overlake.mat803.databaseexample.database.SisDatabaseDao;
import org.overlake.mat803.databaseexample.database.Student;
import org.overlake.mat803.databaseexample.databinding.FragmentAddStudentBinding;

public class StudentAddDialogFragment extends DialogFragment {
   @NonNull
   @Override
   public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

      FragmentAddStudentBinding binding = FragmentAddStudentBinding.inflate(getLayoutInflater());
      AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
      SisDatabase database = Room.databaseBuilder(getContext(),SisDatabase.class,"SISDatabase").allowMainThreadQueries().build();
      SisDatabaseDao dao = database.getDao();
      builder
              .setView(binding.getRoot())
              .setPositiveButton("Create", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialogInterface, int i) {
                     Student student = new Student(
                       Integer.valueOf(binding.studentId.getText().toString()),
                       binding.firstName.getText().toString(),
                       binding.secondName.getText().toString()
                     );

                     dao.addStudent(student);
                     Toast.makeText(getActivity(), "Student successfully added", Toast.LENGTH_SHORT).show();
                 }
              })
              .setNegativeButton("Cancel", null);
      return builder.create();
   }
}
