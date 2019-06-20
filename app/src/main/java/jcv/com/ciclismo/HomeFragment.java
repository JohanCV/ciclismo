package jcv.com.ciclismo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vistafragment = inflater.inflate(R.layout.home_fragment,null);

        //recyclerView = vistafragment.findViewById(R.id.rv_publicaciones);
        //recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        //llenarListaBaseDatos();
        //publicacionAdaptador = new PublicacionAdaptador(getContext(),listPublish);
        //recyclerView.setAdapter(publicacionAdaptador);

        //floatingActionButton = vistafragment.findViewById(R.id.floatingActionButtonPublicar);

        //events();

        return vistafragment;
    }
}
