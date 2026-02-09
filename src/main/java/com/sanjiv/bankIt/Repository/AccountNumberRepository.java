package com.sanjiv.bankIt.Repository;

import com.sanjiv.bankIt.Entity.AccountNumberCounter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountNumberRepository extends JpaRepository<AccountNumberCounter, Long> {

}
