package Classes;

import java.util.Scanner;

public class Flight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("---------------- Airport Seat ----------------\n");

		int x; // to operation
		boolean reserved = false;
		Seat[][] seatnumber = new Seat[9][]; //make array to save seat
		seatnumber[0] = new Seat[2];
		seatnumber[1] = new Seat[2];
		seatnumber[2] = new Seat[2];
		seatnumber[3] = new Seat[4];
		seatnumber[4] = new Seat[4];
		seatnumber[5] = new Seat[4];
		seatnumber[6] = new Seat[4];
		seatnumber[7] = new Seat[4];
		seatnumber[8] = new Seat[4];
		int u = 3;
		for (int i = 0; i < seatnumber.length; i++) { //to get number of seat
			if (u < 40) {
				u = u + 8;
			} else {
				u = u + 6;
			}
			if (i <= 2) {

				for (int j = 0; j < 2; j++) {
					seatnumber[i][j] = new Seat(u, reserved);
					u++;
				}
			} else {
				for (int j = 0; j < 4; j++) {
					seatnumber[i][j] = new Seat(u, reserved);
					u++;
				}

			}
		}

		for (;;) { //to continue the application

			System.out.print("Please enter the operation: \n");
			System.out.println("\n1. Reserve a new empty seat.\n2. Delete a reserved seat.\n"
					+ "3. Delete all reserved seats.\n4. Print out flight seats map.\n" + "5. Quit.\n");
			System.out.print("Operation number: ");
			x = input.nextInt();
			///////////////////////////////////////////////////////////////////////////////////////////////
			while (x != 1 && x != 2 && x != 3 && x != 4 && x != 5) {
				System.out.println("-------------------------------------------\n");
				System.out.println("Wrong entered !!!!");
				System.out.println("You should enter one of these operation :)");
				System.out.println("\n1. Reserve a new empty seat.\n2. Delete a reserved seat.\n"
						+ "3. Delete all reserved seats.\n4. Print out flight seats map.\n" + "5. Quit.\n");
				System.out.print("Please re-enter operation number: ");
				x = input.nextInt();
			}
			if (x == 5) { //to close application
				System.out.println("----------------------------------------------");
				System.out.println("\nThe program is closed.");
				System.out.println("\n============================================================");
				break;
			}
			// 100////////////////////////////////////////////////////////////////////////////
			else {
				switch (x) {
				case 1: { // to add seat
					int num_seat;
					System.out.println("----------------------------------------------");
					System.out.println("\nThe seats:\n  11,  12," + "  21,  22,  31,  32,  41,  42,  43, 44,"
							+ " 51,  52, 53, 54,\n  61,  62, 63, 64, 71, 72,"
							+ " 73, 74, 81, 82, 83, 84, 91, 92, 93, 94\n");
					System.out.print("Please choose a valid seat number to reserved it: ");
					num_seat = input.nextInt();

					while (num_seat != 11 && num_seat != 12 && num_seat != 21 && num_seat != 22 && num_seat != 31 //to know if its valid
							&& num_seat != 32 && num_seat != 41 && num_seat != 42 && num_seat != 43 && num_seat != 44
							&& num_seat != 51 && num_seat != 52 && num_seat != 53 && num_seat != 54 && num_seat != 61
							&& num_seat != 62 && num_seat != 63 && num_seat != 64 && num_seat != 71 && num_seat != 72
							&& num_seat != 73 && num_seat != 74 && num_seat != 81 && num_seat != 82 && num_seat != 83
							&& num_seat != 84 && num_seat != 91 && num_seat != 92 && num_seat != 93 && num_seat != 94) {
						System.out.println("-------------------------------------------");
						System.out.println("\nWrong entered !!!!");
						System.out.println("You should enter a valid seat number from these seats :)");
						System.out.println("\nThe seats:\n  11,  12," + "  21,  22,  31,  32,  41,  42,  43, 44,"
								+ " 51,  52, 53, 54,\n  61, 62, 63, 64, 71, 72,"
								+ " 73, 74, 81, 82, 83, 84, 91, 92, 93, 94\n");
						System.out.print("Please re-enter a valid seat: ");
						num_seat = input.nextInt();
					}

					while ((num_seat == 11 && seatnumber[0][0].isValid() != false)
							|| (num_seat == 12 && seatnumber[0][1].isValid() != false)
							|| (num_seat == 21 && seatnumber[1][0].isValid() != false)
							|| (num_seat == 22 && seatnumber[1][1].isValid() != false)
							|| (num_seat == 31 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 32 && seatnumber[2][1].isValid() != false)
							|| (num_seat == 41 && seatnumber[3][0].isValid() != false)
							|| (num_seat == 42 && seatnumber[3][1].isValid() != false)
							|| (num_seat == 43 && seatnumber[3][2].isValid() != false)
							|| (num_seat == 44 && seatnumber[3][3].isValid() != false)
							|| (num_seat == 51 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 52 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 53 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 54 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 61 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 62 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 63 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 64 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 71 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 72 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 73 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 74 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 81 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 82 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 83 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 84 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 91 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 92 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 93 && seatnumber[2][0].isValid() != false)
							|| (num_seat == 94 && seatnumber[2][0].isValid() != false)) {
						System.out.println("--------------------------------------------");
						System.out.println("\nIts not valid seat (not empty seat) !!!!"); 
						System.out.println("\nThe seats:\n  11,  12," + "  21,  22,  31,  32,  41,  42,  43, 44,"
								+ " 51,  52, 53, 54,\n  61, 62, 63, 64, 71, 72,"
								+ " 73, 74, 81, 82, 83, 84, 91, 92, 93, 94\n");
						System.out.print("Please re-enter another valid seat (empty seat ): ");
						num_seat = input.nextInt();
					}
					
					while (num_seat != 11 && num_seat != 12 && num_seat != 21 && num_seat != 22 && num_seat != 31
							&& num_seat != 32 && num_seat != 41 && num_seat != 42 && num_seat != 43 && num_seat != 44
							&& num_seat != 51 && num_seat != 52 && num_seat != 53 && num_seat != 54 && num_seat != 61
							&& num_seat != 62 && num_seat != 63 && num_seat != 64 && num_seat != 71 && num_seat != 72
							&& num_seat != 73 && num_seat != 74 && num_seat != 81 && num_seat != 82 && num_seat != 83
							&& num_seat != 84 && num_seat != 91 && num_seat != 92 && num_seat != 93 && num_seat != 94) {
						System.out.println("-------------------------------------------");
						System.out.println("\nWrong entered !!!!");
						System.out.println("You should enter a valid seat number from these seats :)");
						System.out.println("\nThe seats:\n  11,  12," + "  21,  22,  31,  32,  41,  42,  43, 44,"
								+ " 51,  52, 53, 54,\n  61, 62, 63, 64, 71, 72,"
								+ " 73, 74, 81, 82, 83, 84, 91, 92, 93, 94\n");
						System.out.print("Please re-enter a valid seat: ");
						num_seat = input.nextInt();
					}

//100////////////
					System.out.println(" ");
					switch (num_seat) {

					case 11: {
						seatnumber[0][0].setResrved(true);
						System.out.println("You reserved the seat number 11 succefully :)");
						break;
					}
					case 12: {
						seatnumber[0][1].setResrved(true);
						System.out.println("You reserved the seat number 12 succefully :)");
						break;
					}
					case 21: {
						seatnumber[1][0].setResrved(true);
						System.out.println("You reserved the seat number 21 succefully :)");
						break;
					}
					case 22: {
						seatnumber[1][1].setResrved(true);
						System.out.println("You reserved the seat number 22 succefully :)");
						break;
					}
					case 31: {
						seatnumber[2][0].setResrved(true);
						System.out.println("You reserved the seat number 31 succefully :)");
						break;
					}
					case 32: {
						seatnumber[2][1].setResrved(true);
						System.out.println("You reserved the seat number 32 succefully :)");
						break;
					}
					case 41: {
						seatnumber[3][0].setResrved(true);
						System.out.println("You reserved the seat number 41 succefully :)");
						break;
					}
					case 42: {
						seatnumber[3][1].setResrved(true);
						System.out.println("You reserved the seat number 42 succefully :)");
						break;
					}
					case 43: {
						seatnumber[3][2].setResrved(true);
						System.out.println("You reserved the seat number 43 succefully :)");
						break;
					}
					case 44: {
						seatnumber[3][3].setResrved(true);
						System.out.println("You reserved the seat number 44 succefully :)");
						break;
					}
					case 51: {
						seatnumber[4][0].setResrved(true);
						System.out.println("You reserved the seat number 51 succefully :)");
						break;
					}
					case 52: {
						seatnumber[4][1].setResrved(true);
						System.out.println("You reserved the seat number 52 succefully :)");
						break;
					}
					case 53: {
						seatnumber[4][2].setResrved(true);
						System.out.println("You reserved the seat number 53 succefully :)");
						break;
					}
					case 54: {
						seatnumber[4][3].setResrved(true);
						System.out.println("You reserved the seat number 54 succefully :)");
						break;
					}
					case 61: {
						seatnumber[5][0].setResrved(true);
						System.out.println("You reserved the seat number 61 succefully :)");
						break;
					}
					case 62: {
						seatnumber[5][1].setResrved(true);
						System.out.println("You reserved the seat number 62 succefully :)");
						break;
					}
					case 63: {
						seatnumber[5][2].setResrved(true);
						System.out.println("You reserved the seat number 63 succefully :)");
						break;
					}
					case 64: {
						seatnumber[5][3].setResrved(true);
						System.out.println("You reserved the seat number 64 succefully :)");
						break;
					}
					case 71: {
						seatnumber[6][0].setResrved(true);
						System.out.println("You reserved the seat number 71 succefully :)");
						break;
					}
					case 72: {
						seatnumber[6][1].setResrved(true);
						System.out.println("You reserved the seat number 72 succefully :)");
						break;
					}
					case 73: {
						seatnumber[6][2].setResrved(true);
						System.out.println("You reserved the seat number 73 succefully :)");
						break;
					}
					case 74: {
						seatnumber[6][3].setResrved(true);
						System.out.println("You reserved the seat number 74 succefully :)");
						break;
					}
					case 81: {
						seatnumber[7][0].setResrved(true);
						System.out.println("You reserved the seat number 81 succefully :)");
						break;
					}
					case 82: {
						seatnumber[7][1].setResrved(true);
						System.out.println("You reserved the seat number 82 succefully :)");
						break;
					}
					case 83: {
						seatnumber[7][2].setResrved(true);
						System.out.println("You reserved the seat number 83 succefully :)");
						break;
					}
					case 84: {
						seatnumber[7][3].setResrved(true);
						System.out.println("You reserved the seat number 84 succefully :)");
						break;
					}
					case 91: {
						seatnumber[8][0].setResrved(true);
						System.out.println("You reserved the seat number 91 succefully :)");
						break;
					}
					case 92: {
						seatnumber[8][1].setResrved(true);
						System.out.println("You reserved the seat number 92 succefully :)");
						break;
					}
					case 93: {
						seatnumber[8][2].setResrved(true);
						System.out.println("You reserved the seat number 93 succefully :)");
						break;
					}
					case 94: {
						seatnumber[8][3].setResrved(true);
						System.out.println("You reserved the seat number 94 succefully :)");
						break;
					}
					}
					System.out.println("-------------------------------------------\n");
					break;
				}

				//////////////////////////////////////////////////////////////////////////
				case 2: { //to delete the seat
					if ((seatnumber[0][0].isValid() == false) && (seatnumber[0][1].isValid() == false)
							&& (seatnumber[1][0].isValid() == false) && (seatnumber[1][1].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][1].isValid() == false)
							&& (seatnumber[3][0].isValid() == false) && (seatnumber[3][1].isValid() == false)
							&& (seatnumber[3][2].isValid() == false) && (seatnumber[3][3].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)) {
						int y;
						System.out.println("\nAll the seats are empty !!!");
						System.out.print("Do you want to reserve a new seat ?\n1. Yes, 2. No\n\nChoice number: ");
						y = input.nextInt();
						switch (y) {
						case 1: {
							int num_seat;
							System.out.println("----------------------------------------------");
							System.out.println("\nThe seats:\n  11,  12," + "  21,  22,  31,  32,  41,  42,  43, 44,"
									+ " 51,  52, 53, 54,\n  61,  62, 63, 64, 71, 72,"
									+ " 73, 74, 81, 82, 83, 84, 91, 92, 93, 94\n");
							System.out.print("Please choose a valid seat number to reserved it: ");
							num_seat = input.nextInt();

							while (num_seat != 11 && num_seat != 12 && num_seat != 21 && num_seat != 22
									&& num_seat != 31 && num_seat != 32 && num_seat != 41 && num_seat != 42
									&& num_seat != 43 && num_seat != 44 && num_seat != 51 && num_seat != 52
									&& num_seat != 53 && num_seat != 54 && num_seat != 61 && num_seat != 62
									&& num_seat != 63 && num_seat != 64 && num_seat != 71 && num_seat != 72
									&& num_seat != 73 && num_seat != 74 && num_seat != 81 && num_seat != 82
									&& num_seat != 83 && num_seat != 84 && num_seat != 91 && num_seat != 92
									&& num_seat != 93 && num_seat != 94) {
								System.out.println("-------------------------------------------");
								System.out.println("\nWrong entered !!!!");
								System.out.println("You should enter a valid seat number from these seats :)");
								System.out
										.println("\nThe seats:\n  11,  12," + "  21,  22,  31,  32,  41,  42,  43, 44,"
												+ " 51,  52, 53, 54,\n  61, 62, 63, 64, 71, 72,"
												+ " 73, 74, 81, 82, 83, 84, 91, 92, 93, 94\n");
								System.out.print("Please re-enter a valid seat: ");
								num_seat = input.nextInt();
							}

							while ((num_seat == 11 && seatnumber[0][0].isValid() != false)
									|| (num_seat == 12 && seatnumber[0][1].isValid() != false)
									|| (num_seat == 21 && seatnumber[1][0].isValid() != false)
									|| (num_seat == 22 && seatnumber[1][1].isValid() != false)
									|| (num_seat == 31 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 32 && seatnumber[2][1].isValid() != false)
									|| (num_seat == 41 && seatnumber[3][0].isValid() != false)
									|| (num_seat == 42 && seatnumber[3][1].isValid() != false)
									|| (num_seat == 43 && seatnumber[3][2].isValid() != false)
									|| (num_seat == 44 && seatnumber[3][3].isValid() != false)
									|| (num_seat == 51 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 52 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 53 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 54 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 61 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 62 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 63 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 64 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 71 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 72 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 73 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 74 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 81 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 82 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 83 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 84 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 91 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 92 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 93 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 94 && seatnumber[2][0].isValid() != false)) {
								System.out.println("--------------------------------------------");
								System.out.println("\nIts not valid seat (not empty seat) !!!!");
								System.out
										.println("\nThe seats:\n  11,  12," + "  21,  22,  31,  32,  41,  42,  43, 44,"
												+ " 51,  52, 53, 54,\n  61, 62, 63, 64, 71, 72,"
												+ " 73, 74, 81, 82, 83, 84, 91, 92, 93, 94\n");
								System.out.print("Please re-enter another valid seat (empty seat): ");
								num_seat = input.nextInt();
							}
							
							while (num_seat != 11 && num_seat != 12 && num_seat != 21 && num_seat != 22 && num_seat != 31
									&& num_seat != 32 && num_seat != 41 && num_seat != 42 && num_seat != 43 && num_seat != 44
									&& num_seat != 51 && num_seat != 52 && num_seat != 53 && num_seat != 54 && num_seat != 61
									&& num_seat != 62 && num_seat != 63 && num_seat != 64 && num_seat != 71 && num_seat != 72
									&& num_seat != 73 && num_seat != 74 && num_seat != 81 && num_seat != 82 && num_seat != 83
									&& num_seat != 84 && num_seat != 91 && num_seat != 92 && num_seat != 93 && num_seat != 94) {
								System.out.println("-------------------------------------------");
								System.out.println("\nWrong entered !!!!");
								System.out.println("You should enter a valid seat number from these seats :)");
								System.out.println("\nThe seats:\n  11,  12," + "  21,  22,  31,  32,  41,  42,  43, 44,"
										+ " 51,  52, 53, 54,\n  61, 62, 63, 64, 71, 72,"
										+ " 73, 74, 81, 82, 83, 84, 91, 92, 93, 94\n");
								System.out.print("Please re-enter a valid seat: ");
								num_seat = input.nextInt();
							}

							// 100////////////
							System.out.println(" ");
							switch (num_seat) {

							case 11: {
								seatnumber[0][0].setResrved(true);
								System.out.println("You reserved the seat number 11 succefully :)");
								break;
							}
							case 12: {
								seatnumber[0][1].setResrved(true);
								System.out.println("You reserved the seat number 12 succefully :)");
								break;
							}
							case 21: {
								seatnumber[1][0].setResrved(true);
								System.out.println("You reserved the seat number 21 succefully :)");
								break;
							}
							case 22: {
								seatnumber[1][1].setResrved(true);
								System.out.println("You reserved the seat number 22 succefully :)");
								break;
							}
							case 31: {
								seatnumber[2][0].setResrved(true);
								System.out.println("You reserved the seat number 31 succefully :)");
								break;
							}
							case 32: {
								seatnumber[2][1].setResrved(true);
								System.out.println("You reserved the seat number 32 succefully :)");
								break;
							}
							case 41: {
								seatnumber[3][0].setResrved(true);
								System.out.println("You reserved the seat number 41 succefully :)");
								break;
							}
							case 42: {
								seatnumber[3][1].setResrved(true);
								System.out.println("You reserved the seat number 42 succefully :)");
								break;
							}
							case 43: {
								seatnumber[3][2].setResrved(true);
								System.out.println("You reserved the seat number 43 succefully :)");
								break;
							}
							case 44: {
								seatnumber[3][3].setResrved(true);
								System.out.println("You reserved the seat number 44 succefully :)");
								break;
							}
							case 51: {
								seatnumber[4][0].setResrved(true);
								System.out.println("You reserved the seat number 51 succefully :)");
								break;
							}
							case 52: {
								seatnumber[4][1].setResrved(true);
								System.out.println("You reserved the seat number 52 succefully :)");
								break;
							}
							case 53: {
								seatnumber[4][2].setResrved(true);
								System.out.println("You reserved the seat number 53 succefully :)");
								break;
							}
							case 54: {
								seatnumber[4][3].setResrved(true);
								System.out.println("You reserved the seat number 54 succefully :)");
								break;
							}
							case 61: {
								seatnumber[5][0].setResrved(true);
								System.out.println("You reserved the seat number 61 succefully :)");
								break;
							}
							case 62: {
								seatnumber[5][1].setResrved(true);
								System.out.println("You reserved the seat number 62 succefully :)");
								break;
							}
							case 63: {
								seatnumber[5][2].setResrved(true);
								System.out.println("You reserved the seat number 63 succefully :)");
								break;
							}
							case 64: {
								seatnumber[5][3].setResrved(true);
								System.out.println("You reserved the seat number 64 succefully :)");
								break;
							}
							case 71: {
								seatnumber[6][0].setResrved(true);
								System.out.println("You reserved the seat number 71 succefully :)");
								break;
							}
							case 72: {
								seatnumber[6][1].setResrved(true);
								System.out.println("You reserved the seat number 72 succefully :)");
								break;
							}
							case 73: {
								seatnumber[6][2].setResrved(true);
								System.out.println("You reserved the seat number 73 succefully :)");
								break;
							}
							case 74: {
								seatnumber[6][3].setResrved(true);
								System.out.println("You reserved the seat number 74 succefully :)");
								break;
							}
							case 81: {
								seatnumber[7][0].setResrved(true);
								System.out.println("You reserved the seat number 81 succefully :)");
								break;
							}
							case 82: {
								seatnumber[7][1].setResrved(true);
								System.out.println("You reserved the seat number 82 succefully :)");
								break;
							}
							case 83: {
								seatnumber[7][2].setResrved(true);
								System.out.println("You reserved the seat number 83 succefully :)");
								break;
							}
							case 84: {
								seatnumber[7][3].setResrved(true);
								System.out.println("You reserved the seat number 84 succefully :)");
								break;
							}
							case 91: {
								seatnumber[8][0].setResrved(true);
								System.out.println("You reserved the seat number 91 succefully :)");
								break;
							}
							case 92: {
								seatnumber[8][1].setResrved(true);
								System.out.println("You reserved the seat number 92 succefully :)");
								break;
							}
							case 93: {
								seatnumber[8][2].setResrved(true);
								System.out.println("You reserved the seat number 93 succefully :)");
								break;
							}
							case 94: {
								seatnumber[8][3].setResrved(true);
								System.out.println("You reserved the seat number 94 succefully :)");
								break;
							}
							}
							System.out.println("-------------------------------------------\n");
							break;
						}

						case 2: {
							System.out.println("\nDone :)");
							System.out.println("-------------------------------------------\n");
							break;
						}
						}
						break;
					} else {
						int num_seat;
						System.out.println("\nThe seats:\n  11,  12," + "  21,  22,  31,  32,  41,  42,  43, 44,"
								+ " 51,  52, 53, 54,\n  61,  62, 63, 64, 71, 72,"
								+ " 73, 74, 81, 82, 83, 84, 91, 92, 93, 94\n");
						System.out.print("Please choose the seat you want to delete: ");
						num_seat = input.nextInt();
						while (num_seat != 11 && num_seat != 12 && num_seat != 21 && num_seat != 22 && num_seat != 31
								&& num_seat != 32 && num_seat != 41 && num_seat != 42 && num_seat != 43
								&& num_seat != 44 && num_seat != 51 && num_seat != 52 && num_seat != 53
								&& num_seat != 54 && num_seat != 61 && num_seat != 62 && num_seat != 63
								&& num_seat != 64 && num_seat != 71 && num_seat != 72 && num_seat != 73
								&& num_seat != 74 && num_seat != 81 && num_seat != 82 && num_seat != 83
								&& num_seat != 84 && num_seat != 91 && num_seat != 92 && num_seat != 93
								&& num_seat != 94) {
							System.out.println("-------------------------------------------");
							System.out.println("\nWrong entered !!!!");
							System.out.println("You should enter a valid seat number from these seats :)");
							System.out.println("\nThe seats:\n  11,  12," + "  21,  22,  31,  32,  41,  42,  43, 44,"
									+ " 51,  52, 53, 54,\n  61, 62, 63, 64, 71, 72,"
									+ " 73, 74, 81, 82, 83, 84, 91, 92, 93, 94\n");
							System.out.print("Please re-enter a valid seat: ");
							num_seat = input.nextInt();
						}
						while ((num_seat == 11 && seatnumber[0][0].isValid() == false)
								|| (num_seat == 12 && seatnumber[0][1].isValid() == false)
								|| (num_seat == 21 && seatnumber[1][0].isValid() == false)
								|| (num_seat == 22 && seatnumber[1][1].isValid() == false)
								|| (num_seat == 31 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 32 && seatnumber[2][1].isValid() == false)
								|| (num_seat == 41 && seatnumber[3][0].isValid() == false)
								|| (num_seat == 42 && seatnumber[3][1].isValid() == false)
								|| (num_seat == 43 && seatnumber[3][2].isValid() == false)
								|| (num_seat == 44 && seatnumber[3][3].isValid() == false)
								|| (num_seat == 51 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 52 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 53 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 54 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 61 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 62 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 63 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 64 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 71 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 72 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 73 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 74 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 81 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 82 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 83 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 84 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 91 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 92 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 93 && seatnumber[2][0].isValid() == false)
								|| (num_seat == 94 && seatnumber[2][0].isValid() == false)) {
							System.out.println("--------------------------------------------");
							;
							System.out.println("\nIts not valid seat (it's empty)!!!!");
							System.out.println("\nThe seats:\n  11,  12," + "  21,  22,  31,  32,  41,  42,  43, 44,"
									+ " 51,  52, 53, 54,\n  61, 62, 63, 64, 71, 72,"
									+ " 73, 74, 81, 82, 83, 84, 91, 92, 93, 94\n");
							System.out.print("Please re-enter another valid seat to delete (not empty): ");
							num_seat = input.nextInt();
						}
						
						while (num_seat != 11 && num_seat != 12 && num_seat != 21 && num_seat != 22 && num_seat != 31
								&& num_seat != 32 && num_seat != 41 && num_seat != 42 && num_seat != 43 && num_seat != 44
								&& num_seat != 51 && num_seat != 52 && num_seat != 53 && num_seat != 54 && num_seat != 61
								&& num_seat != 62 && num_seat != 63 && num_seat != 64 && num_seat != 71 && num_seat != 72
								&& num_seat != 73 && num_seat != 74 && num_seat != 81 && num_seat != 82 && num_seat != 83
								&& num_seat != 84 && num_seat != 91 && num_seat != 92 && num_seat != 93 && num_seat != 94) {
							System.out.println("-------------------------------------------");
							System.out.println("\nWrong entered !!!!");
							System.out.println("You should enter a valid seat number from these seats :)");
							System.out.println("\nThe seats:\n  11,  12," + "  21,  22,  31,  32,  41,  42,  43, 44,"
									+ " 51,  52, 53, 54,\n  61, 62, 63, 64, 71, 72,"
									+ " 73, 74, 81, 82, 83, 84, 91, 92, 93, 94\n");
							System.out.print("Please re-enter a valid seat: ");
							num_seat = input.nextInt();
						}
						System.out.println(" ");

						switch (num_seat) {

						case 11: {
							seatnumber[0][0].setResrved(false);
							System.out.println("you delete the reserved seat number 11 succefully :)");
							break;
						}
						case 12: {
							seatnumber[0][1].setResrved(false);
							System.out.println("you delete the reserved seat number 12 succefully :)");
							break;
						}
						case 21: {
							seatnumber[1][0].setResrved(false);
							System.out.println("you delete the reserved seat number 21 succefully :)");
							break;
						}
						case 22: {
							seatnumber[1][1].setResrved(false);
							System.out.println("you delete the reserved seat number 22 succefully :)");
							break;
						}
						case 31: {
							seatnumber[2][0].setResrved(false);
							System.out.println("you delete the reserved seat number 31 succefully :)");
							break;
						}
						case 32: {
							seatnumber[2][1].setResrved(false);
							System.out.println("you delete the reserved seat number 32 succefully :)");
							break;
						}
						case 41: {
							seatnumber[3][0].setResrved(false);
							System.out.println("you delete the reserved seat number 41 succefully :)");
							break;
						}
						case 42: {
							seatnumber[3][1].setResrved(false);
							System.out.println("you delete the reserved seat number 42 succefully :)");
							break;
						}
						case 43: {
							seatnumber[3][2].setResrved(false);
							System.out.println("you delete the reserved seat number 43 succefully :)");
							break;
						}
						case 44: {
							seatnumber[3][3].setResrved(false);
							System.out.println("you delete the reserved seat number 44 succefully :)");
							break;
						}
						case 51: {
							seatnumber[4][0].setResrved(false);
							System.out.println("you delete the reserved seat number 51 succefully :)");
							break;
						}
						case 52: {
							seatnumber[4][1].setResrved(false);
							System.out.println("you delete the reserved seat number 52 succefully :)");
							break;
						}
						case 53: {
							seatnumber[4][2].setResrved(false);
							System.out.println("you delete the reserved seat number 53 succefully :)");
							break;
						}
						case 54: {
							seatnumber[4][3].setResrved(false);
							System.out.println("you delete the reserved seat number 54 succefully :)");
							break;
						}
						case 61: {
							seatnumber[5][0].setResrved(false);
							System.out.println("you delete the reserved seat number 61 succefully :)");
							break;
						}
						case 62: {
							seatnumber[5][1].setResrved(false);
							System.out.println("you delete the reserved seat number 62 succefully :)");
							break;
						}
						case 63: {
							seatnumber[5][2].setResrved(false);
							System.out.println("you delete the reserved seat number 63 succefully :)");
							break;
						}
						case 64: {
							seatnumber[5][3].setResrved(false);
							System.out.println("you delete the reserved seat number 64 succefully :)");
							break;
						}
						case 71: {
							seatnumber[6][0].setResrved(false);
							System.out.println("you delete the reserved seat number 71 succefully :)");
							break;
						}
						case 72: {
							seatnumber[6][1].setResrved(false);
							System.out.println("you delete the reserved seat number 72 succefully :)");
							break;
						}
						case 73: {
							seatnumber[6][2].setResrved(false);
							System.out.println("you delete the reserved seat number 73 succefully :)");
							break;
						}
						case 74: {
							seatnumber[6][3].setResrved(false);
							System.out.println("you delete the reserved seat number 74 succefully :)");
							break;
						}
						case 81: {
							seatnumber[7][0].setResrved(false);
							System.out.println("you delete the reserved seat number 81 succefully :)");
							break;
						}
						case 82: {
							seatnumber[7][1].setResrved(false);
							System.out.println("you delete the reserved seat number 82 succefully :)");
							break;
						}
						case 83: {
							seatnumber[7][2].setResrved(false);
							System.out.println("you delete the reserved seat number 83 succefully :)");
							break;
						}
						case 84: {
							seatnumber[7][3].setResrved(false);
							System.out.println("you delete the reserved seat number 84 succefully :)");
							break;
						}
						case 91: {
							seatnumber[8][0].setResrved(false);
							System.out.println("you delete the reserved seat number 91 succefully :)");
							break;
						}
						case 92: {
							seatnumber[8][1].setResrved(false);
							System.out.println("you delete the reserved seat number 92 succefully :)");
							break;
						}
						case 93: {
							seatnumber[8][2].setResrved(false);
							System.out.println("you delete the reserved seat number 93 succefully :)");
							break;
						}
						case 94: {
							seatnumber[8][3].setResrved(false);
							System.out.println("you delete the reserved seat number 94 succefully :)");
							break;
						}

						}
						System.out.println("-------------------------------------------\n");
						break;
					}
				}

				//////////// ppppp///////////////////////////////////////////////////////pp///

				case 3: { //to delete all seat
					System.out.println("----------------------------------------------");

					if ((seatnumber[0][0].isValid() == false) && (seatnumber[0][1].isValid() == false)
							&& (seatnumber[1][0].isValid() == false) && (seatnumber[1][1].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][1].isValid() == false)
							&& (seatnumber[3][0].isValid() == false) && (seatnumber[3][1].isValid() == false)
							&& (seatnumber[3][2].isValid() == false) && (seatnumber[3][3].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)
							&& (seatnumber[2][0].isValid() == false) && (seatnumber[2][0].isValid() == false)) {
						int y;
						System.out.println("\nAll the seats are empty !!!");
						System.out.print("Do you want to reserve a new seat ?\n1. Yes, 2. No\n\nChoice number: ");
						y = input.nextInt();
						switch (y) {
						case 1: {
							int num_seat;
							System.out.println("----------------------------------------------");
							System.out.println("\nThe seats:\n  11,  12," + "  21,  22,  31,  32,  41,  42,  43, 44,"
									+ " 51,  52, 53, 54,\n  61,  62, 63, 64, 71, 72,"
									+ " 73, 74, 81, 82, 83, 84, 91, 92, 93, 94\n");
							System.out.print("Please choose a valid seat number to reserved it: ");
							num_seat = input.nextInt();

							while (num_seat != 11 && num_seat != 12 && num_seat != 21 && num_seat != 22
									&& num_seat != 31 && num_seat != 32 && num_seat != 41 && num_seat != 42
									&& num_seat != 43 && num_seat != 44 && num_seat != 51 && num_seat != 52
									&& num_seat != 53 && num_seat != 54 && num_seat != 61 && num_seat != 62
									&& num_seat != 63 && num_seat != 64 && num_seat != 71 && num_seat != 72
									&& num_seat != 73 && num_seat != 74 && num_seat != 81 && num_seat != 82
									&& num_seat != 83 && num_seat != 84 && num_seat != 91 && num_seat != 92
									&& num_seat != 93 && num_seat != 94) {
								System.out.println("-------------------------------------------");
								System.out.println("\nWrong entered !!!!");
								System.out.println("You should enter a valid seat number from these seats :)");
								System.out
										.println("\nThe seats:\n  11,  12," + "  21,  22,  31,  32,  41,  42,  43, 44,"
												+ " 51,  52, 53, 54,\n  61, 62, 63, 64, 71, 72,"
												+ " 73, 74, 81, 82, 83, 84, 91, 92, 93, 94\n");
								System.out.print("Please re-enter a valid seat: ");
								num_seat = input.nextInt();
							}

							while ((num_seat == 11 && seatnumber[0][0].isValid() != false)
									|| (num_seat == 12 && seatnumber[0][1].isValid() != false)
									|| (num_seat == 21 && seatnumber[1][0].isValid() != false)
									|| (num_seat == 22 && seatnumber[1][1].isValid() != false)
									|| (num_seat == 31 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 32 && seatnumber[2][1].isValid() != false)
									|| (num_seat == 41 && seatnumber[3][0].isValid() != false)
									|| (num_seat == 42 && seatnumber[3][1].isValid() != false)
									|| (num_seat == 43 && seatnumber[3][2].isValid() != false)
									|| (num_seat == 44 && seatnumber[3][3].isValid() != false)
									|| (num_seat == 51 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 52 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 53 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 54 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 61 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 62 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 63 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 64 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 71 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 72 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 73 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 74 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 81 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 82 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 83 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 84 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 91 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 92 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 93 && seatnumber[2][0].isValid() != false)
									|| (num_seat == 94 && seatnumber[2][0].isValid() != false)) {
								System.out.println("--------------------------------------------");
								System.out.println("\nIts not valid seat (not empty seat) !!!!");
								System.out
										.println("\nThe seats:\n  11,  12," + "  21,  22,  31,  32,  41,  42,  43, 44,"
												+ " 51,  52, 53, 54,\n  61, 62, 63, 64, 71, 72,"
												+ " 73, 74, 81, 82, 83, 84, 91, 92, 93, 94\n");
								System.out.print("Please re-enter another valid seat (empty seat): ");
								num_seat = input.nextInt();
							}
							
							while (num_seat != 11 && num_seat != 12 && num_seat != 21 && num_seat != 22 && num_seat != 31
									&& num_seat != 32 && num_seat != 41 && num_seat != 42 && num_seat != 43 && num_seat != 44
									&& num_seat != 51 && num_seat != 52 && num_seat != 53 && num_seat != 54 && num_seat != 61
									&& num_seat != 62 && num_seat != 63 && num_seat != 64 && num_seat != 71 && num_seat != 72
									&& num_seat != 73 && num_seat != 74 && num_seat != 81 && num_seat != 82 && num_seat != 83
									&& num_seat != 84 && num_seat != 91 && num_seat != 92 && num_seat != 93 && num_seat != 94) {
								System.out.println("-------------------------------------------");
								System.out.println("\nWrong entered !!!!");
								System.out.println("You should enter a valid seat number from these seats :)");
								System.out.println("\nThe seats:\n  11,  12," + "  21,  22,  31,  32,  41,  42,  43, 44,"
										+ " 51,  52, 53, 54,\n  61, 62, 63, 64, 71, 72,"
										+ " 73, 74, 81, 82, 83, 84, 91, 92, 93, 94\n");
								System.out.print("Please re-enter a valid seat: ");
								num_seat = input.nextInt();
							}
							// 100////////////
							System.out.println(" ");
							switch (num_seat) {

							case 11: {
								seatnumber[0][0].setResrved(true);
								System.out.println("You reserved the seat number 11 succefully :)");
								break;
							}
							case 12: {
								seatnumber[0][1].setResrved(true);
								System.out.println("You reserved the seat number 12 succefully :)");
								break;
							}
							case 21: {
								seatnumber[1][0].setResrved(true);
								System.out.println("You reserved the seat number 21 succefully :)");
								break;
							}
							case 22: {
								seatnumber[1][1].setResrved(true);
								System.out.println("You reserved the seat number 22 succefully :)");
								break;
							}
							case 31: {
								seatnumber[2][0].setResrved(true);
								System.out.println("You reserved the seat number 31 succefully :)");
								break;
							}
							case 32: {
								seatnumber[2][1].setResrved(true);
								System.out.println("You reserved the seat number 32 succefully :)");
								break;
							}
							case 41: {
								seatnumber[3][0].setResrved(true);
								System.out.println("You reserved the seat number 41 succefully :)");
								break;
							}
							case 42: {
								seatnumber[3][1].setResrved(true);
								System.out.println("You reserved the seat number 42 succefully :)");
								break;
							}
							case 43: {
								seatnumber[3][2].setResrved(true);
								System.out.println("You reserved the seat number 43 succefully :)");
								break;
							}
							case 44: {
								seatnumber[3][3].setResrved(true);
								System.out.println("You reserved the seat number 44 succefully :)");
								break;
							}
							case 51: {
								seatnumber[4][0].setResrved(true);
								System.out.println("You reserved the seat number 51 succefully :)");
								break;
							}
							case 52: {
								seatnumber[4][1].setResrved(true);
								System.out.println("You reserved the seat number 52 succefully :)");
								break;
							}
							case 53: {
								seatnumber[4][2].setResrved(true);
								System.out.println("You reserved the seat number 53 succefully :)");
								break;
							}
							case 54: {
								seatnumber[4][3].setResrved(true);
								System.out.println("You reserved the seat number 54 succefully :)");
								break;
							}
							case 61: {
								seatnumber[5][0].setResrved(true);
								System.out.println("You reserved the seat number 61 succefully :)");
								break;
							}
							case 62: {
								seatnumber[5][1].setResrved(true);
								System.out.println("You reserved the seat number 62 succefully :)");
								break;
							}
							case 63: {
								seatnumber[5][2].setResrved(true);
								System.out.println("You reserved the seat number 63 succefully :)");
								break;
							}
							case 64: {
								seatnumber[5][3].setResrved(true);
								System.out.println("You reserved the seat number 64 succefully :)");
								break;
							}
							case 71: {
								seatnumber[6][0].setResrved(true);
								System.out.println("You reserved the seat number 71 succefully :)");
								break;
							}
							case 72: {
								seatnumber[6][1].setResrved(true);
								System.out.println("You reserved the seat number 72 succefully :)");
								break;
							}
							case 73: {
								seatnumber[6][2].setResrved(true);
								System.out.println("You reserved the seat number 73 succefully :)");
								break;
							}
							case 74: {
								seatnumber[6][3].setResrved(true);
								System.out.println("You reserved the seat number 74 succefully :)");
								break;
							}
							case 81: {
								seatnumber[7][0].setResrved(true);
								System.out.println("You reserved the seat number 81 succefully :)");
								break;
							}
							case 82: {
								seatnumber[7][1].setResrved(true);
								System.out.println("You reserved the seat number 82 succefully :)");
								break;
							}
							case 83: {
								seatnumber[7][2].setResrved(true);
								System.out.println("You reserved the seat number 83 succefully :)");
								break;
							}
							case 84: {
								seatnumber[7][3].setResrved(true);
								System.out.println("You reserved the seat number 84 succefully :)");
								break;
							}
							case 91: {
								seatnumber[8][0].setResrved(true);
								System.out.println("You reserved the seat number 91 succefully :)");
								break;
							}
							case 92: {
								seatnumber[8][1].setResrved(true);
								System.out.println("You reserved the seat number 92 succefully :)");
								break;
							}
							case 93: {
								seatnumber[8][2].setResrved(true);
								System.out.println("You reserved the seat number 93 succefully :)");
								break;
							}
							case 94: {
								seatnumber[8][3].setResrved(true);
								System.out.println("You reserved the seat number 94 succefully :)");
								break;
							}
							}
							break;
						}

						case 2: {
							System.out.println("\nDone :)");
							break;
						}
						}
						System.out.println("-------------------------------------------\n");
						break;
					} else {
						seatnumber[0][0].setResrved(false);
						seatnumber[0][1].setResrved(false);
						seatnumber[1][0].setResrved(false);
						seatnumber[1][1].setResrved(false);
						seatnumber[2][0].setResrved(false);
						seatnumber[2][1].setResrved(false);
						seatnumber[3][0].setResrved(false);
						seatnumber[3][1].setResrved(false);
						seatnumber[3][2].setResrved(false);
						seatnumber[3][3].setResrved(false);
						seatnumber[4][0].setResrved(false);
						seatnumber[4][1].setResrved(false);
						seatnumber[4][2].setResrved(false);
						seatnumber[4][3].setResrved(false);
						seatnumber[5][0].setResrved(false);
						seatnumber[5][1].setResrved(false);
						seatnumber[5][2].setResrved(false);
						seatnumber[5][3].setResrved(false);
						seatnumber[6][0].setResrved(false);
						seatnumber[6][1].setResrved(false);
						seatnumber[6][2].setResrved(false);
						seatnumber[6][3].setResrved(false);
						seatnumber[7][0].setResrved(false);
						seatnumber[7][1].setResrved(false);
						seatnumber[7][2].setResrved(false);
						seatnumber[7][3].setResrved(false);
						seatnumber[8][0].setResrved(false);
						seatnumber[8][1].setResrved(false);
						seatnumber[8][2].setResrved(false);
						seatnumber[8][3].setResrved(false);
					}
					System.out.println("\nYou delete all the reserved seat succefully :)");
					System.out.println("-------------------------------------------\n");
					break;
				}
				//////////////////////////////////////////////////////////////////////////
				case 4: { //to show a map of seat
					System.out.println("----------------------------------------------");
					System.out.println(" The map of seats: \n");
					if (seatnumber[0][0].isValid() == false) {
						System.out.print("                              ");
						System.out.print("    | Seat 11: Empty(not reserved)");
					} else {
						System.out.print("                              ");
						System.out.print("    | Seat 11: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[0][1].isValid() == false) {
						System.out.println(" | Seat 12: Empty(not reserved) |");
					} else {
						System.out.println(" | Seat 12: Reserved            |");
					}
					System.out.print("                                    ");
					System.out.println("------------------------------------------------------------");
					////////////////////////////////////////////////////////
					if (seatnumber[1][0].isValid() == false) {
						System.out.print("                              ");
						System.out.print("    | Seat 21: Empty(not reserved)");
					} else {
						System.out.print("                              ");
						System.out.print("    | Seat 21: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[1][1].isValid() == false) {
						System.out.println(" | Seat 22: Empty(not reserved) |");
					} else {
						System.out.println(" | Seat 22: Reserved            |");
					}
					System.out.print("                                    ");
					System.out.println("------------------------------------------------------------");
					////////////////////////////////////////////////////////
					if (seatnumber[2][0].isValid() == false) {
						System.out.print("                              ");
						System.out.print("    | Seat 31: Empty(not reserved)");
					} else {
						System.out.print("                              ");
						System.out.print("    | Seat 31: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[2][1].isValid() == false) {
						System.out.println(" | Seat 32: Empty(not reserved) |");
					} else {
						System.out.println(" | Seat 32: Reserved            |");
					}
					System.out.print("     ");
					System.out.println("-------------------------------------------------------"
							+ "-------------------------------------------------------------------");
					////////////////////////////////////////////////////////
					if (seatnumber[3][0].isValid() == false) {
						System.out.print("   | Seat 41: Empty(not reserved)");
					} else {
						System.out.print("   | Seat 41: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[3][1].isValid() == false) {
						System.out.print(" | Seat 42: Empty(not reserved)");
					} else {
						System.out.print(" | Seat 42: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[3][2].isValid() == false) {
						System.out.print(" | Seat 43: Empty(not reserved)");
					} else {
						System.out.print(" | Seat 43: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[3][3].isValid() == false) {
						System.out.println(" | Seat 44: Empty(not reserved) |");
					} else {
						System.out.println(" | Seat 44: Reserved |");
					}
					System.out.print("     ");
					System.out.println("-------------------------------------------------------"
							+ "-------------------------------------------------------------------");
					////////////////////////////////////////////////////////
					if (seatnumber[4][0].isValid() == false) {
						System.out.print("   | Seat 51: Empty(not reserved)");
					} else {
						System.out.print("  | Seat 51: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[4][1].isValid() == false) {
						System.out.print(" | Seat 52: Empty(not reserved)");
					} else {
						System.out.print(" | Seat 52: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[4][2].isValid() == false) {
						System.out.print(" | Seat 53: Empty(not reserved)");
					} else {
						System.out.print(" | Seat 53: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[4][3].isValid() == false) {
						System.out.println(" | Seat 54: Empty(not reserved) |");
					} else {
						System.out.println(" | Seat 54: Reserved |");
					}
					System.out.print("     ");
					System.out.println("-------------------------------------------------------"
							+ "-------------------------------------------------------------------");
					////////////////////////////////////////////////////////
					if (seatnumber[5][0].isValid() == false) {
						System.out.print("   | Seat 61: Empty(not reserved)");
					} else {
						System.out.print("   | Seat 61: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[5][1].isValid() == false) {
						System.out.print(" | Seat 62: Empty(not reserved)");
					} else {
						System.out.print(" | Seat 62: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[5][2].isValid() == false) {
						System.out.print(" | Seat 63: Empty(not reserved)");
					} else {
						System.out.print(" | Seat 63: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[5][3].isValid() == false) {
						System.out.println(" | Seat 64: Empty(not reserved) |");
					} else {
						System.out.println(" | Seat 64: Reserved         | ");
					}
					System.out.print("     ");
					System.out.println("-------------------------------------------------------"
							+ "-------------------------------------------------------------------");
					////////////////////////////////////////////////////////
					if (seatnumber[6][0].isValid() == false) {
						System.out.print("   | Seat 71: Empty(not reserved)");
					} else {
						System.out.print("   | Seat 71: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[6][1].isValid() == false) {
						System.out.print(" | Seat 72: Empty(not reserved)");
					} else {
						System.out.print(" | Seat 72: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[6][2].isValid() == false) {
						System.out.print(" | Seat 73: Empty(not reserved)");
					} else {
						System.out.print(" | Seat 73: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[6][3].isValid() == false) {
						System.out.println(" | Seat 74: Empty(not reserved) |");
					} else {
						System.out.println(" | Seat 74: Reserved |");
					}
					System.out.print("     ");
					System.out.println("-------------------------------------------------------"
							+ "-------------------------------------------------------------------");
					////////////////////////////////////////////////////////
					if (seatnumber[7][0].isValid() == false) {
						System.out.print("   | Seat 81: Empty(not reserved)");
					} else {
						System.out.print("   | Seat 81: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[7][1].isValid() == false) {
						System.out.print(" | Seat 82: Empty(not reserved)");
					} else {
						System.out.print(" | Seat 82: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[7][2].isValid() == false) {
						System.out.print(" | Seat 83: Empty(not reserved)");
					} else {
						System.out.print(" | Seat 83: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[7][3].isValid() == false) {
						System.out.println(" | Seat 84: Empty(not reserved) |");
					} else {
						System.out.println(" | Seat 84: Reserved |");
					}
					System.out.print("     ");
					System.out.println("-------------------------------------------------------"
							+ "-------------------------------------------------------------------");
					////////////////////////////////////////////////////////
					if (seatnumber[8][0].isValid() == false) {
						System.out.print("   | Seat 91: Empty(not reserved)");
					} else {
						System.out.print("   | Seat 91: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[8][1].isValid() == false) {
						System.out.print(" | Seat 92: Empty(not reserved)");
					} else {
						System.out.print(" | Seat 92: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[8][2].isValid() == false) {
						System.out.print(" | Seat 93: Empty(not reserved)");
					} else {
						System.out.print(" | Seat 93: Reserved           ");
					}
					////////////////////////////////////////////////////////
					if (seatnumber[8][3].isValid() == false) {
						System.out.println(" | Seat 94: Empty(not reserved) |");
					} else {
						System.out.println(" | Seat 94: Reserved |");
					}
					System.out.print("   ");
					System.out.println("_______________________________________________________"
							+ "______________________________________________________________________\n");
					////////////////////////////////////////////////////////
					System.out.println("-------------------------------------------\n");
					break;
				}

				}

			}
		}

	}
}
