package com.example.recycleview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var rvAdapter: RvAdapter
    private lateinit var dataList:ArrayList<RvModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dataList=ArrayList<RvModel>()

        dataList.add(RvModel(R.drawable.diet,"this is not helthy","amazone"))
        dataList.add(RvModel(R.drawable.diet,"this is not helthy","amazone"))
        dataList.add(RvModel(R.drawable.diet,"this is not helthy","amazone"))
        dataList.add(RvModel(R.drawable.diet,"this is not helthy","amazone"))
        dataList.add(RvModel(R.drawable.diet,"this is not helthy","amazone"))
        dataList.add(RvModel(R.drawable.diet,"this is not helthy","amazone"))
        dataList.add(RvModel(R.drawable.diet,"this is not helthy","amazone"))
        dataList.add(RvModel(R.drawable.diet,"this is not helthy","amazone"))
        dataList.add(RvModel(R.drawable.diet,"this is not helthy","amazone"))
        dataList.add(RvModel(R.drawable.diet,"this is not helthy","amazone"))
        dataList.add(RvModel(R.drawable.diet,"this is not helthy","amazone"))
        dataList.add(RvModel(R.drawable.diet,"this is not helthy","amazone"))
        dataList.add(RvModel(R.drawable.diet,"this is not helthy","amazone"))
        dataList.add(RvModel(R.drawable.diet,"this is not helthy","amazone"))
        dataList.add(RvModel(R.drawable.diet,"this is not helthy","amazone"))
        dataList.add(RvModel(R.drawable.diet,"this is not helthy","amazone"))
        dataList.add(RvModel(R.drawable.diet,"this is not helthy","amazone"))
        dataList.add(RvModel(R.drawable.diet,"this is not helthy","amazone"))
        dataList.add(RvModel(R.drawable.diet,"this is not helthy","amazone"))

        rvAdapter= RvAdapter(dataList,this)
        binding.rv.layoutManager=LinearLayoutManager(this)
        binding.rv.adapter=rvAdapter

    }
}