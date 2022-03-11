package com.codepath.apps.restclienttemplate

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View
import com.codepath.apps.restclienttemplate.models.SampleModel
import com.codepath.apps.restclienttemplate.models.SampleModelDao
import com.codepath.oauth.OAuthLoginActionBarActivity

class LoginActivity : OAuthLoginActionBarActivity<TwitterClient>() {

    var sampleModelDao: SampleModelDao? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_login)
        val sampleModel = SampleModel()
        sampleModel.name = "TwitterClient"
        sampleModelDao = (applicationContext as TwitterApplication).myDatabase?.sampleModelDao()
        AsyncTask.execute { sampleModelDao?.insertModel(sampleModel) }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.login, menu)
        return true
    }

    override fun onLoginSuccess() {

        Log.i("my_tag", "Logged in successfully")

         val i = Intent(this, TimelineActivity::class.java)
         startActivity(i)

    }

    override fun onLoginFailure(e: Exception) {

        Log.i("my_tag", "Login failed")

        e.printStackTrace()
    }

    fun loginToRest(view: View?) {

        client.connect()
    }
}