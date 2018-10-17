package gowtham.com.projectcloud.dagger

import dagger.Component
import gowtham.com.projectcloud.modules.IOModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, IOModule::class])
interface ApplicationComponent
