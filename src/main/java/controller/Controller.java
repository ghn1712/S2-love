package controller;

import spark.Request;
import spark.Response;
import org.json.*;;

public class Controller {

	public static String getMessages(Request req, Response res) {
		JSONObject request = new JSONObject();
		request.put("love", "Nayara");
		request.put("message",
				"N�o sei o que seria de mim sem voc�. Quando nos conhecemos, senti algo diferente por voc�. "
						+ "Mesmo largando voc� no ponto de �nibus (me desculpa, s� mais uma vez). Amar voc� � muito f�cil, voc� � linda, companheira para todas as horas, topa ir para qualquer lugar e sempre se esfor�a para me ver feliz. "
						+ "O mais legal � que voc� consegue me fazer muito feliz, e sempre tento fazer voc� t�o feliz quanto voc� me deixa. "
						+ "Quero realizar seus sonhos, ser pai dos seus 12 filhos, levar todos eles no Allianz Parque e fazer voc� a pessoa mais feliz do mundo, porque voc� merece muito. "
						+ "Sempre que precisar de algo, conte comigo, estarei com voc� em qualquer situa��o, sempre fazendo uma palha�ada para arrancar um sorriso seu, que � a coisa mais linda que existe no mundo. "
						+ "Quero poder acordar e olhar nos seus lindos olhos todos dias, quero dormir abra�ado com voc�, quero secar suas l�grimas quando estiver triste, quero chorar de alegria junto com voc�, quero viajar o mundo com voc�, quero voc�. "
						+ "Sei que fomos feitos um para o outro, sei que ficaremos juntos a vida inteira e sei que voc� � o amor da minha vida. "
						+ "Tamb�m sei que n�o sou bom em escrever, mas fiz tudo de cora��o, espero que goste."
						+ "Te amo muito e te amarei para sempre, mesmo voc� morando longe e querendo ficar mais longe ainda kkkk"
						+ " Quando voltar, casa comigo?");
		request.put("ps", "Sei que voc� est� chorando");
		res.type("application/json");
		res.status(200);
		return request.toString();
	}

}
