package sg.edu.rp.c346.employeeinformation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16046469 on 17/7/2017.
 */

public class EmployeeAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Info> EmployeeList;

    public EmployeeAdapter(Context context, int resource,
                           ArrayList<Info> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        EmployeeList = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInfalter object
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI Elements and assign to variables
        TextView tvName = (TextView) rowView.findViewById(R.id.textViewName);
        TextView tvSalary = (TextView) rowView.findViewById(R.id.textViewSalary);
        TextView tvjob = (TextView) rowView.findViewById(R.id.textViewJob);

        // Obtain the to-do item based on the 'position'.
        Info currentItem = EmployeeList.get(position);

        String salary=(""+currentItem.getSalary());
        // Set the TextView to display corresponding information
        tvName.setText(currentItem.getName());
        tvSalary.setText(salary);
        tvjob.setText(currentItem.getJob());


        //return the View corresponding to the data at the specified position.
        return rowView;
    }
}
