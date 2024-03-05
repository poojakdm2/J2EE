package com.jspider.cardekhojdbc.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CarOperations {
	static Scanner sc = new Scanner(System.in);

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static String query;

	private static void openConnection() throws SQLException {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4", "root", "ROOT");
	}

	private static void closeConnection() throws SQLException {
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		if (connection != null) {
			connection.close();
		}
	}

	public void viewAllCars() {
		boolean flag = false;
		try {
			openConnection();
			query = "SELECT * FROM car";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
//			System.out.println("id" + "| " + "name  " + "| " + "model  " + "| " + "brand " + "| " + "fuelType " + "| "
//					+ "color " + "| " + "price ");
			while (resultSet.next()) {
				flag=true;
				System.out.print(resultSet.getInt(1) + " | ");
				System.out.print(resultSet.getString(2) + " | ");
				System.out.print(resultSet.getString(3) + " | ");
				System.out.print(resultSet.getString(4) + " |   ");
				System.out.print(resultSet.getString(5) + "    | ");
				System.out.print(resultSet.getString(6) + " | ");
				System.out.print(resultSet.getDouble(7));
				System.out.println();
			}
			if (!flag) {
				System.out.println("No cars available to display");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void searchByName() {
		boolean flag = false;
//		System.out.println("Available cars: ");
//		viewAllCars();
		System.out.print("Enter the name of the car: ");
		String name = sc.next();

		try {
			openConnection();
			query = "SELECT * FROM car WHERE name = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				flag = true;
				System.out.print(resultSet.getInt(1) + " | ");
				System.out.print(resultSet.getString(2) + " | ");
				System.out.print(resultSet.getString(3) + " | ");
				System.out.print(resultSet.getString(4) + " |   ");
				System.out.print(resultSet.getString(5) + "    | ");
				System.out.print(resultSet.getString(6) + " | ");
				System.out.print(resultSet.getDouble(7));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (!flag) {
			System.out.println("Cars not found with " + name + " name");
		}
	}

	public void searchByBrand() {
		boolean flag = false;
//		System.out.println("Available cars: ");
//		viewAllCars();
		System.out.print("Enter the brand of the car: ");
		String brand = sc.next();
		try {
			openConnection();
			query = "SELECT * FROM car WHERE brand = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, brand);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				flag = true;
				System.out.print(resultSet.getInt(1) + " | ");
				System.out.print(resultSet.getString(2) + " | ");
				System.out.print(resultSet.getString(3) + " | ");
				System.out.print(resultSet.getString(4) + " |   ");
				System.out.print(resultSet.getString(5) + "    | ");
				System.out.print(resultSet.getString(6) + " | ");
				System.out.print(resultSet.getDouble(7));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (!flag) {
			System.out.println("Cars not found");
		}
	}

	public void searchByFuelType() {
		boolean flag = false;
//		System.out.println("Available cars: ");
//		viewAllCars();
		System.out.print("Enter the fuel type of the car ");
		String fuelType = sc.next();
		try {
			openConnection();
			query = "SELECT * FROM car WHERE fuelType = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, fuelType);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				flag = true;
				System.out.print(resultSet.getInt(1) + " | ");
				System.out.print(resultSet.getString(2) + " | ");
				System.out.print(resultSet.getString(3) + " | ");
				System.out.print(resultSet.getString(4) + " |   ");
				System.out.print(resultSet.getString(5) + "    | ");
				System.out.print(resultSet.getString(6) + " | ");
				System.out.print(resultSet.getDouble(7));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (!flag) {
			System.out.println("Cars not found with fuel type " + fuelType);
		}
	}

	public void searchByColor() {
		boolean flag = false;
//		System.out.println("Available cars: ");
//		viewAllCars();
		System.out.print("Enter the color of the car: ");
		String color = sc.next();
		try {
			openConnection();
			query = "SELECT * FROM car WHERE color = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, color);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				flag = true;
				System.out.print(resultSet.getInt(1) + " | ");
				System.out.print(resultSet.getString(2) + " | ");
				System.out.print(resultSet.getString(3) + " | ");
				System.out.print(resultSet.getString(4) + " |   ");
				System.out.print(resultSet.getString(5) + "    | ");
				System.out.print(resultSet.getString(6) + " | ");
				System.out.print(resultSet.getDouble(7));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (!flag) {
			System.out.println("Cars not found with " + color + " color");
		}

	}

	public void searchByPrice() {
		boolean flag = false;
		System.out.print("Enter the minimum price range: ");
		double min = sc.nextDouble();
		System.out.print("Enter the maximum price range: ");
		double max = sc.nextDouble();
		try {
			openConnection();
			query = "SELECT * FROM car WHERE price >= ? AND price <= ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setDouble(1, min);
			preparedStatement.setDouble(2, max);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				flag = true;
				System.out.print(resultSet.getInt(1) + " | ");
				System.out.print(resultSet.getString(2) + " | ");
				System.out.print(resultSet.getString(3) + " | ");
				System.out.print(resultSet.getString(4) + " |   ");
				System.out.print(resultSet.getString(5) + "    | ");
				System.out.print(resultSet.getString(6) + " | ");
				System.out.print(resultSet.getDouble(7));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (!flag) {
			System.out.println("Cars not found in " + min + " to " + max + " range");
		}
	}

	public void addCar() {
		int choice = 0;
		while (true) {
			try {
				System.out.print("How many cars you want to add? ");
				choice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Please enter a valid choice!");
				sc.nextLine();
				continue;
			}
			break;
		}
		try {
			openConnection();
			query = "INSERT INTO car VALUES(?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			if (choice == 0) {
				System.out.println("Please enter a valid number!");
			}
			for (int i = 1; i <= choice; i++) {
				System.out.print("Enter id: ");
				int id = sc.nextInt();
				preparedStatement.setInt(1, id);
				System.out.print("Enter name: ");
				String name = sc.next();
				preparedStatement.setString(2, name);
				System.out.print("Enter model: ");
				String model = sc.next();
				preparedStatement.setString(3, model);
				System.out.print("Enter brand: ");
				String brand = sc.next();
				preparedStatement.setString(4, brand);
				System.out.print("Enter fuel type: ");
				String fuelType = sc.next();
				preparedStatement.setString(5, fuelType);
				System.out.print("Enter color: ");
				String color = sc.next();
				preparedStatement.setString(6, color);
				System.out.print("Enter price: ");
				double price = sc.nextDouble();
				preparedStatement.setDouble(7, price);
				preparedStatement.addBatch();
			}
			int[] res = preparedStatement.executeBatch();
			if (res.length > 0) {
				System.out.println(res.length + " car(s) added successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void removeCar() {
		System.out.println("Available cars: ");
		viewAllCars();
		System.out.print("Which car do you want to remove? Please enter id :");
		int id = sc.nextInt();
		try {
			openConnection();
			query = "DELETE FROM car WHERE id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			int res = preparedStatement.executeUpdate();
			if (res == 1) {
				System.out.println("Car removed successfully..!");
			} else {
				System.out.println("Car with id " + id + " not found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void editCar() {
		int id = 0;
		boolean flag = false;
		System.out.println("Available cars: ");
		viewAllCars();
		while (true) {
			try {
				System.out.print("Which car do you want to edit?\nPlease enter id:");
				id = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Please enter a valid choice!");
				sc.nextLine();
				continue;
			}
			break;
		}
		try {
			openConnection();
			query = "SELECT * FROM car WHERE id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			boolean status = preparedStatement.execute();
			if (status) {
				flag = true;
				System.out.println("what do you want to edit?\n" + "1. name\n" + "2. brand\n" + "3. model\n"
						+ "4. color\n" + "5. price\n" + "6. fuelType");
			}
			int choice3 = sc.nextInt();
			switch (choice3) {
			case 1:
				System.out.print("Please enter new car name: ");
				String name = sc.next();
				try {
					openConnection();
					query = "UPDATE car SET name = ? WHERE id = ?";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1, name);
					preparedStatement.setInt(2, id);
					int res = preparedStatement.executeUpdate();
					if (res == 1) {
						System.out.println("car name edited successfully!");
					} else {
						System.out.println("car not found with name " + name);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						closeConnection();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				break;
			case 2:
				System.out.print("Please enter brand name: ");
				String brand = sc.next();
				try {
					openConnection();
					query = "UPDATE car SET brand = ? WHERE id = ?";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1, brand);
					preparedStatement.setInt(2, id);
					int res = preparedStatement.executeUpdate();
					if (res == 1) {
						System.out.println("brand name edited successfully!");
					} else {
						System.out.println("car not found with brand " + brand);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						closeConnection();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				break;
			case 3:
				System.out.print("Please enter model name: ");
				String model = sc.next();
				try {
					openConnection();
					query = "UPDATE car SET model = ? WHERE id = ?";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1, model);
					preparedStatement.setInt(2, id);
					int res = preparedStatement.executeUpdate();
					if (res == 1) {
						System.out.println("model name edited successfully!");
					} else {
						System.out.println("car not found with model " + model);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						closeConnection();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				break;
			case 4:
				System.out.print("Please enter color name: ");
				String color = sc.next();
				try {
					openConnection();
					query = "UPDATE car SET color = ? WHERE id = ?";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1, color);
					preparedStatement.setInt(2, id);
					int res = preparedStatement.executeUpdate();
					if (res == 1) {
						System.out.println("color name edited successfully!");
					} else {
						System.out.println("car not found with " + color + " color");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						closeConnection();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				break;
			case 5:
				System.out.print("Please enter price: ");
				double price = sc.nextDouble();
				try {
					openConnection();
					query = "UPDATE car SET price = ? WHERE id = ?";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setDouble(1, price);
					preparedStatement.setInt(2, id);
					int res = preparedStatement.executeUpdate();
					if (res == 1) {
						System.out.println("Price edited successfully!");
						;
					} else {
						System.out.println("car not found with " + price + " price");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						closeConnection();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				break;
			case 6:
				System.out.print("Please enter fuel type: ");
				String fuelType = sc.next();
				try {
					openConnection();
					query = "UPDATE car SET fuelType = ? WHERE id = ?";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1, fuelType);
					int res = preparedStatement.executeUpdate();
					if (res == 1) {
						System.out.println("Fuel type edited successfully!");
					} else {
						System.out.println("car not found with fuelType as " + fuelType);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						closeConnection();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				break;
			default:
				System.out.println("Please enter valid input...!");
			}
			flag = true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (!flag) {
			System.out.println("Cars not found..!!");
		}
	}

}
