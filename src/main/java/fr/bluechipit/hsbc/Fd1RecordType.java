package fr.bluechipit.hsbc;

public enum Fd1RecordType {
	RECORD_TYPE_2(2),RECORD_TYPE_16(16),RECORD_TYPE_116(16),RECORD_TYPE_306(306);
	private int id;
	Fd1RecordType(int id){
		this.id=id;
	}
}
