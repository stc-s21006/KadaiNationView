package jp.suntech.s21006.mykadai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ListViewオブジェクトの取得
        ListView lvNation = findViewById(R.id.lvNation);
//ListViewにリスナを設定
        lvNation.setOnItemClickListener(new ListItemClickListener());
    }
    //リストがタップされた時の処理が記述されたメンバクラス
    private class ListItemClickListener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?>parent, View view, int position, long id) {
//タップされた定食名を取得
            String item = (String) parent.getItemAtPosition(position);
//トーストで表示する文字列を生成
            String show = "あなたが選んだ国：" + item;
            TextView tvNation = findViewById(R.id.tvNation);
            tvNation.setText(show);
            

        }
    }
}