package com.example.depremncesihazrlkuygulamas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

    public class DepremSirasindaActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_deprem_sirasinda);

            TextView baslikTextView = findViewById(R.id.baslikTextView);
            TextView acilDurumTextView = findViewById(R.id.yapilacaklarTextView);

            String baslik = "Deprem Sırasında Yapılması Gerekenler";
            String acilDurum =
                    "1- Sarsıntı başladığında sakin olun ve paniklemeyin.\n\n" +
                    "2- Kendinizi koruyacak bir yer bulun (masa altı, iç köşe).\n\n" +
                    "3- Pencere ve cam gibi kırılabilir nesnelerden uzak durun.\n\n" +
                    "4- Asansör kullanmayın, merdivenleri tercih edin.\n\n" +
                    "5- Başınızı korumak için ellerinizi, kollarınızı veya başka bir şeyi kullanın.\n\n" +
                    "6- Sarsıntı durduktan sonra, güvenli bir alana geçin ve dışarı çıkmayın.\n\n" +
                    "7- Elektrik, gaz ve su gibi kaynakları kontrol edin ve kapatın.\n\n" +
                    "8- Yetkililerin talimatlarını takip edin ve güvenli bölgeleri tercih edin.\n\n" +
                    "9- İlk yardım bilginiz varsa, ihtiyaç sahiplerine yardımcı olun.\n\n";

            baslikTextView.setText(baslik);
            acilDurumTextView.setText(acilDurum);
        }
    }
