package info.sanaebadi.dependecyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var viewModel = ViewModel(SingleStepCounter())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_add.setOnClickListener {
            viewModel.addClicked()
        }

        button_minus.setOnClickListener {
            viewModel.subtractClicked()
        }

        val countText = text_number
        viewModel.countUpdateCallback = { count ->
            countText.text = "$count"
        }

    }
}