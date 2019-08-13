package ExJSON;

public class Exemplo {

	public static List<Pessoa> importJSON(Pessoa p) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/persistence/pessoa.json"));
        Type listType = new TypeToken<ArrayList<Pessoa>>() {
        }.getType();
        List<Pessoa> lista;
        lista = new Gson().fromJson(bufferedReader, listType);
        return lista != null ? lista : new ArrayList<>();
    }

    public static <T> void exportJSON(String file, List<T> lista) {
        GsonBuilder gBuilder = new GsonBuilder();
        Gson gson = gBuilder.create();
        FileWriter writer;
        List<T> list = new ArrayList<>();
        list.addAll(lista);
        try {
            writer = new FileWriter("src/persistence/" + file + ".json");
            writer.write(gson.toJson(list));
            writer.close();
        } catch (IOException e1) {
            System.err.println(e1.getMessage());
        }
    }
	

}
