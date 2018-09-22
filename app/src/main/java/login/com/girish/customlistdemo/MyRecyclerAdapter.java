package login.com.girish.customlistdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {
    private Context context;
    private String[] proNameList;
    private String[] proPriceList;
    private Integer[] proImageList;
    private LayoutInflater inflater;

    public MyRecyclerAdapter(Context context, String[] proNameList, String[] proPriceList, Integer[] proImageList) {
        this.context = context;
        this.proNameList = proNameList;
        this.proPriceList = proPriceList;
        this.proImageList = proImageList;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View  view = inflater.inflate(R.layout.list_item,null);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyRecyclerAdapter.MyViewHolder myViewHolder, int position) {
        myViewHolder.imageView.setImageResource(proImageList[position]);
        myViewHolder.textViewPN.setText(proNameList[position]);
        myViewHolder.textViewPP.setText(proPriceList[position]);
        myViewHolder.buttonATC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, myViewHolder.textViewPN.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return proNameList.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        final TextView textViewPN;
        TextView textViewPP;
        Button buttonATC;
        public MyViewHolder(@NonNull View view) {
            super(view);
            imageView = (ImageView)view.findViewById(R.id.imageViewProduct);
            textViewPN = (TextView)view.findViewById(R.id.textViewPN);
            textViewPP = (TextView)view.findViewById(R.id.textViewPP);
            buttonATC = (Button)view.findViewById(R.id.buttonATC);
        }
    }
}
