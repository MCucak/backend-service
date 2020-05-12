package com.smartparkinglot.backendservice.services.reservationservice;

import com.smartparkinglot.backendservice.domain.Driver;
import com.smartparkinglot.backendservice.domain.Reservation;

import java.util.List;

public interface ReservationService {
    List<Reservation> listAll();

    List<Reservation> getDriverReservations(Long driver_id);
    Reservation getReservationWithId(Long res_id); // adminlere acik
    Reservation getDriverReservation(Long driver_id, Long res_id); // user'a acık
    List<Reservation> getReservationWithPlate(String plate);
    Reservation addOrSave(Reservation reservation);
    void deleteById(Reservation reservation);


}
