module loginregisterForgotpass {
	exports login.main;
	exports login.service;
	exports loginregister.controller;
	exports login.dao;
	exports login.dto;
	exports login.url;

	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
}