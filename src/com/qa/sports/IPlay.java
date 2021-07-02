package com.qa.sports;

public interface IPlay {

	  void start();

	  // Signals a pause in the game
	  void pause();

	  // Signals game will resume
	  void resume();

	  // Signals the game to stop and returns time elapsed in seconds
	  int stop();
}
