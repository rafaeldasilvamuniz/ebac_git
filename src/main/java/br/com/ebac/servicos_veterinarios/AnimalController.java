package br.com.servicos_veterinarios;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animais")
public class AnimalController {

      private AnimalRepository repository;

      public AnimalController(AnimalController repository){
          this.repository = repository;
      }

      @GetMapping
      private List<Animal> findall() {
          return new ArrayList<>();
      }

      @PostMapping
      private Animal create(@RequestBody Animal animal) {
          return repository.save(animal);
      }

      @GetMapping("/not-adopted")
      private List<Animal> findNotAdopted() {
          return repository.findNotAdopted();
      }

      @GetMapping("/adopted")
      private List<Animal> findAdopted() {
        return repository.findAdopted();
    }

}

