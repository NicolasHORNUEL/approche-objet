package fr.diginamic.recensement.entites;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Recensement {

	private Path path;
	private List<String> linesInput = new ArrayList<>();;
	private List<Ville> linesOutput = new ArrayList<>();

	public Recensement(String uRL) throws IOException {
		this.path = Paths.get(uRL);
		this.linesInput = Files.readAllLines(this.path);
		for (int i = 2; i < linesInput.size(); i++) {			
			String line = linesInput.get(i);
			String[] lines = line.split(";");
			int int0 = Integer.parseInt(lines[0]);
			int int5 = Integer.parseInt(lines[5]);
			int int9 = Integer.parseInt(lines[9].replaceAll(" ", ""));	
			this.linesOutput.add(new Ville(int0, lines[1], lines[2], int5, lines[6], int9));
		}
	}

	public Path getPath() {
		return path;
	}

	public void setPath(Path path) {
		this.path = path;
	}

	public List<String> getLinesInput() {
		return linesInput;
	}

	public void setLinesInput(List<String> linesInput) {
		this.linesInput = linesInput;
	}

	public List<Ville> getLinesOutput() {
		return linesOutput;
	}

	public void setLinesOutput(List<Ville> linesOutput) {
		this.linesOutput = linesOutput;
	}
	
	
}
