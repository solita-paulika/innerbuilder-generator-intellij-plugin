package com.github.janneri.innerbuildergeneratorintellijplugin

data class GeneratorOptions(
    val generateCopyMethod: Boolean,
    val methodPrefix: String,
    val jsonDeserializeWithBuilder: Boolean
)
