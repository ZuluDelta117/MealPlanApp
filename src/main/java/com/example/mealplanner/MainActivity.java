package com.example.mealplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class MainActivity extends AppCompatActivity {

    // Call each data type from app screen widgets
    private EditText startDate;
    private EditText endDate;
    private EditText mondayMeal;
    private EditText tuesdayMeal;
    private EditText wednesdayMeal;
    private EditText thursdayMeal;
    private EditText fridayMeal;
    private EditText saturdayMeal;
    private EditText sundayMeal;
    private Button saveButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare my dates as callable variables
        startDate = (EditText) findViewById(R.id.start_date);
        endDate = (EditText) findViewById(R.id.end_date);

        // Declare my meals as callable variables
        mondayMeal = (EditText) findViewById(R.id.monday_meal);
        tuesdayMeal = (EditText) findViewById(R.id.tuesday_meal);
        wednesdayMeal = (EditText) findViewById(R.id.wednesday_meal);
        thursdayMeal = (EditText) findViewById(R.id.thursday_meal);
        fridayMeal = (EditText) findViewById(R.id.friday_meal);
        saturdayMeal = (EditText) findViewById(R.id.saturday_meal);
        sundayMeal = (EditText) findViewById(R.id.sunday_meal);

        // Declare save button as a callable variable
        saveButton = (Button) findViewById(R.id.save_button);


        // When pressing the save button save input into a text file
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            // Call createFile method when save button is pressed
            public void onClick(View view) {
                createFile();
            }

            // Method to create text file and save user input
            public void createFile() {
                try {
                    // Save information in the document folder
                    File root = new File(Environment.getExternalStorageDirectory(), "Documents");
                    if (!root.exists()) {
                        root.mkdirs();
                    }
                    // Name text file as "meal_plan start_date-end_date.txt"
                    File filePath = new File(root, "meal_plan " + startDate.getText().toString()
                            + "-" + endDate.getText().toString() + ".txt");
                    // Open file for writing to
                    FileWriter writer = new FileWriter(filePath);

                    // Add to meal plan
                    writer.append(startDate.getText().toString() + " - " + endDate.getText().toString() + "\n");
                    writer.append("Monday: " + mondayMeal.getText().toString() + "\n");
                    writer.append("Tuesday: " + tuesdayMeal.getText().toString() + "\n");
                    writer.append("Wednesday: " + wednesdayMeal.getText().toString() + "\n");
                    writer.append("Thursday: " + thursdayMeal.getText().toString() + "\n");
                    writer.append("Friday: " + fridayMeal.getText().toString() + "\n");
                    writer.append("Saturday: " + saturdayMeal.getText().toString() + "\n");
                    writer.append("Sunday: " + sundayMeal.getText().toString() + "\n");

                    // Close file
                    writer.flush();
                    writer.close();

                    // If there is an error throw error code
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
