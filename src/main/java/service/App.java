package service;
import static spark.Spark.*;

import controller.Controller;

public class App {
	public static void main(String[] args) {
		get("/messages", (req, res) -> Controller.getMessages(req, res));
	}
}
