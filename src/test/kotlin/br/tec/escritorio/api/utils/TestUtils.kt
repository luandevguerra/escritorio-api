package br.tec.escritorio.api.utils

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

object TestContext {
    private val map: HashMap<String, Any> = HashMap()
    fun get(name: String) = map[name]
    fun set(name: String, obj: JvmType.Object) {
        map[name] = obj
    }
}