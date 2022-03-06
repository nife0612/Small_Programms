package com.example.valuesarray

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //smallLesson21()
        //practicePart21()

        //smallLesson22()



    }

    private fun smallLesson21(){
        val lostArray = arrayOf(10000, 2300, 50000, 32452, 32654, 213)
        val earnArray = arrayOf(1324, 23132, 33234, 532, 2424, 23)
        val resultArray = ArrayList<String>()

        val names = resources.getStringArray(R.array.names)

        for((index, name) in names.withIndex()){
            resultArray.add("Name: $name, has earned: ${earnArray[index] - lostArray[index]}")
        }

        for(item in resultArray){
            Log.e("My", item)
        }
    }
    private fun practicePart21(){
        val bad = 0..3
        val normal = 4..6
        val nice = 7..9
        val excellent = 10
        val gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
        val nameArray = arrayOf("Антон", "Егор", "Маша", "Светлана", "Юля", "Семен")
        val badArray = ArrayList<String>()
        val normalArray = ArrayList<String>()
        val niceArray = ArrayList<String>()
        val excellentArray = ArrayList<String>()

        for((index, item) in gradeArray.withIndex()){
            when (item) {
                in bad -> badArray.add("Плохие оценки:Ученик:${nameArray[index]} - ${gradeArray[index]}")
                in normal -> normalArray.add("Нормальные оценки:Ученик:${nameArray[index]} - ${gradeArray[index]}")
                in nice -> niceArray.add("Хорошие оценки:Ученик:${nameArray[index]} - ${gradeArray[index]}")
                excellent -> excellentArray.add("Превосходные оценки:Ученик:${nameArray[index]} - ${gradeArray[index]}")
            }
        }
        //for (item in badArray)   Log.e("My", badArray[badArray.size - 1])
        //for (item in normalArray)  Log.e("My", normalArray[normalArray.size - 1])
        //for (item in niceArray) Log.e("My", niceArray[niceArray.size - 1])
        //for (item in excellentArray) Log.e("My", excellentArray[excellentArray.size - 1])

        badArray.forEach{Log.e("My", it)}
        normalArray.forEach{Log.e("My", it)}
        niceArray.forEach{Log.e("My", it)}
        excellentArray.forEach{Log.e("My", it)}
    }

    private fun smallLesson22(){
        var user = User22("234", "34", 3)
    }


}