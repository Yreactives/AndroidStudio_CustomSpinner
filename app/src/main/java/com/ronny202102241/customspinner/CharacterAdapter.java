package com.ronny202102241.customspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class CharacterAdapter extends BaseAdapter {
    private Context _context;
    private List<String> _characterlist;

    public CharacterAdapter(Context _context, List<String> _characterList){
        this._context = _context;
        this._characterlist = _characterList;
    }

    public int getCount(){
        if (_characterlist != null){
            return _characterlist.size();
        }
        else {
            return 0;
        }
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(_context);
        view = inflater.inflate(R.layout.spinner_a, null);
        TextView textView1 = (TextView) view.findViewById(R.id.textView1);
        String karakter = _characterlist.get(i);
        textView1.setText(karakter);

        ImageView imageView1 = (ImageView) view.findViewById(R.id.imageView1);
        switch(karakter){
            case "Albania":
                imageView1.setImageResource(R.drawable.albania);
                break;

            case "Belgia":
                imageView1.setImageResource(R.drawable.belgia);
                break;

            case "Hungary":
                imageView1.setImageResource(R.drawable.hungary);
                break;

            case "Iran":
                imageView1.setImageResource(R.drawable.iran);
                break;

            case "Slovenia":
                imageView1.setImageResource(R.drawable.slovenia);
                break;
        }
        return view;
    }
}
