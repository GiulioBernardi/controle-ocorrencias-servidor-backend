package br.com.a2.cosbackend.banimento;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/banimentos")
public class BanimentoController {

    private final BanimentoService banimentoService;

    public BanimentoController(final BanimentoService banimentoService){
        this.banimentoService = banimentoService;
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<BanimentoTO>> listarBanimentos(){
        return ResponseEntity.ok(this.banimentoService.listarBanimentos());
    }

}
