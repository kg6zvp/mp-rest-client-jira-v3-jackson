package com.atlassian.jira.v3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Details of the statuses being created and their scope.
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class StatusCreateRequest {

	private StatusScope scope;

	/**
	 * Details of the statuses being created.
	 */
	private List<StatusCreate> statuses = new ArrayList<>();
}
