package uz.project.youtube

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import uz.project.youtube.Models.Model
import uz.project.youtube.Models.SearchClass
import uz.project.youtube.Models.ShortVideoClass
import uz.project.youtube.Models.VideoClass
import uz.project.youtube.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter = Adapter()
    private var models = mutableListOf<Model>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fillRecommends()



        adapter.models = models

        Log.d("TTTT", "Boldi ")
        binding.apply {
            rcRecommends.adapter = adapter


        }
    }

        private fun fillRecommends() {
            models = mutableListOf<Model>(
                SearchClass(R.drawable.img_3),
                VideoClass(
                    R.drawable.img_4,
                    "За 30. Войти в Айти. Беседа со столяром. Как найти первую работу без опыта работы и диплома вышки",
                    "easyCodeRu · 251 просмотр · 5 часов назад"
                ),
                ShortVideoClass("CSS Custom Scroll bar in 60 seconds ! #shorts"),
                VideoClass(
                    R.drawable.img_5,
                    "Android - Kotlin Flows (часть 2)",
                    "Roman Andrushchenko · 2,7 тыс. просмотров · 6 дней назад"
                ),
                VideoClass(
                    R.drawable.img_5,
                    "Android - Kotlin Flows (часть 2)",
                    "Roman Andrushchenko · 2,7 тыс. просмотров · 6 дней назад"
                ),
                VideoClass(
                    R.drawable.img_5,
                    "Android - Kotlin Flows (часть 2)",
                    "Roman Andrushchenko · 2,7 тыс. просмотров · 6 дней назад"
                ),
                VideoClass(
                    R.drawable.img_5,
                    "Android - Kotlin Flows (часть 2)",
                    "Roman Andrushchenko · 2,7 тыс. просмотров · 6 дней назад"
                ),
                VideoClass(
                    R.drawable.img_5,
                    "Android - Kotlin Flows (часть 2)",
                    "Roman Andrushchenko · 2,7 тыс. просмотров · 6 дней назад"
                ),

            )

            Log.d("TTTT", "Tolditildi ")
        }
    }