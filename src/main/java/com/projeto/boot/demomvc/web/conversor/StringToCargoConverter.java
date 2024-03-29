package com.projeto.boot.demomvc.web.conversor;
import com.projeto.boot.demomvc.domain.Cargo;
import com.projeto.boot.demomvc.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;

@Component
public class StringToCargoConverter implements Converter<String, Cargo> {

    @Autowired
    private CargoService service;

    @Override
    public Cargo convert(String text) {
        if (text.isEmpty()) {
            return null;
        }
        Long id = Long.valueOf(text);
        return service.buscarPorId(id);
    }
}
