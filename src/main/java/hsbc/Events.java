package hsbc;

import java.sql.Date;

public class Events {
	
	private Fd1RecordType type;
	private boolean cancel;
	private Date cobDate;
	private Date asofTradeDate;
	
	public Events() {
		super();
	}
	
	public Fd1RecordType getType() {
		return type;
	}
	public void setType(Fd1RecordType type) {
		this.type = type;
	}
	public boolean isCancel() {
		return cancel;
	}
	public void setCancel(boolean cancel) {
		this.cancel = cancel;
	}
	public Date getCobDate() {
		return cobDate;
	}
	public void setCobDate(Date cobDate) {
		this.cobDate = cobDate;
	}
	public Date getAsofTradeDate() {
		return asofTradeDate;
	}
	public void setAsofTradeDate(Date asofTradeDate) {
		this.asofTradeDate = asofTradeDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Events other = (Events) obj;
		if (type != other.type)
			return false;
		return true;
	}
	
}
