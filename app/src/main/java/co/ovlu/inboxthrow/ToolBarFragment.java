package co.ovlu.inboxthrow;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Spinner;


/**
 * A simple {@link android.app.Fragment} subclass.
 */


public class ToolBarFragment extends Fragment  implements View.OnClickListener{

    private Spinner s;
    private AppCompatActivity parentActivity;
    public ToolBarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tool_bar, container, false);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        parentActivity = (AppCompatActivity) getActivity();

        parentActivity.setSupportActionBar(toolbar);
        parentActivity.getSupportActionBar().setDisplayShowTitleEnabled(false);

        s = (Spinner) view.findViewById(R.id.spinner_nav);

        ImageButton button = (ImageButton) view.findViewById(R.id.imageButton);
        button.setOnClickListener(this);

        return view;

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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageButton:
                s.performClick();
                break;

        }


    }
}
