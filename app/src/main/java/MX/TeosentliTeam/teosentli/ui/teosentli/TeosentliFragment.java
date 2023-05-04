package MX.TeosentliTeam.teosentli.ui.teosentli;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import MX.TeosentliTeam.teosentli.databinding.FragmentTeosentliBinding;

public class TeosentliFragment extends Fragment {

    private FragmentTeosentliBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TeosentliViewModel teosentliViewModel =
                new ViewModelProvider(this).get(TeosentliViewModel.class);

        binding = FragmentTeosentliBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textTeosentli;
        teosentliViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}