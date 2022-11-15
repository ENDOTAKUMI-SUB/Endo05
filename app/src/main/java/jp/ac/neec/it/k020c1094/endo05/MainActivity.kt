package jp.ac.neec.it.k020c1094.endo05

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lvGameMenu = findViewById<ListView>(R.id.lvGameMenu)
        var gameList = mutableListOf(
            "ドラクエウォーク",
            "クラッシュオブクラン",
            "クラッシュオブロワイヤル",
            "マリオゴルフ",
            "ドンキーコング",
            "スーパーマリオ",
            "ドクターマリオ",
            "エキサイトバイク",
            "MOTHER",
            "星のカービィ",
            "スターフォックスシリーズ",
            "大合奏!バンドブラザーズ",
            "スプラトゥーン",
            "Wii Party"
        )
        val adapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, gameList)
        lvGameMenu.adapter = adapter
        lvGameMenu.onItemClickListener = ListItemClickListener()
    }


    private inner class ListItemClickListener : AdapterView.OnItemClickListener {
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
            val dialogFragment = OrderConfirmDialogFragment()
            dialogFragment.show(supportFragmentManager, "OrderConfirmDialogFragment")
        }
    }
}
