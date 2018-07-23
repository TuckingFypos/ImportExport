package comtuckingfypos.httpsgithub.importexport;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.Toast;

import static android.R.attr.duration;

public class CarList extends AppCompatActivity {
    private CheckBox drivers2a1, drivers2a2, drivers2b1, drivers2b2;
    private CheckBox drivers3a1, drivers3a2, drivers3a3;
    private CheckBox drivers3b1, drivers3b2, drivers3b3;
    private CheckBox drivers3c1, drivers3c2, drivers3c3;
    private CheckBox drivers3d1, drivers3d2, drivers3d3;
    private CheckBox drivers4a1, drivers4a2, drivers4a3, drivers4a4;
    private CheckBox drivers4b1, drivers4b2, drivers4b3, drivers4b4;
    private CheckBox drivers4c1, drivers4c2, drivers4c3, drivers4c4;
    private CheckBox drivers4d1, drivers4d2, drivers4d3, drivers4d4;
    private CollapsingToolbarLayout collapsingToolbarLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drivers2a1 = (CheckBox) findViewById(R.id.checkbox_coquetteblackfin);
        drivers2a2 = (CheckBox) findViewById(R.id.checkbox_nightshade);

        drivers2b1 = (CheckBox) findViewById(R.id.checkbox_ztype);
        drivers2b2 = (CheckBox) findViewById(R.id.checkbox_valor);

        drivers3a1 = (CheckBox) findViewById(R.id.checkbox_feltzer);
        drivers3a2 = (CheckBox) findViewById(R.id.checkbox_811);
        drivers3a3 = (CheckBox) findViewById(R.id.checkbox_bestia);

        drivers3b1 = (CheckBox) findViewById(R.id.checkbox_sabre);
        drivers3b2 = (CheckBox) findViewById(R.id.checkbox_tampa);
        drivers3b3 = (CheckBox) findViewById(R.id.checkbox_mamba);

        drivers3c1 = (CheckBox) findViewById(R.id.checkbox_x80);
        drivers3c2 = (CheckBox) findViewById(R.id.checkbox_t20);
        drivers3c3 = (CheckBox) findViewById(R.id.checkbox_osiris);

        drivers3d1 = (CheckBox) findViewById(R.id.checkbox_coquetteclassic);
        drivers3d2 = (CheckBox) findViewById(R.id.checkbox_verlierer);
        drivers3d3 = (CheckBox) findViewById(R.id.checkbox_etr1);

        drivers4a1 = (CheckBox) findViewById(R.id.checkbox_alpha);
        drivers4a2 = (CheckBox) findViewById(R.id.checkbox_reaper);
        drivers4a3 = (CheckBox) findViewById(R.id.checkbox_massacro);
        drivers4a4 = (CheckBox) findViewById(R.id.checkbox_zentorno);

        drivers4b1 = (CheckBox) findViewById(R.id.checkbox_cheetah);
        drivers4b2 = (CheckBox) findViewById(R.id.checkbox_tyrus);
        drivers4b3 = (CheckBox) findViewById(R.id.checkbox_fmj);
        drivers4b4 = (CheckBox) findViewById(R.id.checkbox_entity);

        drivers4c1 = (CheckBox) findViewById(R.id.checkbox_banshee);
        drivers4c2 = (CheckBox) findViewById(R.id.checkbox_stirling);
        drivers4c3 = (CheckBox) findViewById(R.id.checkbox_seven70);
        drivers4c4 = (CheckBox) findViewById(R.id.checkbox_turismo);

        drivers4d1 = (CheckBox) findViewById(R.id.checkbox_omnis);
        drivers4d2 = (CheckBox) findViewById(R.id.checkbox_troposrallye);
        drivers4d3 = (CheckBox) findViewById(R.id.checkbox_jester);
        drivers4d4 = (CheckBox) findViewById(R.id.checkbox_sultanrs);

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);

        final AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.app_bar);

        collapsingToolbarLayout.setTitleEnabled(false);
        appBarLayout.addOnOffsetChangedListener(new AppBarStateChangeListener() {
            @Override
            public void onStateChanged(AppBarLayout appBarLayout, State state) {
                Log.d("STATE", state.name());
            }
        });


        Context context = getApplicationContext();
        CharSequence text = "Use the 'Collections' tab on your garage computer and check off cars you currently own. Sell anything not checked on this list!";
        int duration = Toast.LENGTH_LONG;
        final Toast toast = Toast.makeText(context, text, duration);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toast.show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_car_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
//TODO: remove below functions from onPause, add to onCreate with click listeners adding to SQLite DB
    @Override
    public void onPause() {
        super.onPause();
        save(drivers2a1.isChecked());
        save(drivers2a2.isChecked());
        save(drivers2b1.isChecked());
        save(drivers2b2.isChecked());
        save(drivers3a1.isChecked());
        save(drivers3a2.isChecked());
        save(drivers3a3.isChecked());
        save(drivers3b1.isChecked());
        save(drivers3b2.isChecked());
        save(drivers3b3.isChecked());
        save(drivers3c1.isChecked());
        save(drivers3c2.isChecked());
        save(drivers3c3.isChecked());
        save(drivers4a1.isChecked());
        save(drivers4a2.isChecked());
        save(drivers4a3.isChecked());
        save(drivers4a4.isChecked());
        save(drivers4b1.isChecked());
        save(drivers4b2.isChecked());
        save(drivers4b3.isChecked());
        save(drivers4b4.isChecked());
        save(drivers4c1.isChecked());
        save(drivers4c2.isChecked());
        save(drivers4c3.isChecked());
        save(drivers4c4.isChecked());
        save(drivers4d1.isChecked());
        save(drivers4d2.isChecked());
        save(drivers4d3.isChecked());
        save(drivers4d4.isChecked());
    }

    @Override
    public void onResume() {
        super.onResume();
        drivers2a1.setChecked(load());
        drivers2a2.setChecked(load());
        drivers2b1.setChecked(load());
        drivers2b2.setChecked(load());
        drivers3a1.setChecked(load());
        drivers3a2.setChecked(load());
        drivers3a3.setChecked(load());
        drivers3b1.setChecked(load());
        drivers3b2.setChecked(load());
        drivers3b3.setChecked(load());
        drivers3c1.setChecked(load());
        drivers3c2.setChecked(load());
        drivers3c3.setChecked(load());
        drivers4a1.setChecked(load());
        drivers4a2.setChecked(load());
        drivers4a3.setChecked(load());
        drivers4a4.setChecked(load());
        drivers4b1.setChecked(load());
        drivers4b2.setChecked(load());
        drivers4b3.setChecked(load());
        drivers4b4.setChecked(load());
        drivers4b1.setChecked(load());
        drivers4b2.setChecked(load());
        drivers4b3.setChecked(load());
        drivers4b4.setChecked(load());
        drivers4c1.setChecked(load());
        drivers4c2.setChecked(load());
        drivers4c3.setChecked(load());
        drivers4c4.setChecked(load());
        drivers4d1.setChecked(load());
        drivers4d2.setChecked(load());
        drivers4d3.setChecked(load());
        drivers4d4.setChecked(load());
    }

    private void save(final boolean isChecked) {
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("check", isChecked);
        editor.commit();
    }

    private boolean load() {
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean("check", false);
    }

}
