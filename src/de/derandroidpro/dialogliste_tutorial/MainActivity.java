package de.derandroidpro.dialogliste_tutorial;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements android.view.View.OnClickListener {
	
	public Button btn1;
	public AlertDialog.Builder dialogbuilder1;
	public String[] dialogtxt = {"Samsung","LG","Google","Oneplus"};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		
		
		btn1 = (Button) findViewById(R.id.button1);
		
		btn1.setOnClickListener(this);
		
		
		
	}


	@Override
	public void onClick(View v) {
		switch (v.getId()){
		case R.id.button1:{
			
			ArrayAdapter<String> dialogadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dialogtxt);
			
			
			dialogbuilder1 = new AlertDialog.Builder(MainActivity.this);
			dialogbuilder1.setTitle("Bitte auswählen:");
			dialogbuilder1.setIcon(R.drawable.ic_launcher);
			dialogbuilder1.setAdapter(dialogadapter, new OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					
					if (dialogtxt [which] == "Samsung") {
						
						Toast.makeText(getApplicationContext(), "galaxy s5", Toast.LENGTH_SHORT).show();
						
					}
					
					if (dialogtxt [which] == "LG") {
						
						Toast.makeText(getApplicationContext(), "G3", Toast.LENGTH_SHORT).show();
						
					}

					if (dialogtxt [which] == "Google") {
	
						Toast.makeText(getApplicationContext(), "nexus 5", Toast.LENGTH_SHORT).show();
	
					}
					
					if (dialogtxt [which] == "Oneplus") {
						
						Toast.makeText(getApplicationContext(), "one", Toast.LENGTH_SHORT).show();
						
					}
					
					
					
					
					
				}

			
			});
			
			dialogbuilder1.create().show();
			
			
		}
		
		}
		
	}

	
}
