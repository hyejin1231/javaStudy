package org.example.ch11;

import java.util.HashMap;
import java.util.Scanner;

/**
 * ch11. HashMap (2)
 */
public class Ex11_19
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner scanner = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("id와 password를 입력해주세요. ");
			System.out.print("id : ");
			String id = scanner.nextLine().trim();
			
			System.out.print("password : ");
			String password = scanner.nextLine().trim();
			
			if (!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}
			
			if (!(map.get(id).equals(password))) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			}else{
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		}
		
	}
}
