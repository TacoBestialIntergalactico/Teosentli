package MX.TeosentliTeam.teosentli.ui.plants;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import MX.TeosentliTeam.teosentli.databinding.FragmentPlantAgaveBinding;

public class PlantAgaveFragment extends Fragment {

    private FragmentPlantAgaveBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PlantAgaveViewModel plantsViewModel =
                new ViewModelProvider(this).get(PlantAgaveViewModel.class);

        binding = FragmentPlantAgaveBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}