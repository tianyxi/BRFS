package com.bonree.brfs.duplication.datastream.handler;

public class ReadDataMessage {
	private int sequence;
	private String fid;

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}
}