package winetime.winetime

import dagger.Module
import dagger.Provides

@Module
class WineModule {

    @Provides
    fun providesWineRepo(): WineRepo {
        return WineRepo()
    }
}