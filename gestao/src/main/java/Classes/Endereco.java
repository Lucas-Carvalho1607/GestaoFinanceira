package Classes;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

import Enum.UnidadeFederal;


public class Endereco {
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String localidade; //cidade
    private String uf;

    public Endereco() {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public static Endereco getEnderecoByCep(String cep){
        Endereco endereco = new Endereco();

        //Mandar o cep para o viaCep
        HttpGet request = new HttpGet("https://viacep.com.br/ws/"+ cep +"/json/");

        try(
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            CloseableHttpResponse response = httpClient.execute(request);
        ) {
            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity);
            System.out.println(result);

            Gson gson = new Gson();
            endereco = gson.fromJson(result, Endereco.class);
            endereco.setComplemento(null);
            System.out.println(endereco);

        } catch (Exception e){
            e.printStackTrace();
        }

        //Tratar a resposta do via cep

        //montar o meu Endereco endereco

        return endereco;
    }
}
