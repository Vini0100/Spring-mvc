package com.projeto.boot.demomvc.web.validator;
import java.time.LocalDate;

import com.projeto.boot.demomvc.domain.Funcionario;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class FuncionarioValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Funcionario.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		
		Funcionario f = (Funcionario) object;
		
		LocalDate entrada = f.getDataEntrada();
		
		if (f.getDataSaida() != null) {
			if (f.getDataSaida().isBefore(entrada)) {
				errors.rejectValue("dataSaida", "PosteriorDataEntrada.funcionario.dataSaida");
			}
		}
	}

}
