package database;

import java.util.concurrent.ConcurrentHashMap;

import model.Center;
import model.Member;

public class Database {
	public static ConcurrentHashMap<Integer, Center> centerTable = new ConcurrentHashMap<>();
	public static ConcurrentHashMap<Integer, Member> memberTable = new ConcurrentHashMap<>();
}
