package br.com.alura.screenmatch.controller;


import br.com.alura.screenmatch.dto.SerieDto;
import br.com.alura.screenmatch.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {

    @Autowired
    private SerieService servico;


    @GetMapping
    public List<SerieDto> obterSeries(){
        return servico.obterTodasAsSeries();
    }
    @GetMapping("/top5")
    public List<SerieDto> top5Series(){
        return servico.obterTop5Series();
    }



}
