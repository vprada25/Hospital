/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.Scanner;

/**
 *
 * @author victo
 */

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HospitalCola h1 = new HospitalCola("Hospital San Jorge", 5, 1);
        HospitalCola h2 = new HospitalCola("Hospital San Victor", 2, 2);
        HospitalCola h3 = new HospitalCola("Hospital San Rene", 3, 3);
        HospitalCola h4 = new HospitalCola("Hospital San Judas", 4, 1);
        HospitalCola h5 = new HospitalCola("Hospital San Muerte", 1, 2);
        Arbol hospital = new Arbol();
        hospital.insertar(h1);
        hospital.insertar(h2);
        hospital.insertar(h3);
        hospital.insertar(h4);
        hospital.insertar(h5);
        boolean menu = true;
        while (menu) {
            System.out.println("\t\t\t" + "HOSPITALES" + "\t\t\t\n");
            System.out.println("1. Mostrar Hospitales");
            System.out.println("2. Entrar a Hospitales");
            System.out.println("3. Registrar Hospital");
//           System.out.println("4. Eliminar Hospital");
            System.out.println("5. Desea Salir");

            int op2 = sc.nextInt();
            switch (op2) {
                case 1:
                    System.out.println(hospital.inOrden());
                    //System.out.println(hospital.posOrden());
                    //System.out.println(hospital.preOrden());
                    break;
                case 2:
                    System.out.println("Digite el id del hospital al que desea ingresar: ");
                    int hos = sc.nextInt();
                    System.out.println(hospital.inOrden());
                    Nodo tmp = hospital.buscar(hos);

                    int op;
                    boolean menu2 = true;
                    while (menu2) {
                        System.out.println("\t\t\t" + "MENU" + "\t\t\t\n");
                        System.out.println("1. Ingresar paciente");
                        System.out.println("2. Atender paciente");
                        System.out.println("3. Mostrar el primer paciente");
                        System.out.println("4. Mostrar el ultimo paciente");
                        System.out.println("5. ¿hay pacientes?");
                        System.out.println("6. Cuantos pacientes ingresaron ?");
                        System.out.println("7. Mostrar todos los pacientes");
                        System.out.println("8. Borrar todos los pacientes");
                        System.out.println("9. Salir");
                        System.out.println("Ingresa Una Opcion Para Continuar");
                        op = sc.nextInt();
                        switch (op) {
                            case 1:
                                System.out.println("Digite la cedula del paciente");
                                int c = sc.nextInt();
                                System.out.println("Digite el nombre del paciente");
                                String n = sc.next();
                                System.out.println("Tipo de atencion");
                                sc.nextLine();
                                String ta = sc.nextLine();
                                tmp.info.IngresarPaciente(c, n, ta);
                                break;
                            case 2:
                                System.out.println("El paciente a atender es: " + tmp.info.atenderPaciente());
                                break;
                            case 3:
                                System.out.println("El primer paciente es:" + tmp.info.PrimerPaciente());
                                break;
                            case 4:
                                System.out.println("El ultimo paciente es: " + tmp.info.UltimoPaciente());
                                break;
                            case 5:
                                if (tmp.info.vacia() == true) {
                                    System.out.println("No existen pacientes");
                                } else {
                                    System.out.println("Existen pacientes");
                                }
                                break;
                            case 6:
                                System.out.println("La cantidad de pacientes es: " + tmp.info.TamaCola());
                                break;
                            case 7:
                                System.out.println("Los pacientes son: " + tmp.info.MostrarPacientes());
                                break;
                            case 8:
                                tmp.info.Vaciar();
                                System.out.println("Se eliminaron todos los pacientes ");
                                break;
                            case 9:
                                System.out.println("Saliendo");
                                menu2 = false;
                                break;
                            default:
                                System.out.println("Error no existe la opcion");
                                break;

                        }
                    }
                    tmp = null;
                    break;
                case 3:

                    System.out.println("Digite el id del hospital: ");
                    int id = sc.nextInt();
                    System.out.println("Digite el nivel del hospital: ");
                    int ni = sc.nextInt();
                    System.out.println("Digite el nombre del hospital: ");
                    sc.nextLine();
                    String n = sc.nextLine();
                    hospital.insertar(new HospitalCola(n, id, ni));
                    break;

                case 4:
//                    System.out.println(hospital.inOrden());
//                    System.out.println("Digite el id del hospital a eliminar:");
//                    int eli=sc.nextInt();
//                    hospital.eliminar(eli);
                    break;
                case 5:
                    menu = false;
                    break;

            }

        }

    }

}
