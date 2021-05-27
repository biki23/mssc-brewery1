package person.biki.springmicro.msscbrewery.services;

import person.biki.springmicro.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);
}
