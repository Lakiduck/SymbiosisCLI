package com.cli.symbiosis;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class SymbiosisCliApplication {

	public static void main(String[] args) {
		SpringApplication.run(SymbiosisCliApplication.class, args);
	}

}

@Service
class DataService {
;
	private ArrayList<String[]> data = new ArrayList<>();

	void addItem(String material, String quantity) {
		final String[] dataRecord = {material,quantity};
		this.data.add(dataRecord);
	}

	ArrayList<String[]> getAllItems() {
		return data;
	}
}


@ShellComponent
record SymbiosisCommands ( DataService service ) {

	@ShellMethod ("put-data")
	public void putData (String material, String quantity) {
		this.service.addItem(material, quantity);
	}

	@ShellMethod ("get-data")
	public void getData () {
		ArrayList<String[]> items = this.service.getAllItems();
		for(String[] i : items){
			System.out.println(Arrays.toString(i));
		}
	}


}

