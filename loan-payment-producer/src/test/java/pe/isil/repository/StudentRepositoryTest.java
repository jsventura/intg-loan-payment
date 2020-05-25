package pe.isil.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pe.isil.model.Loan;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@TestPropertySource(properties = {
        "spring.jpa.hibernate.ddl-auto=create-drop",
})
public class StudentRepositoryTest {

    @Autowired
    LoanRepository loanRepository;

    @Test
    public void whenSaved_thenFindById(){
        Loan loanSaved = loanRepository.save(
                new Loan(12345));

        assertThat(loanRepository.findById(12345)).isNotNull();
    }

}
