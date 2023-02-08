package aula.pratica.programacao.web.exceptions;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class StandardError implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Instant timestamp;
	private String status;
	private boolean error;
	private String message;
	private String path;
	
	public StandardError() {}
	
	public StandardError(
			Instant timestamp, 
			String status, 
			boolean error, 
			String message, 
			String path) {
		this.timestamp = Objects.requireNonNull(timestamp, "timestamp must not be null");
		this.status = Objects.requireNonNull(status, "status must not be null");
		this.error = error;
		this.message = Objects.requireNonNull(message, "message must not be null");
		this.path = Objects.requireNonNull(path, "path must not be null");
	}

	public Instant getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Instant timestamp) {
		this.timestamp = Objects.requireNonNull(timestamp, "timestamp must not be null");
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = Objects.requireNonNull(status, "status must not be null");
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}
