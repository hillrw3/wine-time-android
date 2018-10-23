package winetime.winetime

object Syringe {
    private val daggerWineComponent = DaggerWineComponent.create()

    fun inject(cellar: Cellar) = daggerWineComponent.inject(cellar)
}
