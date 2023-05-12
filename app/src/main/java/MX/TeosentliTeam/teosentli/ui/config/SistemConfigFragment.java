package MX.TeosentliTeam.teosentli.ui.config;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import MX.TeosentliTeam.teosentli.databinding.FragmentSistemConfigBinding;

public class /*AQUI*/SistemConfigFragment extends Fragment {

    /*AQUI*/
    private FragmentSistemConfigBinding binding;

    //Chequen bien los nombres de las cosas, cambien Prueba por el nombre de su pantalla
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*AQUI*/
        SistemConfigViewModel sistemConfigViewModel =
                new ViewModelProvider(this).get(/*AQUI*/SistemConfigViewModel.class);

        /*AQUI*/
        binding = FragmentSistemConfigBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        /*AQUI*/
        //final TextView textView = binding.textPrueba;

        /*AQUI*/
       // sistemConfigViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}