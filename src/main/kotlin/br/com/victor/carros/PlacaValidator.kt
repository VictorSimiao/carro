package br.com.victor.carros

import io.micronaut.core.annotation.AnnotationValue
import io.micronaut.validation.validator.constraints.ConstraintValidator
import io.micronaut.validation.validator.constraints.ConstraintValidatorContext
import javax.inject.Singleton

@Singleton
class PlacaValidator : ConstraintValidator<Placa, String> {
    override fun isValid(
        valor: String?,
        annotationMetadata: AnnotationValue<Placa>,
        context: ConstraintValidatorContext
    ): Boolean {
        //Implementando a lógica
        if (valor == null) {
            return true
        }
        return valor.matches("[A-Z]{3}[0-9][0-9A-Z][0-9]{2}".toRegex())

    }

}
