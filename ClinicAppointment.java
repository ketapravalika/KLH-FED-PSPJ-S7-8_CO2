import java.util.Scanner;

public class ClinicAppointment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String patientName;
        String doctorName;
        String appointmentDate;
        int age;
        int choice;
        int medicineCount;

        // Patient details
        System.out.print("Enter patient name: ");
        patientName = sc.nextLine();

        System.out.print("Enter patient age: ");
        age = sc.nextInt();
        sc.nextLine();

        // Doctor details
        System.out.print("Enter doctor name: ");
        doctorName = sc.nextLine();

        // Appointment date
        System.out.print("Enter appointment date: ");
        appointmentDate = sc.nextLine();

        // Appointment confirmation
        System.out.print("Confirm appointment? (1-Yes / 2-No): ");
        choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            System.out.print("Enter number of medicines: ");
            medicineCount = sc.nextInt();
            sc.nextLine();

            // Array to store medicines
            String[] medicines = new String[medicineCount];

            // Loop to enter medicines
            for (int i = 0; i < medicineCount; i++) {
                System.out.print("Enter medicine " + (i + 1) + ": ");
                medicines[i] = sc.nextLine();
            }

            // Display complete details
            System.out.println("\n--- Clinic Appointment Details ---");
            System.out.println("Patient Name: " + patientName);
            System.out.println("Age: " + age);
            System.out.println("Doctor Name: " + doctorName);
            System.out.println("Appointment Date: " + appointmentDate);
            System.out.println("Appointment Confirmed: Yes");

            System.out.println("\nMedicines:");

            for (int i = 0; i < medicineCount; i++) {
                System.out.println((i + 1) + ") " + medicines[i]);
            }

            System.out.println("\nPrescription Successful!");

        } else if (choice == 2) {

            System.out.println("\nAppointment Confirmed: No");

        } else {

            System.out.println("\nInvalid Choice!");
        }

        sc.close();
    }
}