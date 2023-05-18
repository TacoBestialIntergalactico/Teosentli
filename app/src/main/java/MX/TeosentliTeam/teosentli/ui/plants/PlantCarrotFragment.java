package MX.TeosentliTeam.teosentli.ui.plants;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import MX.TeosentliTeam.teosentli.databinding.FragmentPlantCarrotBinding;

public class PlantCarrotFragment extends Fragment {

    private FragmentPlantCarrotBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PlantCarrotViewModel plantsViewModel =
                new ViewModelProvider(this).get(PlantCarrotViewModel.class);

        binding = FragmentPlantCarrotBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}