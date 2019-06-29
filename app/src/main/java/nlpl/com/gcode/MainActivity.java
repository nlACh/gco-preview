package nlpl.com.gcode;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private void loadFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        // In case of stacking the fragments on back of each other
        // fragmentTransaction.addToBackStack();
        fragmentTransaction.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar tb = findViewById(R.id.toolbar);
        setSupportActionBar(tb);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView nav_view = findViewById(R.id.navigationView);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, tb, R.string.open_nav_bar, R.string.close_nav_bar);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.s1:
                        Log.i("I", "Stuff1");
                        break;
                    case R.id.s2:
                        Log.i("I", "Stuff2");
                        break;
                    case R.id.s3:
                        Log.i("I", "Stuff3");
                        break;
                    case R.id.s4:
                        Log.i("I", "Stuff4");
                        break;
                }
                DrawerLayout d = findViewById(R.id.drawer_layout);
                d.closeDrawer(GravityCompat.START);
                return true;
            }
        });

        BottomNavigationView bnv = findViewById(R.id.bottom_nav);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.set1:
                        Log.i("Bottom_Nav", "Set1");
                        //loadFragment(new set1());
                        //figure out something now
                        break;

                    case R.id.set2:
                        Log.i("Bottom_Nav", "Set2");
                        //same here...
                        break;
                }
                return true;
            }
        });
    }
}
