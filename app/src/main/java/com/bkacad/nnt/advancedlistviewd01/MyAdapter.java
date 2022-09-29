package com.bkacad.nnt.advancedlistviewd01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    // Context
    private Context context;
    // Dữ liệu
    private List<ItemCity> dataSource;

    // Đưa ra phương thức khởi tạo

    public MyAdapter(Context context, List<ItemCity> dataSource) {
        this.context = context;
        this.dataSource = dataSource;
    }

    @Override
    public int getCount() {
        return dataSource.size();
    }

    @Override
    public Object getItem(int i) {
        return dataSource.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        // Phần quan trongl
        // ĐỊnh mnghĩa item view và bind id + xử lý sự kiện
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_weather, viewGroup, false);
        }
        // Bind id
        ImageView imgWeather = view.findViewById(R.id.imgItemWeather);
        TextView tvCity = view.findViewById(R.id.tvItemCity);
        TextView tvWeather = view.findViewById(R.id.tvItemWeather);
        TextView tvTemperature = view.findViewById(R.id.tvItemTemperature);

        // Đổ dữ liệu vào view
        ItemCity item = dataSource.get(i);
        tvCity.setText(item.getName());
        tvTemperature.setText("" + item.getTemperature());
        tvWeather.setText(item.getWeather());

        Glide.with(view).load(item.getImgWeatherURL()).into(imgWeather);
        return view;
    }
}
