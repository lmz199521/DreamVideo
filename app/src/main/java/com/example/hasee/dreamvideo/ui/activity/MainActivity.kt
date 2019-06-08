package com.example.hasee.dreamvideo.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import com.example.hasee.dreamvideo.R
import com.example.hasee.dreamvideo.base.BaseActivity
import com.example.hasee.dreamvideo.utils.ToolbarManger
import org.jetbrains.anko.find

class MainActivity : BaseActivity(), ToolbarManger {
    //这里是 惰性加载  就是需要的时候初始化 不需要的时候就不用初始化   属于线程安全的操作
    override val toolbar by lazy { find<Toolbar>(R.id.toolbar) }
    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initdata() {
        super.initdata()
        initMainToolbar() //调用我们设置好的
    }

}
