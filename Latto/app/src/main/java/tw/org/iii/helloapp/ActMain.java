package tw.org.iii.helloapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActMain extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmain);

        TextView lbl=(TextView)findViewById(R.id.lblHello);
        lbl.setText( (new CLotto()).GetNumber() );

    }
}
