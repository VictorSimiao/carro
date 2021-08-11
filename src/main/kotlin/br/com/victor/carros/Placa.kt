package br.com.victor.carros


import javax.validation.Constraint
import kotlin.annotation.AnnotationRetention.*
import kotlin.annotation.AnnotationTarget.*
import kotlin.reflect.KClass

@MustBeDocumented
@Target(FIELD, CONSTRUCTOR)
@Retention(RUNTIME)
@Constraint(validatedBy = [PlacaValidator::class])
annotation class Placa(
    val message: String = "placa com formato inválido",
    val groups:Array<KClass<Any>> = [],
    val payload:Array<KClass<Any>> = []
)
