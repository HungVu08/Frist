package com.hung.baitaplistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hung.baitaplistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var monAnAdapter: MonAnAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var listMonAn = mutableListOf<MonAN>()
        listMonAn.add(
            MonAN(
                "https://cdn.nguyenkimmall.com/images/companies/_1/tin-tuc/kinh-nghiem-meo-hay/n%E1%BA%A5u%20%C4%83n/hong-tra-sua-5.jpg.jpg))",
                "Tiger sugar Delivery Ham Nghi","20 phut * 1,4km","4,5 (1k+)","Tra Sua","BOSSQUAN25...","Giam 5kd phi giao hang"
            )
        )
        listMonAn.add(
            MonAN(
                "https://images.foody.vn/res/g78/771277/prof/s640x400/foody-upload-api-foody-mobile-foody-mobile-457-jpg-180823110320.jpg",
                "Royal Food - Do an va Tra Sua Dai Loan","20 phut * 1,4km","4,4 (51)","Tra Sua - Che - Trang mieng","Giam 50% ma ...","Giam 5kd phi giao hang"
            )
        )
        listMonAn.add(
            MonAN(
                "https://media.foody.vn/res/g70/699961/prof/s/foody-upload-api-foody-mobile-87dc1dd7-48c8-442f-8-200903152049.jpg",
                "Com Tho Anh Nguyen- Duong Khue","20 phut * 1,5km","4,5 (1k+)","Com","Giam 50% MIENPHI50...","Giam 5kd phi giao hang"
            )
        )
        listMonAn.add(
            MonAN(
                "https://statics.vinpearl.com/nem-nuong-nha-trang-5_1628756767.jpg",
                "Nem Nuong Nha Trang  - Tran Binh ","20 phut * 1,8km","4,7 (1k+)","Lau & Nuong- Quay","10000 phan an 0d","Mat Hang Giam Gia"
            )
        )
        listMonAn.add(
            MonAN(
                "https://tocotocotea.com/wp-content/uploads/2021/01/ezgif.com-gif-maker-10.jpg",
                "TocoToco - Ho Tung Mau ","20 phut * 1,km","4,5 (4k+)","Tra Sua","Giam 60% Nhap TOCO...","Mat Hang Giam Gia"
            )
        )
        monAnAdapter= MonAnAdapter(listMonAn)
        binding.rcvMonAn.adapter= monAnAdapter




    }
}