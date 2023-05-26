package fpoly.edu.bai2_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtResult = findViewById(R.id.txt_result);
        EditText edtHoten = findViewById(R.id.edt_hoten);
        EditText edtMssv = findViewById(R.id.edt_mssv);
        EditText edtTuoi = findViewById(R.id.edt_tuoi);
        RadioButton rdoNam = findViewById(R.id.rdo_nam);
        RadioButton rdoNu = findViewById(R.id.rdo_nu);
        CheckBox chkFootball = findViewById(R.id.chk_Football);
        CheckBox chkGame = findViewById(R.id.chk_Game);
        Button btnClick = findViewById(R.id.btn_click);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtHoten.getText().toString();
                String mssv = edtMssv.getText().toString();
                String tuoi = edtTuoi.getText().toString();
                String gender = rdoNam.isChecked()
                        ? rdoNam.getText().toString()
                        : rdoNu.isChecked()
                        ? rdoNu.getText().toString()
                        : "Chưa lựa chọn giới tính";
                String interest = chkFootball.isChecked() && chkGame.isChecked()
                        ? "Đá bóng và Chơi game"
                        : chkFootball.isChecked()
                        ? chkFootball.getText().toString()
                        : chkGame.isChecked()
                        ? chkGame.getText().toString()
                        : "Không thích gì cả";
                txtResult.setText("Tôi tên: " + name + "\n"
                                    + "MSSV: " + mssv + "\n"
                                    + "Tuổi: " + tuoi + "\n"
                                    + "Giới Tính: " + gender + "\n"
                                    + "Sở Thích: " + interest);
            }
        });
    }
}