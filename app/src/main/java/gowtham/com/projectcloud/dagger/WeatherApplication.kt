package gowtham.com.projectcloud.dagger

import android.app.Application
import gowtham.com.projectcloud.modules.IOModule

class WeatherApplication : Application() {

    private var component: ApplicationComponent? = null

    override fun onCreate() {
        super.onCreate()

        component = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .iOModule(IOModule())
                .build()
    }
}
