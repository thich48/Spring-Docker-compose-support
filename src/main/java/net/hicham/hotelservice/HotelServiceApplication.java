package net.hicham.hotelservice;

import net.hicham.hotelservice.entities.Reservation;
import net.hicham.hotelservice.entities.ReservationStatus;
import net.hicham.hotelservice.repository.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HotelServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ReservationRepository reservationRepository){
        return args -> {
            reservationRepository.save(Reservation.builder().title("RES 1").price(1200).status(ReservationStatus.CREATED).build());
            reservationRepository.save(Reservation.builder().title("RES 2").price(2300).status(ReservationStatus.CONFIRMED).build());
            reservationRepository.save(Reservation.builder().title("RES 3").price(1500).status(ReservationStatus.CANCELED).build());
        };
    }


}
