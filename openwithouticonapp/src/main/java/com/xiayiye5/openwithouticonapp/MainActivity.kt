package com.xiayiye5.openwithouticonapp

import android.content.ComponentName
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * 打开app首页的方法，这个方法也可以打开app内部任意页面
     */
    fun openMainActivity(view: View) {
        val intent = Intent()
        //隐式跳转方法一：
        // 两个参数意思 1:被打开APP的包名 2:被打开APP页面所在的activity路径
        val cn =
            ComponentName("com.xiayiye5.withouticonapp", "com.xiayiye5.withouticonapp.MainActivity")
        intent.component = cn
        startActivity(intent)


    }

    /**
     * 打开app内部任意页面的方法
     */
    fun openHomeActivity(view: View) { //隐式跳转scheme方法二：
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("cn.xiayiye5.app://without_icon")))
    }
}
