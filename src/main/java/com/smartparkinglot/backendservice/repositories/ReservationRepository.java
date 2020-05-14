package com.smartparkinglot.backendservice.repositories;

import com.smartparkinglot.backendservice.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
    List<Reservation> findByPlate(String plate);
    void deleteById(Long id);
    List<Reservation> findByDriverId(Long driverId);
    Reservation findByDriverIdAndIsActiveTrue(Long driverId);
}
