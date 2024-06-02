package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	HashMap<String,String> dictionary = new HashMap<String,String>();
	
//	コントラスタで辞書に追加
	
	Dictionary_Chapter21(){
		
		dictionary.put ("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウイ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
		
	};
	
	
//	参照のため文字を入力して検索するメソッド
	
	public void search (String word) {
			
			String answer = dictionary.get(word);
			
			if(answer == null) {
				System.out.println(word + "は辞書に存在しません");
				return;
			}else {
				System.out.println(word + "の意味は" + dictionary.get(word));
			}
			
			
			
			
			
			
			
		}
}
	

