package au.com.anz.microservice.accountsapi.dataaccess;

import au.com.anz.microservice.accountsapi.domain.entity.AccountDab;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountDao extends JpaRepository<AccountDab, Long> {
    List<AccountDab> findByCustomerNumber(String customerNumber);
}
