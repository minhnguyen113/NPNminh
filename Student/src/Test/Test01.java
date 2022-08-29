package Test;

import java.util.Scanner;
public class Test01 {
	
		private String name;
		private char gender;

		public Test01() {
			name = "Unknown";
			gender = 'u';
		}

		public Test01(String name) {
			this.name = name;
			this.gender = 'u';
		}

		public Test01(char gender) {
			this.name = "Unknown";
			this.gender = gender;
		}

		public Test01(String name, char gender) {
			this.name = name;
			this.gender = gender;
		}

		public void display() {
			System.out.println("Name: " + name);
			if (gender == 'u') {
				System.out.println("Gender: Unknown");
			}
			if (gender == 'm') {
				System.out.println("Gender: Male");
			}
			if (gender == 'f') {
				System.out.println("Gender: Female");
			}
		}
	}


