import java.util.*;

public class RegistroMuestrasBiotecnologia {
    public static void main(String[]args) {
        //Array
        ArrayList<String> listaMuestras = new ArrayList<>();
        listaMuestras.add("Homo sapiens");
        listaMuestras.add("Mus musculus");
        listaMuestras.add("Arabidopsis thaliana");
        listaMuestras.add("Homo sapiens");

        // HashSet
        HashSet<String> especiesUnicas = new HashSet<>(listaMuestras);

        // HashMap
        HashMap<String, String> idInvestigador = new HashMap<>();
        idInvestigador.put("M-001", "Dr. Terashima");
        idInvestigador.put("M-002", "Dr. Stone");
        idInvestigador.put("M-003", "Dr. Doom");

        // List
        System.out.println("\n Sample order by arrival");
        for (String muestra : listaMuestras) {
            System.out.println("- " + muestra);
        }

        // Unique
        System.out.println("\n Processed unique samples: ");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        // Id and Researcher
        System.out.println("\n Sample ID and Principal Researcher: ");
        for (String id : idInvestigador.keySet()) {
            System.out.println(id + " -> " + idInvestigador.get(id));
        }

        // id + sample
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Input sample Id to identify the researcher: ");
        String idBusqueda = sc.nextLine();

        if (idInvestigador.containsKey(idBusqueda)) {
            System.out.println("Researcher: " + idInvestigador.get(idBusqueda));
        }
        else {
            System.out.println("Sample Id not found.");
        }
        sc.close();

    }
}