package util;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class SettingUtil {
	private ReadSettings rs = new ReadSettings();

	public void execute() {
		printProperties();
		char ch = Util.getChar("変更しますか? (y/n) > ");
		if (ch == 'y') {
			saveProperties();
		}
	}
	
	public void printProperties() {
		System.out.println("現在の設定");
		System.out.println("1. マップの行数:" + rs.YSIZE);
		System.out.println("2. マップの列数:" + rs.XSIZE);
		System.out.println("3. ゴブリンの数:" + rs.NUM_GOBLIN);
		System.out.println("4. スライムの数:" + rs.NUM_SLIME);
		System.out.println("5. ポーションの数:" + rs.NUM_POTION);
		System.out.println("6. プレイヤーに名前:" + rs.NAME);
	}
	
	public void saveProperties() {
		String ysize = "" + Util.getChar("マップの行数 > ");
		String xsize = "" + Util.getChar("マップの列数 > ");
		String goblin = "" + Util.getChar("コゴブリンの数 > ");
		String slime = "" + Util.getChar("スライムの数 > ");
		String potion = "" + Util.getChar("ポーションの数 > ");
		System.out.print("プレイヤーに名前 > ");
		String name = new java.util.Scanner(System.in).nextLine();

		Properties prop = new Properties();
		prop.setProperty("ysize", ysize);
		prop.setProperty("xsize", xsize);
		prop.setProperty("goblin", goblin);
		prop.setProperty("slime", slime);
		prop.setProperty("potion", potion);
		prop.setProperty("name", name);
		
		try (Writer writer = new OutputStreamWriter(
				new FileOutputStream("player.properties"), StandardCharsets.UTF_8)) {
			prop.store(writer, "Player Settings");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("設定を保存しました");
		
	}

}
