package sg.edu.rp.c346.employeeinformation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvEList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvEList=(ListView)findViewById(R.id.listViewEmployeeInfo);

        ArrayList<Info> toDoList;
        EmployeeAdapter caToDo;

        //Creating instance of ArrayList to store the ListView item data
        toDoList = new ArrayList<Info>();
        //Creating instance of ArrayAdapter, binding it to ArrayList
        caToDo = new EmployeeAdapter(this, R.layout.row, toDoList);
        //Bind the CustomAdapter to ListView variable
        lvEList.setAdapter(caToDo);

        //Populate the Listview with data

        Info item1 = new Info("John","Software Technical Leader",3400.0); //Create a ToDoItem object named item1
        toDoList.add(item1);  //Add the ToDoItem object to the toDoList ArrayList

        Info item2 = new Info("May","Programmer",2200.0);
        toDoList.add(item2);

    }
}
