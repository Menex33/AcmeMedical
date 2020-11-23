package co.edu.unab.acmemedical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvNombreUsuario;
    Button btMisCitas, btDoctores, btAlertas;
    RecyclerView rvDoctores;
    ArrayList<Doctor> doctors;
    DoctorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvDoctores = findViewById(R.id.rv_doctores);
        btMisCitas = findViewById(R.id.bt_citas);
        btDoctores = findViewById(R.id.bt_doctores);
        btAlertas = findViewById(R.id.bt_alertas);

        tvNombreUsuario = findViewById(R.id.tv_nombre_usuario);
        String nombre = getIntent().getStringExtra("nombre");
        tvNombreUsuario.setText(nombre);

        doctors = new ArrayList<>();

        cargarDoctores();

        adapter = new DoctorAdapter(doctors);

        rvDoctores.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        rvDoctores.setHasFixedSize(true);
        rvDoctores.setAdapter(adapter);

    }

    private void cargarDoctores() {

        Doctor dr1 = new Doctor("Cardiología",
                "Carlos Mendoza",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusantium dolorem");
        Doctor dr2 = new Doctor("Dermatología",
                "Alexandra Carrillo",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusantium dolorem");
        Doctor dr3 = new Doctor("Pediatría",
                "Angarita Jaimes",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusantium dolorem");
        Doctor dr4 = new Doctor("Neurología",
                "Arguello Espinoza",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusantium dolorem");
        Doctor dr5 = new Doctor("Reumatología",
                "Alberto Pacheco",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusantium dolorem");

        doctors.add(dr1);
        doctors.add(dr2);
        doctors.add(dr3);
        doctors.add(dr4);
        doctors.add(dr5);

    }
}