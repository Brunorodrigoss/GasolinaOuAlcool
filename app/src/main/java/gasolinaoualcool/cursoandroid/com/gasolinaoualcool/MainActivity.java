package gasolinaoualcool.cursoandroid.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText campoAlcool;
    private EditText campoGasolina;
    private Button botaoVerificar;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoAlcool = findViewById(R.id.precoAlcoolId);
        campoGasolina = findViewById(R.id.precoGasolinaId);
        botaoVerificar = findViewById(R.id.botaoVerificarId);
        resultado = findViewById(R.id.resultadoId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoAlcool = campoAlcool.getText().toString();
                String textoGasolina = campoGasolina.getText().toString();

                if (textoAlcool.isEmpty() || textoGasolina.isEmpty()) {
                    resultado.setText("Digite os valores referentes a gasolina e alcool.");
                } else {

                    double valorAlcool = Double.parseDouble(textoAlcool);
                    double valorGasolina = Double.parseDouble(textoGasolina);

                    double calculo = valorAlcool / valorGasolina;

                    if (calculo >= 0.7) {
                        resultado.setText("A melhor escolha é a Gasolina!");
                    } else {
                        resultado.setText("A melhor escolha é o Alcool!");
                    }
                }
            }
        });
    }
}
