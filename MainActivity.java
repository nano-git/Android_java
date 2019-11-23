package com.example.piano;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

//必要なものをインポート
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity<ChangeTextView> extends AppCompatActivity {

    private TextView textView;
    private boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタン指定
        Button button = findViewById(R.id.ChangeButton);
        //テキストビュー指定
        textView = findViewById(R.id.messageTextView);

        //ボタン押下時の動作指定
        button.setOnClickListener(new View.OnClickListener() {

            //ボタンが押されたらonClickメソッドが起動する
            public void onClick(View view){
                if(flag) {
                    //flagがtrueのとき「Hello World」をテキストビューに表示
                    textView.setText("Hello World");
                    flag=false;
                } else {
                    //flagがfalseのとき「android」をテキストビューに表示
                    textView.setText("android");
                    flag=true;
                }
            }
        });
    }


}
