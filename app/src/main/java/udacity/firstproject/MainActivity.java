package udacity.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn1,btn2,btn3,btn4,btn5,btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn_1);
        btn2=(Button)findViewById(R.id.btn_2);
        btn3=(Button)findViewById(R.id.btn_3);
        btn4=(Button)findViewById(R.id.btn_4);
        btn5=(Button)findViewById(R.id.btn_5);
        btn6=(Button)findViewById(R.id.btn_6);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_1:
                Toast.makeText(this,"This button will launch my popular movies app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_2:
                Toast.makeText(this,"This button will launch my stock hawk app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_3:
                Toast.makeText(this,"This button will launch my build it bigger app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_4:
                Toast.makeText(this,"This button will launch my make your app material app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_5:
                Toast.makeText(this,"This button will launch my go ubiquitous app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_6:
                Toast.makeText(this,"This button will launch my capstone app!",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
