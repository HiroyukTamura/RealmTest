package com.example.realmtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.realm.Realm

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Realm.init(this)

        Realm.getDefaultInstance().executeTransaction {
            it.copyToRealm(RealmObj())
        }
    }
}