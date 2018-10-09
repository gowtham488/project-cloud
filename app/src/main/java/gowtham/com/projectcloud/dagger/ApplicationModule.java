package gowtham.com.projectcloud.dagger;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private WeatherApplication weatherApplication;

    public ApplicationModule(WeatherApplication weatherApplication) {
        this.weatherApplication = weatherApplication;
    }

    @Provides
    Context providesApplicationContext() {
        return weatherApplication;
    }
}
