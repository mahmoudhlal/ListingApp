# ListingApp
Listings app that implements MVVM architecture using Kotlin, Hilt-Dagger, Coroutines, Retrofit2, DataBinding and Clean Architecture.

The app module has following packages:

1. di: Dependency providing classes using Hilt-Dagger.
2. ui: View classes along with their corresponding ViewModel.
3. utils: Utility classes.

The data module has following packages:

1. api: Retrofit2 component.
2. datamodel: It contains all the data accessing and manipulating components.
3. mapper: contains classes convert api responces to data model.
4. repository: implement fetching data from remote source.
5. utils: Utility classes.

The domain module has following packages:

1. common: contains data status classes.
2. entities: contains data model classes.
3. repository: contains abstract repositories that implemented in data module.
4. usecases: contains use cases classes.


