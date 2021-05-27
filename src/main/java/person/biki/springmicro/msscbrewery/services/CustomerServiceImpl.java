package person.biki.springmicro.msscbrewery.services;

import org.springframework.stereotype.Service;
import person.biki.springmicro.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Biki").build();
    }
}
