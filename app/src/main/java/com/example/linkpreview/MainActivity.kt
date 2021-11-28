package com.example.linkpreview

import android.R.attr.data
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import io.github.ponnamkarthik.richlinkpreview.*


class MainActivity : AppCompatActivity() {
    //    private lateinit var richLinkView: RichLinkViewTelegram
    private lateinit var linktext: EditText
    private lateinit var imgpreview: ImageView
    private lateinit var title: TextView
    private lateinit var descripton: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linktext = findViewById(R.id.linkpreviewedt)
//        richLinkView = findViewById(R.id.richLinkView)
        imgpreview = findViewById(R.id.imagepreview)
        title = findViewById(R.id.title)
        descripton = findViewById(R.id.desciption)


    }
  fun go(view: View) {
//        if(linktext.text.toString().isNotEmpty()){
//        richLinkView.setLink(linktext.text.toString(), object :
//            ViewListener {
//
//            override fun onSuccess(status: Boolean) {
//
//            }
//
//            override fun onError(e: Exception) {
//
//            }
//        })
//
//    }}

      if(linktext.text.toString().isNotEmpty()){
    val richPreview = RichPreview(object : ResponseListener {
        override fun onData(metaData: MetaData) {
            Picasso.get().load(metaData.imageurl).into(imgpreview)
            title.text = metaData.title
            descripton.text = metaData.description

            //Implement your Layout
        }

        override fun onError(e: java.lang.Exception) {
            //handle error
        }
    })

    richPreview.getPreview(linktext.text.toString())
}
}



    }


