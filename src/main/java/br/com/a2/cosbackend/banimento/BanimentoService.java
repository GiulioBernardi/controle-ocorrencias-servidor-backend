package br.com.a2.cosbackend.banimento;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BanimentoService {

    private final BanimentoDao banimentoDao;

    public BanimentoService(final BanimentoDao banimentoDao) {
        this.banimentoDao = banimentoDao;
    }


    public List<BanimentoTO> listarBanimentos() {
        return this.banimentoDao.listarBanimentos();
    }
}
