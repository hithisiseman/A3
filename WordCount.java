package i190655_A3;

public class WordCount {
	
		private String word;
		private int frequency;
		
		public WordCount ()
		{
			word=null;
			frequency=0;
		}
		
		public WordCount (String w,int f)
		{
			this.word=w;
			this.frequency=f;
		}
		
		public String getWord() {
			
			return word;
		}
		
		public void setWord(String word) {
			
			this.word = word;
		}
		
		public int getFrequency() {
			
			return frequency;
		}
		
		public void setFrequency(int f) {
			
			this.frequency = f;
		}

}
