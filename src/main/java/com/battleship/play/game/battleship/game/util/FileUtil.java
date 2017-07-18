package com.battleship.play.game.battleship.game.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

	public static String[] readFileByLine(String filePath) {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(filePath));
			String str;

			List<String> list = new ArrayList<String>();
			while ((str = in.readLine()) != null) {
				list.add(str);
			}
			String[] stringArr = list.toArray(new String[0]);
			in.close();
			return stringArr;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

}
