package model.entities;

import java.time.Duration;
import java.time.LocalDateTime;

public class CarRental {
	protected LocalDateTime start;
	protected LocalDateTime finish;

	private Vehicle vehicle;
	private Invoice invoice;

	public CarRental() {
	}

	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
		super();
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;

	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public long getDuration(){
		Duration duration = Duration.between(start,finish);	
		return (long) Math.ceil(duration.toMinutes()/60.0);
	}

}
