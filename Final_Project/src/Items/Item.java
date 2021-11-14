package Items;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Item {//Our Manageable
	public abstract void read(Scanner scan);
	public abstract void setData(Scanner scan);
	public abstract boolean match(String kwd);
	
	public void modify() {
		
	}
	
	public void print() {
		System.out.printf("%-20s	| %d | %.1f | %d | ", name,time,grade,rating);
		for(int i=0;i<category.size();i++){
			if(i==(category.size()-1)) {
				System.out.printf("%s",category.get(i).name());	
			}
			else {
				System.out.printf("%s,",category.get(i).name());	
			}
		}
		System.out.printf("| %s |",summary);	
	}
	
	public enum Category {
		THRILLER, ACTION, ROMANCE, SF, COMEDY, HORROR, FANTASY, DOCUMENTARY, LIFESTYLE,VARIETY_SHOW, TRAVEL
	}
	public Category stringToCategory(String kwd) {
		
		return Category.valueOf(kwd);
	}

	public boolean hasCategory(Category type) {
		for(Category c: category) {
			if(c.equals(type)) {
				return true;
			}
		}
		return false;
	}
	
	public String getName() {
		return name;	
	}
	public int getTime() {
		return time;	
	}
	public float getGrade() {
		return grade;	
	}
	 
	public int getRating(){ 
		return rating;
	}
	
	protected String name;
	protected int time;
	protected float grade;
	protected int rating;//관람등급
	protected ArrayList<Category> category = new ArrayList<Category>(); 
	protected String summary;
}

