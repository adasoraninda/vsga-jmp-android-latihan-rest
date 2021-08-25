package com.vsgajmp.aplikasirestkaryawan.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.vsgajmp.aplikasirestkaryawan.R;
import com.vsgajmp.aplikasirestkaryawan.model.EmployeeItem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListAdapter extends BaseAdapter {

    private final List<EmployeeItem> listEmployee = new ArrayList<>();

    public void updateListEmployee(List<EmployeeItem> newListEmployee) {
        this.listEmployee.clear();
        this.listEmployee.addAll(newListEmployee);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return listEmployee.size();
    }

    @Override
    public Object getItem(int i) {
        return listEmployee.get(i);
    }

    @Override
    public long getItemId(int i) {
        return listEmployee.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_employee, viewGroup, false);
        }

        TextView textId = view.findViewById(R.id.text_id);
        TextView textName = view.findViewById(R.id.text_name);

        textId.setText(String.valueOf(listEmployee.get(i).getId()));
        textName.setText(listEmployee.get(i).getName());

        return view;
    }
}
