package com.vsgajmp.aplikasirestkaryawan.network;

import com.vsgajmp.aplikasirestkaryawan.model.ListResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EmployeeApi {

    @GET(EmployeeEndPoint.URL_GET_ALL)
    Call<ListResponse> getAllEmployee();

    @GET(EmployeeEndPoint.URL_GET_EMP)
    Call<ListResponse> getEmployeeById(
            @Query("id") int id);

    // TODO: Tambahkan method lain (CREATE, UPDATE, DELETE)
}
