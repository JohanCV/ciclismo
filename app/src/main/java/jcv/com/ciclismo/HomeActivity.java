package jcv.com.ciclismo;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemReselectedListener {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        loadFragment(new HomeFragment());

        findElements();
        events();
    }

    private void findElements() {
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

    }

    private void events() {
        bottomNavigationView.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) this);
    }

    @Override
    public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;

        switch (menuItem.getItemId()){
            case R.id.menu_inicio:
                Toast.makeText(HomeActivity.this, "Codigo de Home", Toast.LENGTH_SHORT).show();
                fragment = new HomeFragment();
                break;
            case R.id.menu_localizado:
                Toast.makeText(HomeActivity.this, "Codigo de localizado", Toast.LENGTH_SHORT).show();
                fragment = new RutasFragment();
                break;
            case R.id.menu_my_perfil:
                Toast.makeText(HomeActivity.this, "Codigo de My Perfil", Toast.LENGTH_SHORT).show();
                fragment = new PerfilFragment();
                break;
        }

        return loadFragment(fragment);
    }

    public boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }


}
