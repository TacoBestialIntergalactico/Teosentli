package MX.TeosentliTeam.teosentli.ui.config;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import java.util.Locale;

import MX.TeosentliTeam.teosentli.R;
import MX.TeosentliTeam.teosentli.databinding.FragmentSistemConfigBinding;

public class /*AQUI*/SistemConfigFragment extends Fragment {

    /*AQUI*/
    private FragmentSistemConfigBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        SistemConfigViewModel sistemConfigViewModel =
                new ViewModelProvider(this).get(/*AQUI*/SistemConfigViewModel.class);


        binding = FragmentSistemConfigBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Spinner languageSpinner = binding.languageSpinner;
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                requireContext(),
                R.array.language_options,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        languageSpinner.setAdapter(adapter);

        languageSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Obtén el idioma seleccionado del Spinner
                String selectedLanguage = parent.getItemAtPosition(position).toString();

                // Cambia el idioma de la aplicación
                if (selectedLanguage.equals("English")) {
                    setAppLocale("en"); // Cambia el idioma a inglés
                } else {
                    setAppLocale("es"); // Cambia el idioma a español (idioma por defecto)
                }

                // Actualiza las vistas del fragmento para reflejar el cambio de idioma
                updateViews();

                // No es necesario reiniciar la actividad completa
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // No se hace nada si no se selecciona ningún idioma
            }
        });
        return root;

    }

    private void setAppLocale(String languageCode) {
        Resources resources = getResources();
        Configuration configuration = resources.getConfiguration();
        Locale newLocale = new Locale(languageCode);
        configuration.setLocale(newLocale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    private void updateViews() {
        // Actualiza las vistas del fragmento según el idioma seleccionado
        // Por ejemplo, puedes actualizar los textos de los botones o etiquetas
        // con los recursos correspondientes en el nuevo idioma.
        // binding.textView.setText(R.string.some_text);
        // binding.button.setText(R.string.some_button_label);;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}