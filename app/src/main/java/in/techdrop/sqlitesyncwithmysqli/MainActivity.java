package in.techdrop.sqlitesyncwithmysqli;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    EditText firstname ,lastname , address , mobile ;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstname = (EditText) findViewById(R.id.firstname);
        lastname = (EditText) findViewById(R.id.lastname);
        address = (EditText) findViewById(R.id.address);
        mobile = (EditText) findViewById(R.id.mobile);

        btnSave = (Button) findViewById(R.id.save);

        btnSave.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Save();
            }
        });
    }

    private void Save()
    {
//        FirstName = firstname.getText().toString();
//        LastName = lastname.getText().toString();
//        Address = address.getText().toString();
//        Mobile = mobile.getText().toString();
    }


}
