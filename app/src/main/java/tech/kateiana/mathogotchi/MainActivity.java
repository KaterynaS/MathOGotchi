package tech.kateiana.mathogotchi;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends ToolbarActivity {

    Button choosePuzzleButton;
    Button tamagotchiButton;

    Toolbar toolbarMain;
    AppState appState;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        appState = AppState.getInstance();

        setContentView(R.layout.activity_main);

        //toolbar
        toolbarMain = findViewById(R.id.toolbar_widget).findViewById(R.id.toolbar_widget);
        setSupportActionBar(toolbarMain);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        choosePuzzleButton = findViewById(R.id.choose_puzzle_button);
        tamagotchiButton = findViewById(R.id.tamagotchi_cave_button);
    }


    @Override
    public int getMenuResourceID() {
        return R.menu.menu_main;
    }



}
