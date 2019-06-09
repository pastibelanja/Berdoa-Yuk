package id.ngajiyuk.berdoayuk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailDoaActivity extends AppCompatActivity {

    private TextView tv_title,tv_doa,tv_latin,tv_terjemah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_doa);

        tv_title = (TextView)findViewById(R.id.text_title);
        tv_doa = (TextView)findViewById(R.id.text_arab);
        tv_latin = (TextView)findViewById(R.id.text_latin);
        tv_terjemah = (TextView)findViewById(R.id.text_terjemah);


        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Doa = intent.getExtras().getString("Doa");
        String Latin = intent.getExtras().getString("Latin");
        String Terjemah = intent.getExtras().getString("Terjemah");


        tv_title.setText(Title);
        tv_doa.setText(Doa);
        tv_latin.setText(Latin);
        tv_terjemah.setText(Terjemah);

    }
}
