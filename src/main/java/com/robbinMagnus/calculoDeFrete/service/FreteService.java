package com.robbinMagnus.calculoDeFrete.service;

import com.robbinMagnus.calculoDeFrete.dto.FreteDTO;
import com.robbinMagnus.calculoDeFrete.model.Frete;
import com.robbinMagnus.calculoDeFrete.model.TransporteExpresso;
import com.robbinMagnus.calculoDeFrete.model.TransporteNormal;
import org.springframework.stereotype.Service;

@Service
public class FreteService {

    public double calcularFrete(FreteDTO dto){
        Frete frete = switch (dto.getTipoEntrega().toUpperCase()) {
            case "EXPRESSA" -> new TransporteExpresso(dto.getPesoKg(), dto.getDistanciaKm());
            case "NORMAL" -> new TransporteNormal(dto.getPesoKg(), dto.getDistanciaKm());
            default -> throw new IllegalArgumentException("Tipo de entrega invalido: " + dto.getTipoEntrega());
        };

        return frete.calcular();
    }
}
