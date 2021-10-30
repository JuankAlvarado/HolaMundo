package mi.primera.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saludame (View v)
    {
        EditText nombreUsuario = findViewById(R.id.txtNombre);
        Toast.makeText(this, "Hola", Toast.LENGTH_LONG).show();
    }

}