package com.khusnia.facultyprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = FacAdapter(data, { onItem: FacData -> onItemClicked(onItem) })
    }
    private fun onItemClicked(onItem: FacData) {
        val showDetailActivityIntent = Intent(this, FacDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nameFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.descDet)
        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<FacData> {
        val rvList = ArrayList<FacData>()
        rvList.add(
            FacData(
                R.drawable.logo,
                "Fakultas Ilmu Komputer",
                "Fakultas Ilmu Komputer merupakan salah satu dari 7 fakultas di UPN Veteran Jawa Timur.\n" +
                        "Fakultas Ilmu Komputer terdiri dari program studi: ",
                "1. S1 Teknik Informatika\n" +
                        "2. S1 Sistem Informasi\n" +
                        "3. S1 Data Sains"
            )
        )
        rvList.add(
            FacData(
                R.drawable.logo,
                "Fakultas Teknik",
                "Fakultas Teknik merupakan salah satu dari 7 fakultas di UPN Veteran Jawa Timur.\n" +
                        "Fakultas Teknik terdiri dari program studi: ",
                "1. S1 Teknik Kimia\n" +
                        "2. S1 Teknik Industri\n" +
                        "3. S1 Teknik Sipil\n" +
                        "4. S1 Teknik Lingkungan\n" +
                        "5. S1 Teknologi Pangan\n" +
                        "6. S1 Teknik Mesin"
            )
        )
        rvList.add(
            FacData(
                R.drawable.logo,
                "Fakultas Ekonomi dan Bisnis",
                "Fakultas Ekonomi dan Bisnis merupakan salah satu dari 7 fakultas di UPN Veteran Jawa Timur.\n" +
                        "Fakultas Ekonomi dan Bisnis terdiri dari program studi: ",
                "1. S1 Ekonomi Pembangunan\n" +
                        "2. S1 Akuntansi\n" +
                        "3. S1 Manajemen"
            )
        )
        rvList.add(
            FacData(
                R.drawable.logo,
                "Fakultas Pertanian",
                "Fakultas Pertanian merupakan salah satu dari 7 fakultas di UPN Veteran Jawa Timur.\n" +
                        "Fakultas Pertanian terdiri dari program studi: ",
                "1. S1 Agroteknologi\n" +
                        "2. S1 Agribisnis"
            )
        )
        rvList.add(
            FacData(
                R.drawable.aku,
                "Profil Singkat \n" +
                        "Khusnia Nur Rachmah",
                "Nama:\n" +
                        "Khusnia Nur Rachmah\n" +
                        "Tempat Tanggal Lahir:\n" +
                        "Denpasar, 02 Juli 2000\n" +
                        "Alamat:\n" +
                        "Dukuh Gemol 1C-53 Wiyung, Surabaya\n" +
                        "Nomor HP:\n" +
                        "089687286950\n" +
                        "Email:\n" +
                        "khusnianur.07@gmail.com\n" +
                        "Github:\n" +
                        "https://github.com/khusnia\n",
                "Riwayat Pendidikan : \n" +
                        "\t\t 1. SDN BunulRejo 1 Malang \n" +
                        "\t\t 2. SDN Kedurus 2 Surabaya \n" +
                        "\t\t 3. SMPN 21 Surabaya \n" +
                        "\t\t 4. SMA Kartika Wijaya Surabaya \n\n" +
                        "Penghargaan : -"
            )
        )
        return rvList
    }
}
