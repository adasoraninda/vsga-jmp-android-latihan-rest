package com.vsgajmp.aplikasirestkaryawan.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListResponse {

    @SerializedName("result")
    private List<EmployeeItem> result;

    public List<EmployeeItem> getResult() {
        return result;
    }

    public void setResult(List<EmployeeItem> result) {
        this.result = result;
    }
}
