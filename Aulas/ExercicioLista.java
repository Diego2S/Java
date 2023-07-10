
import Entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class ExercicioLista {
    public static void main(String[] args) {

        //List <String> result = list.stream().filter(x -> x.charAt(0).collect(Collectors.toList());
        //List <String> result = list.stream().filter(x -> x.charAt(0).findFirst().orElse(null);
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        System.out.println("How many Employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0 ;i<n; i++){
            System.out.println("Emploee #"+(i+1)+":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list,id)){
                System.out.println("Id has been using, take another:");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id,name,salary);

            list.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int index = sc.nextInt();

        Employee pos = list.stream().filter(x -> x.getId() == index).findFirst().orElse(null);

        if(pos == null){
            System.out.println("This id does not exist!");

        }else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            //list.get(pos.getId()).increaseSalaryPercentade(percentage);
            pos.increaseSalaryPercentade(percentage);
        }

        System.out.println("List of employees:");
        for (Employee x: list){
            System.out.println(x);
        }


        sc.close();


    }
    public static boolean hasId(List<Employee> list, int id){
        for (int i =0; i<list.size();i++){
            if(list.get(i).getId() ==id){
                return true;
            }
        }
        return false;
    }

}
