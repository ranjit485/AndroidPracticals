package com.example.practicalmad;

import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class table extends MainActivity {
    table() {
        TableLayout table = findViewById(R.id.table);

        String[][] students = {
                {"Ranjit", "21", "1"}, {"Raj", "21", "2"},
                {"Bhaskar", "21", "3"}, {"Jahir", "21", "4"},
                {"Shreedhar", "18", "5"}, {"Vivek", "21", "6"},
                {"Sapna", "19", "7"}, {"Samrudhi", "21", "8"},
                {"Rohan", "18", "9"}, {"Shreya", "21", "10"}
        };

        for (String[] data : students) {
            TableRow rows = new TableRow(this);
            rows.setLayoutParams(new TableLayout.LayoutParams(
                    TableLayout.LayoutParams.MATCH_PARENT,
                    TableLayout.LayoutParams.WRAP_CONTENT
            ));

            for (String x : data) {
                TextView tv = new TextView(this);
                tv.setText(x);
                tv.setPadding(10, 10, 10, 10);
                rows.addView(tv);

            }
            table.addView(rows);
        }
    }
}
