package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.QuestionsAnswers;

public class QuestionsAnswersTest {
	
	QuestionsAnswers questionsAnswers;
	
	@Before
	public void initialize() {
		questionsAnswers = new QuestionsAnswers();
	}

	@Test
	public void questionsAnswers_whenInitialization_shouldGiveSizeZero() {
		
		assertEquals(questionsAnswers.getSize(), 0);
	}
	
	@Test
	public void put_whenGivenQuestionAndAnswer_shouldIncreaseHashMapsSize() {
		// Given
		String question = "Are you hungry?";
		String answer = "Yes";
		
		assertEquals(questionsAnswers.getSize(), 0);
		
		// When
		questionsAnswers.put(question,answer);
		
		// Then
		assertEquals(questionsAnswers.getSize(), 1);
	}

}
