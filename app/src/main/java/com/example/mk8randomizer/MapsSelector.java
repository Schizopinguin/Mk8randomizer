package com.example.mk8randomizer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

import com.example.mk8randomizer.maps.Cup;
import com.example.mk8randomizer.maps.Cups;

import java.util.HashMap;

public class MapsSelector extends AppCompatActivity {

    private Cups cups = new Cups();
    private final HashMap<Integer, ImageView> imageViewHashMap = new HashMap<>();
    private ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17, imageView18, imageView19, imageView20, imageView21, imageView22, imageView23, imageView24;
    private Switch switchMultiSelect, switchClassic, switchRetros, switchDLC, switchPass;
    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_selector);
        View decorView = getWindow().getDecorView();
// Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
// Remember that you should never show the action bar if the
// status bar is hidden, so hide that too if necessary.
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        initializeItems();

        for (int i = 0; i < imageViewHashMap.size(); i++) {
            int finalI = i;
            imageViewHashMap.get(i).setOnClickListener(new View.OnClickListener() {
                                                           @Override
                                                           public void onClick(View v) {
                                                               if (cups.getCups().get(finalI).getSelected() == true) {
                                                                   cups.getCups().get(finalI).setSelected(false);
                                                                   System.out.println("Cup " + cups.getCups().get(finalI).getName() + " is now unselected");
                                                                   imageViewHashMap.get(finalI).setColorFilter(0x99999999, PorterDuff.Mode.MULTIPLY);
                                                               } else {
                                                                   cups.getCups().get(finalI).setSelected(true);
                                                                   imageViewHashMap.get(finalI).setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
                                                               }
                                                               if (finalI<4) {
                                                                   switchClassic.setChecked(false);
                                                               }
                                                               if (finalI<8 && finalI>=4) {
                                                                   switchRetros.setChecked(false);
                                                               }
                                                               if (finalI<12 && finalI>=8) {
                                                                   switchDLC.setChecked(false);
                                                               }
                                                               if (finalI>=12) {
                                                                   switchPass.setChecked(false);
                                                               }
                                                           }

                                                       }
            );
        }
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                //intent.putExtra("cups", cups);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
                                      }
        );

        switchMultiSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switchMultiSelect.isChecked()) {
                    cups.setMultiSelect(true);
                }
                else {
                    cups.setMultiSelect(false);
                }
            }
        });
        switchClassic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switchClassic.isChecked()) {
                    for (int i = 0; i < 4; i++) {
                        cups.getCups().get(i).setSelected(true);
                        imageViewHashMap.get(i).setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
                    }
                }
            }
        });
        switchRetros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switchRetros.isChecked()) {
                    for (int i = 4; i < 8; i++) {
                        cups.getCups().get(i).setSelected(true);
                        imageViewHashMap.get(i).setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
                    }
                }
            }
        });
        switchDLC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switchDLC.isChecked()) {
                    for (int i = 8; i < 12; i++) {
                        cups.getCups().get(i).setSelected(true);
                        imageViewHashMap.get(i).setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
                    }
                }
            }
        });
        switchPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switchPass.isChecked()) {
                    for (int i = 12; i < 14; i++) {
                        cups.getCups().get(i).setSelected(true);
                        imageViewHashMap.get(i).setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
                    }
                }
            }
        });
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void initializeItems() {
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);
        imageView14 = findViewById(R.id.imageView14);
        imageView15 = findViewById(R.id.imageView15);
        imageView16 = findViewById(R.id.imageView16);
        imageView17 = findViewById(R.id.imageView17);
        imageView18 = findViewById(R.id.imageView18);
        imageView19 = findViewById(R.id.imageView19);
        imageView20 = findViewById(R.id.imageView20);
        imageView21 = findViewById(R.id.imageView21);
        imageView22 = findViewById(R.id.imageView22);
        imageView23 = findViewById(R.id.imageView23);
        imageView24 = findViewById(R.id.imageView24);
        imageViewHashMap.put(0, imageView1);
        imageViewHashMap.put(1, imageView2);
        imageViewHashMap.put(2, imageView3);
        imageViewHashMap.put(3, imageView4);
        imageViewHashMap.put(4, imageView5);
        imageViewHashMap.put(5, imageView6);
        imageViewHashMap.put(6, imageView7);
        imageViewHashMap.put(7, imageView8);
        imageViewHashMap.put(8, imageView9);
        imageViewHashMap.put(9, imageView10);
        imageViewHashMap.put(10, imageView11);
        imageViewHashMap.put(11, imageView12);
        imageViewHashMap.put(12, imageView13);
        imageViewHashMap.put(13, imageView14);
        imageViewHashMap.put(14, imageView15);
        imageViewHashMap.put(15, imageView16);
        imageViewHashMap.put(16, imageView17);
        imageViewHashMap.put(17, imageView18);
        imageViewHashMap.put(18, imageView19);
        imageViewHashMap.put(19, imageView20);
        imageViewHashMap.put(20, imageView21);
        imageViewHashMap.put(21, imageView22);
        imageViewHashMap.put(22, imageView23);
        imageViewHashMap.put(23, imageView24);

        switchClassic = findViewById(R.id.switchClassic);
        switchRetros = findViewById(R.id.switchRetros);
        switchDLC = findViewById(R.id.switchDLC);
        switchPass = findViewById(R.id.switchPass);
        switchMultiSelect = findViewById(R.id.switchMultiSelect);
        buttonNext = findViewById(R.id.buttonNext);
    }
}