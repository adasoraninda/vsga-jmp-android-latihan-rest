package com.vsgajmp.aplikasirestkaryawan.ui;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.vsgajmp.aplikasirestkaryawan.R;
import com.vsgajmp.aplikasirestkaryawan.model.EmployeeItem;
import com.vsgajmp.aplikasirestkaryawan.model.ListResponse;
import com.vsgajmp.aplikasirestkaryawan.network.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @SuppressWarnings("FieldCanBeLocal")
    private ListView listEmployee;
    private EmployeeListAdapter employeeListAdapter;

    private TextView textError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listEmployee = findViewById(R.id.list_employee);
        textError = findViewById(R.id.text_error);

        employeeListAdapter = new EmployeeListAdapter();

        listEmployee.setAdapter(employeeListAdapter);

        listEmployee.setOnItemClickListener((adapterView, view, i, l) -> {
            EmployeeItem employeeItem = (EmployeeItem) adapterView.getItemAtPosition(i);

            // TODO: Buat class AddUpdateEmployeeActivity, kemudian buat navigasi disini
            Toast.makeText(this,
                    employeeItem.getName(),
                    Toast.LENGTH_SHORT).show();
        });

        RetrofitInstance.getApi().getAllEmployee()
                .enqueue(new Callback<ListResponse>() {
                    @Override
                    public void onResponse(@NonNull Call<ListResponse> call,
                                           @NonNull Response<ListResponse> response) {
                        if (response.isSuccessful()) {
                            if (response.code() == 200 && response.body() != null) {
                                employeeListAdapter.updateListEmployee(response.body().getResult());
                            }
                        }
                    }

                    @Override
                    public void onFailure(@NonNull Call<ListResponse> call,
                                          @NonNull Throwable t) {
                        Toast.makeText(MainActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        textError.setText(t.getLocalizedMessage());
                    }
                });

    }
}