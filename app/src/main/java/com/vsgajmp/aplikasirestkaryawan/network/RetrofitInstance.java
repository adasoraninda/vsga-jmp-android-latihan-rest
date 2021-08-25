package com.vsgajmp.aplikasirestkaryawan.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Digunakan untuk memanggial service pegawai
 *
 * @see EmployeeApi
 */
public class RetrofitInstance {

    private static Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl(EmployeeEndPoint.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static EmployeeApi getApi() {
        return retrofit().create(EmployeeApi.class);
    }

}
