package com.hung.baitaplistview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MonAnAdapter(private var listMonAn: List<MonAN>): RecyclerView.Adapter<MonAnAdapter.MonAhHolder>(){
    class MonAhHolder(view: View):RecyclerView.ViewHolder(view) {
        lateinit var imganhMonAn: ImageView
        lateinit var tvDiaChi: TextView
        lateinit var tvThoiGianVaKhoangCach: TextView
        lateinit var tvLuotDanhGia: TextView
        lateinit var tvTenMonAn: TextView
        lateinit var tvMaGiamGiaMonAn: TextView
        lateinit var tvMaGianGiaKhoangCach: TextView
        init {
            imganhMonAn = view.findViewById(R.id.imgAnhMonAn)
            tvDiaChi= view.findViewById(R.id.tvTenCuaHang)
            tvThoiGianVaKhoangCach=view.findViewById(R.id.tvThoiGianVaKhoangCach)
            tvLuotDanhGia=view.findViewById(R.id.tvLuotDanhGia)
            tvTenMonAn=view.findViewById(R.id.tvTenMonAn)
            tvMaGiamGiaMonAn=view.findViewById(R.id.tvMaGiamGia)
            tvMaGianGiaKhoangCach=view.findViewById(R.id.tvMaGiamGiaKm)
        }
            }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonAhHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_do_an,parent,false)
        return MonAhHolder(view)
    }
    override fun onBindViewHolder(holder: MonAhHolder, position: Int) {
        holder.tvDiaChi.setText(listMonAn.get(position).diaChi)
        holder.tvLuotDanhGia.setText(listMonAn.get(position).luotDanhGia)
        holder.tvMaGiamGiaMonAn.setText(listMonAn.get(position).maGiamGiaMonAn)
        holder.tvMaGianGiaKhoangCach.setText(listMonAn.get(position).maGiamGiaKhoangCach)
        holder.tvTenMonAn.setText(listMonAn.get(position).tenMonAn)
        holder.tvThoiGianVaKhoangCach.setText(listMonAn.get(position).thoiGianVaKhoangCach)
        Glide.with(holder.itemView).load(listMonAn.get(position).anhMonAn).into(holder.imganhMonAn)
    }
    override fun getItemCount(): Int {
        return listMonAn.size
    }
}

