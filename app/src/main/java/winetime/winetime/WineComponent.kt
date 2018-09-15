package winetime.winetime

import dagger.Component

@Component(modules = [WineModule::class])
interface WineComponent {
    fun inject(mainActivity: MainActivity)

    fun wineRepo(): WineRepo
}