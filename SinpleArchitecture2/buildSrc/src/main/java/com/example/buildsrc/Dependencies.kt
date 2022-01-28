package com.example.buildsrc

object Dependencies {
    val ui = listOf(
        Libraries.appCompat,
        Libraries.composeMaterial,
        Libraries.composeUi,
        Libraries.composeActivity,
        Libraries.composeUiTooling,
        Libraries.viewModel,
        Libraries.coreKtx,
        Libraries.navigation

    )

    val coroutine = listOf(
        Libraries.coroutines,
        Libraries.coroutinesAndroid
    )

    val hilt = listOf(
        Libraries.hilt,
        Libraries.hiltCompiler,
        Libraries.hiltNavigation
    )

    val network = listOf(
        Libraries.retrofit,
        Libraries.okhttp,
        Libraries.okhttpLogging
    )

}