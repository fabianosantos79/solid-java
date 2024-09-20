package br.com.alura.Command;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.services.PetsService;

import java.io.IOException;

public class ListarPetsCommand implements Command {
    @Override
    public void execute() {
        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            PetsService petsService = new PetsService(client);

            petsService.listarPets();
        } catch ( IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}