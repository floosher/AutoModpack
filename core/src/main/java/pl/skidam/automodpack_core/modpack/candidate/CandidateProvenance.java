package pl.skidam.automodpack_core.modpack.candidate;

public record CandidateProvenance(CandidateSource selectedSource, String editableRule, String forceCopyRule) {
	public CandidateProvenance(CandidateSource selectedSource, String editableRule) {
		this(selectedSource, editableRule, null);
	}
}
