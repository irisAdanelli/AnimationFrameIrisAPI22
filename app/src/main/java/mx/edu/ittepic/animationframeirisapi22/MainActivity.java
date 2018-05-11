package mx.edu.ittepic.animationframeirisapi22;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button inicio,parar;
    ImageView framer;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicio = findViewById(R.id.btninicio);
        parar = findViewById(R.id.btnparar);
        framer = findViewById(R.id.imgcap);

        if(framer ==null){
            throw new AssertionError();
        }
        framer.setVisibility(View.VISIBLE);
        framer.setBackgroundResource(R.drawable.frame_animation_list);

        animationDrawable= (AnimationDrawable) framer.getBackground();
        animationDrawable.setOneShot(true);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                framer.setVisibility(View.VISIBLE);
                if (animationDrawable.isRunning()){
                    animationDrawable.stop();
                }
                animationDrawable.start();

            }
        });


        parar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationDrawable.stop();
            }
        });
    }
}
