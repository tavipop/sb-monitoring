package com.pw.sb.monitoring.web;


import com.pw.sb.monitoring.generator.FluxGenerator;
import com.pw.sb.monitoring.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController("api")
public class PersonController {

    @GetMapping(name = "/persons/")
    public Flux<Person> getAll() {
        final FluxGenerator<Person> personFluxGenerator = new FluxGenerator<>(Person.class, 100);
        return personFluxGenerator.generate();
    }

    @GetMapping(value = "/persons/{count}")
    public Flux<Person> getSome(@PathVariable("count") Integer count) {
        final FluxGenerator<Person> personFluxGenerator = new FluxGenerator<>(Person.class, count);
        return personFluxGenerator.generate();
    }
}