package MX.TeosentliTeam.teosentli.ui.prueba;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

/*AQUI*/
import MX.TeosentliTeam.teosentli.databinding.FragmentPruebaBinding;

public class /*AQUI*/PruebaFragment extends Fragment {

    /*AQUI*/
    private FragmentPruebaBinding binding;

    //Chequen bien los nombres de las cosas, cambien Prueba por el nombre de su pantalla
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*AQUI*/PruebaViewModel pruebaViewModel =
                new ViewModelProvider(this).get(/*AQUI*/PruebaViewModel.class);

        /*AQUI*/
        binding = FragmentPruebaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        /*AQUI*/
        final TextView textView = binding.textPrueba;

        /*AQUI*/pruebaViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}