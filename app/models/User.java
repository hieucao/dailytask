package models;

import play.db.jpa.Model;

public class User extends Model {
	int id;
	String code;
	String name;
}
