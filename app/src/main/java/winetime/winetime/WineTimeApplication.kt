package winetime.winetime

import android.app.Application

class WineTimeApplication: Application() {
    val injector: WineComponent = DaggerWineComponent.create()
}