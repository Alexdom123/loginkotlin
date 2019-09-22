package moreno.alex.loginkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIniciar.setOnClickListener {
            val user = etName.text.toString()
            val pass = etContra.text.toString()

            if (user.equals("") and pass.equals("")){
                mensaje("Campos Vacíos")
            }
            else if (user.equals("")){
                mensaje("Por favor ingrese su nombre de usuario")
            }
            else if (pass.equals("")){
                mensaje("Por favor ingrese su contraseña")
            }
            else{
                if (user.equals("alex") and pass.equals("1234")){
                    val i = Intent(this,cinco::class.java)
                    i.putExtra("nombre","Alex")
                    startActivity(i)
                }else{
                    mensaje("Nel perro no eres nadie")
                    etName.setText("")
                }
            }
        }

    }

    override fun onStart() {
        super.onStart()
        Log.wtf("ejemplo", "debo estar en el onstart")
    }

    override fun onResume() {
        super.onResume()
        Log.wtf("ejemplo", "debo estar en el Onresume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.wtf("ejemplo", "debo estar en el OnRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.wtf("ejemplo","debo estar en el onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.wtf("ejemplo","debo estar en el onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.wtf("ejemplo", "debo estar en el onDestroy")
    }

    fun mensaje(mensaje:String) {
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show()
    }

}
