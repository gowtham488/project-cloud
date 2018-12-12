package gowtham.com.projectcloud.dagger

import android.app.Application
import gowtham.com.projectcloud.modules.NetworkModule

class WeatherApplication : Application() {

    var component: ApplicationComponent? = null

    override fun onCreate() {
        super.onCreate()

        component = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .networkModule(NetworkModule(this))
                .build()
    }
}
