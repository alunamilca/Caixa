package repository;

import br.com.camiolli.caixaeletronico.model.Conta;
import java.util.List;
public interface BaseRepository<C> {
    List<Conta> findAll();

    List <Conta> findByld();

    Conta findByld(int id);
    void adiciona(Conta objeto);

    }

