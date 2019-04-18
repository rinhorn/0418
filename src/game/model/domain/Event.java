package game.model.domain;

public class Event {
	private int event_id;
	private int discount;
	private String event_name, event_icon, event_img;
	private int game_id;
	
	int getEvent_id() {
		return event_id;
	}
	void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	int getDiscount() {
		return discount;
	}
	void setDiscount(int discount) {
		this.discount = discount;
	}
	String getEvent_name() {
		return event_name;
	}
	void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	String getEvent_icon() {
		return event_icon;
	}
	void setEvent_icon(String event_icon) {
		this.event_icon = event_icon;
	}
	String getEvent_img() {
		return event_img;
	}
	void setEvent_img(String event_img) {
		this.event_img = event_img;
	}
	int getGame_id() {
		return game_id;
	}
	void setGame_id(int game_id) {
		this.game_id = game_id;
	}
	
}