package co.edu.unab.acmemedical;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.DoctorViewHolder> implements View.OnClickListener {

    ArrayList<Doctor> doctors;
    OnItemClickListener onItemClickListener;

    public DoctorAdapter(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
        this.onItemClickListener = null;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public DoctorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doctor, parent, false);
        return new DoctorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DoctorViewHolder holder, int position) {
        holder.onBind(doctors.get(position));
    }

    @Override
    public int getItemCount() {
        return doctors.size();
    }

    @Override
    public void onClick(View view) {

    }

    public class DoctorViewHolder extends RecyclerView.ViewHolder {

        TextView tvnombre, tvespecialidad, tvdescripcion;

        public DoctorViewHolder(@NonNull View itemView) {
            super(itemView);

            tvnombre = itemView.findViewById(R.id.tv_nombre);
            tvespecialidad = itemView.findViewById(R.id.tv_especialidad);
            tvdescripcion = itemView.findViewById(R.id.tv_descripcion);

        }

        public void onBind(Doctor doctor){

            tvnombre.setText(doctor.getNombreDoc());
            tvespecialidad.setText(doctor.getEspecialidad());
            tvdescripcion.setText(doctor.getDetalle());

            if (onItemClickListener!=null){
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onItemClickListener.onItemClick(doctor, getAdapterPosition());
                    }
                });
            }
        }
    }

    public interface OnItemClickListener {
        void onItemClick(Doctor doctor, int posicion);
    }
}
