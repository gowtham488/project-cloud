package gowtham.com.projectcloud.dagger

import dagger.Component
import gowtham.com.projectcloud.modules.NetworkModule
import gowtham.com.projectcloud.ui.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, NetworkModule::class])
interface ApplicationComponent {
    fun injectMainActivity(mainActivity: MainActivity)
}
