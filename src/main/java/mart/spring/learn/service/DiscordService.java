package mart.spring.learn.service;

import mart.spring.learn.entitys.Player;
import mart.spring.learn.repository.PlayerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscordService {
    @Bean
    public CommandLineRunner demo(PlayerRepository repository) {
        return (args) -> {
            List<Player> pl = repository.findByLastName("Ham");
            for(Player p: pl){
                System.out.println(p.getFirstName());
                System.out.print("Works");
            }
        };
    }

}
