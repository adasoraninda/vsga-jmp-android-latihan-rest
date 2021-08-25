package com.vsgajmp.aplikasirestkaryawan.network;

public class EmployeeEndPoint {
    private static final String IP = ""; //TODO: isi dengan ip komputer masing2
    public static final String BASE_URL = "http://" + IP + "/pegawai/";
    public static final String URL_GET_ALL = BASE_URL + "tampilsemuapgw.php";
    public static final String URL_GET_EMP = BASE_URL + "tampilpgw.php";
    //TODO: Tambahin end point lain, sesuaikan dengan di aplikasi server (PHP)
}
