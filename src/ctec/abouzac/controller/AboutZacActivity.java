package ctec.abouzac.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AboutZacActivity extends Activity
{

	private Button motorcycle;
	private Button saxophone;
	private Button networking;
	private ImageView firstImage;
	private ImageView secondImage;
	private ImageView thirdImage;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		motorcycle = (Button) findViewById(R.id.motorcycle);
		saxophone = (Button) findViewById(R.id.saxophone);
		networking = (Button) findViewById(R.id.networking);
		firstImage = (ImageView) findViewById(R.id.imageView1);
		secondImage = (ImageView) findViewById(R.id.imageView2);
		thirdImage = (ImageView) findViewById(R.id.imageView3);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_zac);
		
		setupListeners();
	}
	
	private void setupListeners()
	{
		
		motorcycle.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				firstImage.setVisibility(View.VISIBLE);
				secondImage.setVisibility(View.INVISIBLE);
				thirdImage.setVisibility(View.INVISIBLE);
				
			}
		});
		
		saxophone.setOnClickListener(new View.OnClickListener()
		{

			@Override
			public void onClick(View currentView)
			{
				firstImage.setVisibility(View.INVISIBLE);
				secondImage.setVisibility(View.VISIBLE);
				thirdImage.setVisibility(View.INVISIBLE);
				
			}
			
		});
		
		networking.setOnClickListener(new View.OnClickListener()
		{

			@Override
			public void onClick(View currentView)
			{
				firstImage.setVisibility(View.INVISIBLE);
				secondImage.setVisibility(View.INVISIBLE);
				thirdImage.setVisibility(View.VISIBLE);
				
			}
			
		});
	}
}
