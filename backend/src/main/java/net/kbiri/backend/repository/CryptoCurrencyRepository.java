package net.kbiri.backend.repository;

import net.kbiri.backend.entities.CryptoCurrency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CryptoCurrencyRepository extends JpaRepository<CryptoCurrency, String> {
}
