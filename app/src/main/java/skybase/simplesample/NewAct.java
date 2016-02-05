package skybase.simplesample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by DELL 5558 on 2/5/2016.
 */
public class NewAct extends Activity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.valu);
        t=(TextView)findViewById(R.id.yv);
        String data;
        data=getIntent().getStringExtra("sonam");
        t.setText(""+data);

    }
}
