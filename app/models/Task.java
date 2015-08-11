package models;

import java.util.List;

import play.db.jpa.Model;

public class Task extends Model{
	int id;
	String title;
	String content;
	String description;
	List<User> owner;
}
