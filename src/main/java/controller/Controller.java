package controller;

import spark.Request;
import spark.Response;
import org.json.*;;

public class Controller {

	public static String getMessages(Request req, Response res) {
		JSONObject request = new JSONObject();
		request.put("love", "Nayara");
		request.put("message",
				"Não sei o que seria de mim sem você. Quando nos conhecemos, senti algo diferente por você. "
						+ "Mesmo largando você no ponto de ônibus (me desculpa, só mais uma vez). Amar você é muito fácil, você é linda, companheira para todas as horas, topa ir para qualquer lugar e sempre se esforça para me ver feliz. "
						+ "O mais legal é que você consegue me fazer muito feliz, e sempre tento fazer você tão feliz quanto você me deixa. "
						+ "Quero realizar seus sonhos, ser pai dos seus 12 filhos, levar todos eles no Allianz Parque e fazer você a pessoa mais feliz do mundo, porque você merece muito. "
						+ "Sempre que precisar de algo, conte comigo, estarei com você em qualquer situação, sempre fazendo uma palhaçada para arrancar um sorriso seu, que é a coisa mais linda que existe no mundo. "
						+ "Quero poder acordar e olhar nos seus lindos olhos todos dias, quero dormir abraçado com você, quero secar suas lágrimas quando estiver triste, quero chorar de alegria junto com você, quero viajar o mundo com você, quero você. "
						+ "Sei que fomos feitos um para o outro, sei que ficaremos juntos a vida inteira e sei que você é o amor da minha vida. "
						+ "Também sei que não sou bom em escrever, mas fiz tudo de coração, espero que goste."
						+ "Te amo muito e te amarei para sempre, mesmo você morando longe e querendo ficar mais longe ainda kkkk"
						+ " Quando voltar, casa comigo?");
		request.put("ps", "Sei que você está chorando");
		res.type("application/json");
		res.status(200);
		return request.toString();
	}

}
