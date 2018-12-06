package gowtham.com.projectcloud.dagger

import android.app.Application

class WeatherApplication : Application() {

    var component: ApplicationComponent? = null

    override fun onCreate() {
        super.onCreate()

        component = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}
