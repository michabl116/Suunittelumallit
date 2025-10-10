package Tehtava21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Fachada que simplifica el acceso a APIs REST.
 * Oculta la lógica de conexión HTTP, lectura de respuesta y análisis JSON.
 */
public class ApiFacade {

    /**
     * Realiza una solicitud HTTP GET a la URL dada, analiza el JSON
     * y devuelve el valor del atributo especificado (soporta atributos anidados).
     *
     * @param urlString URL de la API
     * @param attributePath nombre del atributo (puede ser "value" o "rates.USD")
     * @return valor del atributo como String
     * @throws IOException si la URL es inválida o la solicitud falla
     * @throws IllegalArgumentException si el atributo no se encuentra
     */
    public String getAttributeValueFromJson(String urlString, String attributePath)
            throws IOException, IllegalArgumentException {
        String jsonResponse = getJsonFromApi(urlString);
        return extractAttribute(jsonResponse, attributePath);
    }

    private String getJsonFromApi(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            return response.toString();
        } finally {
            con.disconnect();
        }
    }

    private String extractAttribute(String json, String attributePath) throws IllegalArgumentException {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(json);

            if (attributePath == null || attributePath.isEmpty()) {
                return jsonObject.toJSONString();
            }

            String[] keys = attributePath.split("\\.");
            Object value = jsonObject;

            for (String key : keys) {
                if (!(value instanceof JSONObject)) {
                    throw new IllegalArgumentException("Ruta de atributo '" + attributePath + "' inválida.");
                }
                value = ((JSONObject) value).get(key);
                if (value == null) {
                    throw new IllegalArgumentException("Atributo '" + key + "' no encontrado en el JSON.");
                }
            }

            return value.toString();
        } catch (ParseException e) {
            throw new IllegalArgumentException("Formato JSON inválido.");
        }
    }




}
