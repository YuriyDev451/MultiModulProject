object Versions {
    const val androidApplication = "8.2.0"
    const val jetbrainsKotlin = "1.9.10"
    const val materialComponents = "1.11.0"
    const val constraintlayoutVersion = "2.1.4"
    const val junitJunit = "4.13.2"
    const val testExtJunit = "1.1.5"
    const val testEspresso = "3.5.1"
    const val navigation = "2.7.6"
}

//"junit:junit:4.13.2"
//"androidx.test.ext:junit:1.1.5"
//"androidx.test.espresso:espresso-core:3.5.1"

object Libs {
    object UI {
        const val material = "com.google.android.material:material:${Versions.materialComponents}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayoutVersion}"
    }
    object Test {
        const val junitTest = "junit:junit:${Versions.junitJunit}"
        const val extJunitTest = "androidx.test.ext:junit:${Versions.testExtJunit}"
        const val espressoTest = "androidx.test.espresso:espresso-core:${Versions.testEspresso}"
    }


    object Navigation {
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    }
}





object Pluggins {

    const val androidApplication = "com.android.application"
    const val  jetbrainsKotlin = "org.jetbrains.kotlin.android"
    const val kotlinKapt = "kotlin-kapt"
    const val parcelize = "kotlin-parcelize"
}