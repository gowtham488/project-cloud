package gowtham.com.projectcloud.dagger

import android.content.Context

import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val weatherApplication: WeatherApplication) {

    @Provides
    internal fun providesApplicationContext(): Context {
        return weatherApplication
    }
}
