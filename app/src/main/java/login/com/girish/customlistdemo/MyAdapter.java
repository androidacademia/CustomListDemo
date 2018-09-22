package login.com.girish.customlistdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private String[] proNameList;
    private String[] proPriceList;
    private Integer[] proImageList;
    private LayoutInflater inflater;

    public MyAdapter(Context context, String[] proNameList, String[] proPriceList, Integer[] proImageList) {
        this.context = context;
        this.proNameList = proNameList;
        this.proPriceList = proPriceList;
        this.proImageList = proImageList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return proNameList.length;
    }

    @Override
    public Object getItem(int position) {
        return proNameList[position];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if(view == null){
            view = inflater.inflate(R.layout.list_item,null);
        }




        ImageView imageView = (ImageView)view.findViewById(R.id.imageViewProduct);
        final TextView textViewPN = (TextView)view.findViewById(R.id.textViewPN);
        TextView textViewPP = (TextView)view.findViewById(R.id.textViewPP);
        Button buttonATC = (Button)view.findViewById(R.id.buttonATC);
        imageView.setImageResource(proImageList[position]);
        textViewPN.setText(proNameList[position]);
        textViewPP.setText(proPriceList[position]);

        buttonATC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //you can appply
                Toast.makeText(context, textViewPN.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}















