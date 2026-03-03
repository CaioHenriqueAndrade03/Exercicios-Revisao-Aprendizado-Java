package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Integer roomNumber;
		Date checkin;
		Date checkout;

		List<Reservation> reservas = new ArrayList<>();

		int n;
		System.out.println("Quantos quartos voce deseja registrar: ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o numero do quarto:");
			roomNumber = sc.nextInt();
			sc.nextLine();

			System.out.println("Digite a data de checkin");
			checkin = sdf.parse(sc.next());

			System.out.println("Digite a data de checkout");
			checkout = sdf.parse(sc.next());

			if (!checkout.after(checkin)) {
				System.out.println("Erro na reserva, o checkout esta antes do checkin");
			} else {
				Reservation reserva = new Reservation(roomNumber, checkin, checkout);
				reservas.add(reserva);

				System.out.println("Entre com os dados para atualizar a reserva:");

				System.out.println("Digite a data de checkin");
				checkin = sdf.parse(sc.next());

				System.out.println("Digite a data de checkout");
				checkout = sdf.parse(sc.next());

				String error = reserva.updateDates(checkin, checkout);
				if (error != null) {
					System.out.println("Erro na reserva: " + error);
				} else {
					System.out.println("Reservation: " + reserva);
				}
			}
		}
		if (n <= 1) {

		} else {
			for (Reservation reserva : reservas) {
				System.out.println(reserva);
			}
		}

		sc.close();

	}

}
