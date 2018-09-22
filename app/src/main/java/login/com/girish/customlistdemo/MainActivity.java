package login.com.girish.customlistdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    //Datasource
    private String[] proNameList = {"Lenevo","Dell","Mac"};
    private String[] proPriceList = {"30,000","34,000","90,000"};
    //We need images.....
    private Integer[] proImageList = {R.drawable.ic_action_simple,R.drawable.ic_action_simple,R.drawable.ic_action_mac};
    /////////////////////////////////////////
    private MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        adapter = new MyAdapter(this,proNameList,proPriceList,proImageList);//3 arguments,  context, Res, datasource...
        listView.setAdapter(adapter);


    }
}
