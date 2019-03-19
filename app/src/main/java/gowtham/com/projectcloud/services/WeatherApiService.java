package gowtham.com.projectcloud.services;

import gowtham.com.projectcloud.models.WeatherIfo;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface WeatherApiService {

    @GET("data/2.5/forecast?q=Livonia&appid=0f09b217f98525f00672857921954098")
    Observable<WeatherIfo> weatherByCityName();
}
