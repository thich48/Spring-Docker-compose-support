package net.hicham.hotelservice.repository;

import net.hicham.hotelservice.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository <Reservation, Long>{
}
