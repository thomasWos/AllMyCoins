package com.allmycoins.balance.elrond;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class ElrondDelegationJson {

	private BigDecimal userUnBondable;
	private BigDecimal userActiveStake;
	private BigDecimal claimableRewards;
	private UserUndelegatedJson[] userUndelegatedList;

	public BigDecimal getClaimableRewards() {
		return claimableRewards;
	}

	public BigDecimal getUserActiveStake() {
		return userActiveStake;
	}

	public BigDecimal getUserUnBondable() {
		return userUnBondable;
	}

	public UserUndelegatedJson[] getUserUndelegatedList() {
		return userUndelegatedList;
	}

}
