package MX.TeosentliTeam.teosentli.ui.messages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import MX.TeosentliTeam.teosentli.databinding.FragmentMessageCarlosBinding;

public class /*AQUI*/MessageCarlosFragment extends Fragment {

    /*AQUI*/
    private FragmentMessageCarlosBinding binding;

    //Chequen bien los nombres de las cosas, cambien Prueba por el nombre de su pantalla
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*AQUI*/
        MessageCarlosViewModel messageCarlosViewModel =
                new ViewModelProvider(this).get(/*AQUI*/MessageCarlosViewModel.class);

        /*AQUI*/
        binding = FragmentMessageCarlosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        /*AQUI*/

        /*AQUI*/

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}