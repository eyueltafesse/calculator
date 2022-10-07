package com.simplemobiletools.calculator

import android.app.Application
import android.os.Parcel
import android.os.Parcelable

class App() : Application(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate() {
        super.onCreate()

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<App> {
        override fun createFromParcel(parcel: Parcel): App {
            return App(parcel)
        }

        override fun newArray(size: Int): Array<App?> {
            return arrayOfNulls(size)
        }
    }

}
