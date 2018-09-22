package login.com.girish.customlistdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class SecondActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    //Datasource
    private String[] proNameList = {"Lenevo","Dell","Mac"};
    private String[] proPriceList = {"30,000","34,000","90,000"};
    //We need images.....
    private Integer[] proImageList = {R.drawable.ic_action_simple,R.drawable.ic_action_simple,R.drawable.ic_action_mac};
    /////////////////////////////////////////
    private MyRecyclerAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new MyRecyclerAdapter(this,proNameList,proPriceList,proImageList);
        recyclerView.setAdapter(adapter);
    }
}
