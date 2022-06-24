# ListingApp
Listings app that implements MVVM architecture using Kotlin, Hilt-Dagger, Coroutines, Retrofit2, DataBinding and Clean Architecture.

The app module has following packages:

di: Dependency providing classes using Hilt-Dagger.
ui: View classes along with their corresponding ViewModel.
utils: Utility classes.

The data module has following packages:

api: Retrofit2 component.
datamodel: It contains all the data accessing and manipulating components.
mapper: contains classes convert api responces to data model.
repository: implement fetching data from remote source.
utils: Utility classes.

The domain module has following packages:

common: contains data status classes.
entities: contains data model classes.
repository: contains abstract repositories that implemented in data module.
usecases: contains use cases classes.


