package edu.dmacc.codedsm.hw18;

import java.util.Objects;

public class Result {

    private Submission submission;
    private String message;

    public Submission getSubmission() {
        return submission;
    }

    public void setSubmission(Submission submission) {
        this.submission = submission;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "submission=" + submission +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Objects.equals(submission, result.submission) &&
                Objects.equals(message, result.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(submission, message);
    }
}
