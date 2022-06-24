package day6;

import java.util.Scanner;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class Day6_problems {
	/*
	 * creating variables and methods for stopwatch program
	 */
	long end, begin, elapsed;

	public void run() {
		begin = System.nanoTime();
	}

	public void stop() {
		end = System.nanoTime();
		elapsed = end - begin;
		double seconds = (double) elapsed / 1000000000;
		System.out.println("the elapsed time is : " + seconds + "seconds");
	}

	public static void main(String[] args) {
		/*
		 * Fibonacci series
		 */
		int a = 0, b = 1;
		int temp;
		for (int i = 0; i <= 5; i++) {
			System.out.println(+a);
			temp = a + b;
			a = b;
			b = temp;

		}

		/*
		 * Program for perfect number
		 */
		int i = 1;
		int s = 0;
		System.out.println("Enter the no for checking perfect number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (i < n) {
			if (n % i == 0) {
				s += i;
			}
			i++;
		}
		if (s == n) {
			System.out.println(n + " is a perfect number");
		} else {
			System.out.println(n + " is not a perfect number");
		}

		/*
		 * Prime number
		 */
		int c = 0;
		System.out.println("Enter a no to check if it is prime");
		int n1 = sc.nextInt();
		for (int j = 1; j <= n1; j++) {
			if (n1 % j == 0) {
				c += 1;
			}
		}
		if (c < 3) {
			System.out.println(n1 + " is prime");
		} else {
			System.out.println(n1 + " is not a prime");
		}
		/*
		 * Reverse a number
		 */
		int rev = 0;
		int c1;
		System.out.println("Enter the number to reverse");
		int n2 = sc.nextInt();
		while (n2 != 0) {
			c1 = n2 % 10;
			rev = rev * 10 + c1;
			n2 = n2 / 10;
		}
		System.out.println("the reveresed number is :" + rev);

		/*
		 * Coupon numbers
		 */
		boolean flag = false;
		int count = 0;
		System.out.println("Enter the no of coupon numbers");
		int n3 = sc.nextInt();
		int[] arr = new int[n3];
		for (int i1 = 0; i1 < n3; i1++) {
			arr[i1] = sc.nextInt();
		}
		while (flag != true) {
			int c2 = (int) (Math.floor(Math.random() * 100) % 100 + 1);
			System.out.println(+c2);
			count += 1;
			for (int i1 = 0; i1 < n3; i1++) {
				if (arr[i1] == c2) {
					flag = true;
					break;
				}
			}
		}
		System.out.println("It took " + count + " random numbers to match with one of the coupon numbers");

		/*
		 * stopwatch
		 */
		Day6_problems u = new Day6_problems();
		JFrame myJFrame = new JFrame();

		myJFrame.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_UP) {
					System.out.println("starting the timer");
					u.run();
				} else if (key == KeyEvent.VK_DOWN) {
					System.out.println("Timer is stopped");
					u.stop();
				}
			}
		});

		myJFrame.setVisible(true);
	}

}
