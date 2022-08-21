package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome do departamento: ");
		String name = sc.nextLine();
		System.out.println("Dia do pagamento: ");
		int payday = sc.nextInt();
		System.out.println("Email: ");
		sc.nextLine();
		String email = sc.nextLine();
		System.out.println("Telefone: ");
		String phone = sc.nextLine();
		System.out.println("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();

		Department dept = new Department(name, payday, new Address(email, phone));

		for (int i = 1; i <= n; i++) {

			System.out.println("Dados do funcionário " + i + ": ");
			System.out.print("Nome: ");
			sc.nextLine();
			String employeeName = sc.nextLine();
			System.out.print("salário: ");
			double salary = sc.nextDouble();

			dept.addEmployee(new Employee(employeeName, salary));
		}

		showReport(dept);

		sc.close();
	}

	private static void showReport(Department dept) {

		System.out.println("FOLHA DE PAGAMENTO:");
		System.out.println("Departamento Vendas = R$ " + dept.payroll());
		System.out.println("Pagamento realizado no dia " + dept.getPayday());
		System.out.println("Vendedores:");
		dept.emplooyesName();
		System.out.println("Para dúvidas favor entrar em contato: " + dept.getAddress().getEmail());

	}

}
